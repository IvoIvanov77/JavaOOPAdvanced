package e_reflection.exersise.pr0304Barracks.core;

import e_reflection.exersise.pr0304Barracks.anotations.Inject;
import e_reflection.exersise.pr0304Barracks.contracts.Executable;
import e_reflection.exersise.pr0304Barracks.contracts.Repository;
import e_reflection.exersise.pr0304Barracks.contracts.Runnable;
import e_reflection.exersise.pr0304Barracks.contracts.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpredCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (ReflectiveOperationException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpredCommand(String[] data, String commandName) throws ReflectiveOperationException {



//	    if("fight".equals(commandName)){
//	        return this.fightCommand(data);
//        }
		String className = Character.toUpperCase(commandName.charAt(0)) + commandName.substring(1) + "Command";
		String path = "f_reflection.exersise.pr0304Barracks.core.commands.";
        Class<Executable> cl = null;
		try{
            cl = (Class<Executable>) Class.forName(path + className);
        }catch (ClassNotFoundException cnfe){
		    return "Invalid command!";
        }

        Constructor<Executable> constructor = cl.getDeclaredConstructor(String[].class);

        constructor.setAccessible(true);
        Executable command =  constructor.newInstance((Object) data);

        this.injectDependencies(command,cl);
        String result = command.execute();
		return result;
	}

	private void injectDependencies(Executable command, Class<Executable> exeClass) throws ReflectiveOperationException {

		Field[] exeFields = exeClass.getDeclaredFields();
		for (Field exeField : exeFields) {
			if(!exeField.isAnnotationPresent(Inject.class)){
				continue;
			}
			exeField.setAccessible(true);

			Field[] theseFields = Engine.class.getDeclaredFields();
			for (Field thisField : theseFields) {
				if(!thisField.getType().equals(exeField.getType())){
					continue;
				}
				thisField.setAccessible(true);
				exeField.set(command, thisField.get(this));
			}
		}
	}


}

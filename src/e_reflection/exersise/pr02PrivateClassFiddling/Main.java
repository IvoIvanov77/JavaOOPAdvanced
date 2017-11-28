package e_reflection.exersise.pr02PrivateClassFiddling;

import e_reflection.exersise.pr02PrivateClassFiddling.com.peshoslav.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException, IOException, NoSuchFieldException, ClassNotFoundException {

		Class cl = BlackBoxInt.class;
        Constructor constructor = cl.getDeclaredConstructor();
        constructor.setAccessible(true);

        BlackBoxInt boxInt = (BlackBoxInt) constructor.newInstance();


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true){
            if("END".equalsIgnoreCase(line = reader.readLine())){
                break;
            }
            String[] input = line.split("_");
            String methodName = input[0];
            int number = Integer.parseInt(input[1]);
            Method method = cl.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(boxInt, number);

            Field field = cl.getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.get(boxInt));
        }






	}
}

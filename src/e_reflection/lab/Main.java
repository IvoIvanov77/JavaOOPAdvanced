package e_reflection.lab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class aClass = Reflection.class;

        checkEncapsulation(aClass);
        printGettersAndSetters(aClass);
        reflection(aClass);
    }

    private static void checkEncapsulation(Class aClass) {
        //check fields
        Arrays.stream(aClass.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .forEach(field -> {
                    if(!Modifier.isPrivate(field.getModifiers())){
                        System.out.println(field.getName() + " must be be private!");
                    }
                });

        // check getters
        Arrays.stream(aClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("get") && method.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> {
                    if(!Modifier.isPublic(method.getModifiers())){
                        System.out.println(method.getName() + " have to be public!");
                    }
                });

        //check setters
        Arrays.stream(aClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> {
                    if(!Modifier.isPrivate(method.getModifiers())){
                        System.out.println(method.getName() + " have to be private!");
                    }
                });
    }

    private static void printGettersAndSetters(Class aClass) {
        Arrays.stream(aClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("get") && method.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(String.format("%s will return %s",
                        method.getName(), method.getReturnType())));

        Arrays.stream(aClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("set") && method.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(String.format("%s and will set field of %s",
                        method.getName(), method.getParameterTypes()[0])));
    }


    private static void reflection(Class aClass) throws InstantiationException, IllegalAccessException {
        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());
        Class[] interfaces = aClass.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Reflection reflection = (Reflection) aClass.newInstance();
        System.out.println(reflection);
    }
}

package e_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Utils {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {


//        If you know the name
        Class myClass = Test.class;

//        If you don't know the name at compile time
        Class cl = Class.forName("e_reflection.Test");

        String className = cl.getName();

        String simpleClassName = cl.getSimpleName();

        Class superClassName = cl.getSuperclass();

        Class[] interfaces = cl.getInterfaces();

//        Test test = (Test) cl.newInstance();

        Constructor[] ctors = cl.getConstructors();
        System.out.println(Arrays.toString(ctors));

        Constructor[] ctors1 = cl.getDeclaredConstructors();
        System.out.println(Arrays.toString(ctors1));

        Constructor ctor = cl.getConstructor(String.class);
//        ctor.setAccessible(true);
        System.out.println(ctor);

        Constructor other = cl.getDeclaredConstructor();
        System.out.println(other);

        Constructor another = cl.getEnclosingConstructor();
        System.out.println(another);

        Class[] parameterTypes = ctor.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));

        Constructor constructor = Test.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        SuperTest test1 = (SuperTest) constructor.newInstance("pesho");
        System.out.println(test1);

//        Field field = cl.getField("superTestField");
        Field subField = cl.getDeclaredField("testField");
//        System.out.println(field.getName());
        System.out.println(subField.getName());
        Field[] fields = cl.getFields();
        System.out.println(Arrays.toString(fields));

        Field[] allFields = cl.getDeclaredFields();
        System.out.println(Arrays.toString(allFields));

//        Setting value for field
        Class aClass = Test.class;
        Field field = aClass.getDeclaredField("testField");
        field.setAccessible(true);
        Test objectInstance = new Test("super");
        Object value = field.get(objectInstance);
        System.out.println(value);
        field.set(objectInstance, "Anything");
        System.out.println(objectInstance);
        System.out.println(field);




    }
}

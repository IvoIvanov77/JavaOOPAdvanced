package d_enumerations_and_anotations.lab.coding_tracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {

    @Author(name = "Ivaylo")
    public static void printMethodsByAuthor(Class<?> cl){
        Map<String, List<String>> methodsByAuthor = new HashMap<>();

        Class<?> trackerClass = Tracker.class;
        Method[] methods = trackerClass.getDeclaredMethods();

        for (Method method : methods) {
            Author annotation = method.getAnnotation(Author.class);
            if (annotation != null) {
                methodsByAuthor.putIfAbsent(annotation.name(), new ArrayList<>());
                methodsByAuthor.get(annotation.name()).add(method.getName());
            }
        }

        for (String s : methodsByAuthor.keySet()) {
            System.out.println(s + ": " +String.join(", ",methodsByAuthor.get(s)));
        }

    }

    @Author(name = "Ivanov")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
    }
}

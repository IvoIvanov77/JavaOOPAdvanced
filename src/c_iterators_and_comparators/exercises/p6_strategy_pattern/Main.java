package c_iterators_and_comparators.exercises.p6_strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static Set<Person> nameSet = new TreeSet<>(nameComparator());
    private static Set<Person> ageSet = new TreeSet<>(ageComparator());

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            nameSet.add(person);
            ageSet.add(person);
        }

        nameSet.forEach(System.out::println);
        ageSet.forEach(System.out::println);

    }

    private static Comparator<Person> nameComparator(){
        return (p1, p2) -> {
            if(Integer.compare(p1.getName().length(), p2.getName().length()) == 0){
                return Character.compare(
                        p1.getName().toLowerCase().charAt(0),
                        p2.getName().toLowerCase().charAt(0)
                        );
            }
            return Integer.compare(p1.getName().length(), p2.getName().length());
        };
    }

    private static Comparator<Person>ageComparator(){
        return Comparator.comparing(Person::getAge);
    }


}

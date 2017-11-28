package c_iterators_and_comparators.exercises.p7_equality_logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    private static Set<Person> hashSet = new HashSet<>();
    private static Set<Person> treeSet = new TreeSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            hashSet.add(person);
            treeSet.add(person);
        }

        System.out.println(hashSet.size());
        System.out.println(treeSet.size());
    }
}

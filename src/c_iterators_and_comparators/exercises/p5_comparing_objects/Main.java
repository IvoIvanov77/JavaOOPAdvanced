package c_iterators_and_comparators.exercises.p5_comparing_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while (true){
            if("end".equalsIgnoreCase(line = reader.readLine())){
                break;
            }
            String[] input = line.split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            String town = input[2];
            personList.add(new Person(name, age, town));
        }

        int n = Integer.parseInt(reader.readLine());

        if(n < 0 || n >= personList.size()){
            System.out.println("No matches");
            return;
        }

//        int equalsPeople = countOfEqualsPeople(personList.get(n));
        int equalsPeople = countOfEqualsPeopleWithCompare(personList.get(n));
        int totalPeople = personList.size();
        int notEqualsPeople = totalPeople - equalsPeople;
        System.out.println(String.format("%d %d %d", equalsPeople, notEqualsPeople, totalPeople));
    }

    private static int countOfEqualsPeople(Person person) {
        int counter = 0;

        for (Person p : personList) {
            if(p.equals(person)){
                counter ++;
            }
        }
        return counter;
    }

    private static int countOfEqualsPeopleWithCompare(Person person) {
        int counter = 0;

        for (Person p : personList) {
            if(p.compareTo(person) == 0){
                counter ++;
            }
        }
        return counter;
    }
}

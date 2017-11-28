package c_iterators_and_comparators.exercises.p9_linked_list_traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> test = new LinkedList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String command = input[0];
            int item = Integer.parseInt(input[1]);
            switch (command){
                case "Add" : test.add(item);
                break;
                case "Remove" : test.remove(item);
                break;
            }
        }
        System.out.println(test.getSize());
        System.out.println(test);
    }
}

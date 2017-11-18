package b_generics.exercises.generic_swap_method_strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
//        List<String> list = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }
        String[] input = reader.readLine().split(" ");
        swap(list, Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        printList(list);


    }

    private static <T> void swap(List<T> list, int i, int j){
        T item = list.get(i);
        list.set(i, list.get(j));
        list.set(j, item);
    }

    private static <T> void printList(List<T> list){
        for (T t : list) {
            System.out.println(String.format("%s: %s",
                    t.getClass().getName(), t.toString()));
        }
    }
}

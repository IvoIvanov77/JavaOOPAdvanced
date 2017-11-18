package b_generics.exercises.generic_count_method_strings_and_doubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
//        List<GenericBox<String>> list = new ArrayList<>();
        List<GenericBox<Double>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new GenericBox<>(Double.parseDouble(reader.readLine())));

        }
        Double item = Double.parseDouble(reader.readLine());
        System.out.println(count(list, item));

    }

//    private static <T> void printList(List<T> list){
//        for (T t : list) {
//            System.out.println(String.format("%s: %s",
//                    t.getClass().getName(), t.toString()));
//        }
//    }

    private static <T extends Comparable<T>> int count(List<GenericBox<T>> list, T item){
        int count = 0;
        for (GenericBox<T> box : list) {
            if(box.getValue().compareTo(item) > 0){
                count ++;
            }
        }
        return count;
    }
}

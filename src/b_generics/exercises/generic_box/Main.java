package b_generics.exercises.generic_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
//            GenericBox<String> box = new GenericBox<>(reader.readLine());
//            System.out.println(box);
            GenericBox<Integer> box = new GenericBox<>(Integer.parseInt(reader.readLine()));
            System.out.println(box);
        }
    }

    private static <T> void swap(List<T> list, int i, int j){

        T item = list.get(i);
        list.set(i, list.get(j));
        list.set(j, item);
    }
}

package c_iterators_and_comparators.exercises.p4_froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static Lake lake;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while (true){
            if("end".equalsIgnoreCase(line = reader.readLine())){
                System.out.println(lake.jump().toString().replaceAll("[\\[\\]]", ""));
                break;
            }
            lake = new Lake(Arrays.stream(line.split("[,\\s]+"))
            .mapToInt(Integer::valueOf).toArray());

        }
    }
}

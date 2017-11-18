package b_generics.exercises.tuple_and_threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        //Tuple<String, String> nameAndAddress = new Tuple<>(input[0] + " " + input[1], input[2]);
        Threeuple<String, String, String> nameAndAddress = new Threeuple<>(
                input[0] + " " + input[1], input[2], input[3]
        );
        input = reader.readLine().split(" ");
//        Tuple<String, Integer> nameAndBeers = new Tuple<>(input[0], Integer.parseInt(input[1]));
        Threeuple<String, Integer, Boolean> nameAndBeers = new Threeuple<>(
                input[0],
                Integer.parseInt(input[1]),
                input[2].equals("drunk")
        );
        input = reader.readLine().split(" ");
//        Tuple<Integer, Double> integerAndDouble = new Tuple<>(Integer.parseInt(input[0]),
//                Double.parseDouble(input[1]));
        Threeuple<String, Double, String> bankAccount = new Threeuple<>(
                input[0],
                Double.parseDouble(input[1]),
                input[2]
        );

        System.out.println(nameAndAddress);
        System.out.println(nameAndBeers);
        System.out.println(bankAccount);
    }

}

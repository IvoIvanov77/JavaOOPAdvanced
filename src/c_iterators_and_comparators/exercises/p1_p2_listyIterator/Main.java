package c_iterators_and_comparators.exercises.p1_p2_listyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private  static ListyIterator<String> iterator;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while (true){
            if("END".equals(line= reader.readLine())){
                break;
            }
            String[] input = line.split("\\s+");
            String command = input[0];


            switch (command){
                case "Create" : iterator = new ListyIterator<>(Arrays.stream(input)
                        .skip(1).toArray(String[]::new));
                    break;
                case "HasNext" :
                    System.out.println(iterator.hasNext());
                    break;
                case "Move" :
                    System.out.println(iterator.move());
                    break;
                case "Print" :
                    try{
                        System.out.println(iterator.print());
                    }catch (UnsupportedOperationException uoe){
                        System.out.println(uoe.getMessage());
                    }
                    break;
                case "PrintAll" :
                    System.out.println(iterator);
                    break;
            }
        }
    }
}

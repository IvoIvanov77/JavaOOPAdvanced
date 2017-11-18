package b_generics.exercises.custom_list_plus_sorter_and_iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomList<String> strings = new CustomList<>();

        CommandInterpreter interpreter = new CommandInterpreter(strings);

        String line;

        while (true){
            if("END".equals(line = reader.readLine())){
                break;
            }
            interpreter.execute(line);
        }



    }
}

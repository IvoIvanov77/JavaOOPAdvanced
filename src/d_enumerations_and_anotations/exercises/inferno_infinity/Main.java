package d_enumerations_and_anotations.exercises.inferno_infinity;

import d_enumerations_and_anotations.exercises.inferno_infinity.controllers.CommandInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CommandInterpreter interpreter = new CommandInterpreter();

        String line;

        while (true){
            if("END".equalsIgnoreCase(line = reader.readLine())){
                break;
            }

            String result = interpreter.execute(line);
            if(!result.isEmpty()){
                System.out.println(result);
            }
        }
    }
}

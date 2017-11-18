package a_interfaces_and_abstraction.exercises.military_elite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;

        while (true){
            if("End".equals(line = reader.readLine())){
                break;
            }

            String result = CommandInterpreter.executeCommand(line);
            if(!result.isEmpty()){
                System.out.println(result);
            }
        }
    }
}


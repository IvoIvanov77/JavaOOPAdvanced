package d_enumerations_and_anotations.lab.warning_levels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String importance = reader.readLine();

        Logger logger = new Logger(importance);
        String line;

        while (true){
            if("end".equalsIgnoreCase(line = reader.readLine())){
                break;
            }

            String[] input = line.split(": ");
            Message message = new Message(input[0], input[1]);
            logger.add(message);

        }

        logger.messages().forEach(System.out::println);

    }
}

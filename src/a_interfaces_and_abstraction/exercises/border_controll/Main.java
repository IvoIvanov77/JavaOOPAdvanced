package a_interfaces_and_abstraction.exercises.border_controll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Identifiable> citizens = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            if("End".equals(line = reader.readLine())){
                break;
            }

            String[] input = line.split("\\s+");

            if (input.length == 3) {
                citizens.add(new Person(input[0], Integer.parseInt(input[1]),input[2]));
            } else {
                citizens.add(new Robot(input[0], input[1]));
            }
        }

        String targetId = reader.readLine();
        for (Identifiable citizen : citizens) {
            if (citizen.getID().endsWith(targetId)) {
                System.out.println(citizen.getID());
            }
        }
    }
}

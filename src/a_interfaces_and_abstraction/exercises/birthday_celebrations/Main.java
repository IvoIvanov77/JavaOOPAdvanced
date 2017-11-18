package a_interfaces_and_abstraction.exercises.birthday_celebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Identifiable> citizens = new ArrayList<>();
        List<Birthable> birthables = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            if("End".equals(line = reader.readLine())){
                break;
            }

            String[] input = line.split("\\s+");

            String type = input[0];

            switch (type){
                case "Citizen":{
                    Person person = new Person(input[1], Integer.parseInt(input[2]), input[3], input[4]);
                    citizens.add(person);
                    birthables.add(person);
                    break;
                }
                case "Pet" :{
                    Pet pet = new Pet(input[1], input[2]);
                    birthables.add(pet);
                    break;
                }
                case "Robot" :{
                    Robot robot = new Robot(input[1], input[2]);
                    citizens.add(robot);
                    break;
                }
            }


        }

        String targetBirthYear = reader.readLine();
        for (Birthable birthable : birthables) {
            if (birthable.getBirthDay().endsWith(targetBirthYear)) {
                System.out.println(birthable.getBirthDay());
            }
        }
    }
}

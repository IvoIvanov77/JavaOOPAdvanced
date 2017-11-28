package c_iterators_and_comparators.exercises.p8_pet_clinics;

import c_iterators_and_comparators.exercises.p8_pet_clinics.controllers.CommandInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        CommandInterpreter interpreter = new CommandInterpreter();

        for (int i = 0; i < n; i++) {
            interpreter.execute(reader.readLine());
        }

    }
}

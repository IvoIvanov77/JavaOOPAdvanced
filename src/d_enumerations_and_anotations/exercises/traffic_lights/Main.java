package d_enumerations_and_anotations.exercises.traffic_lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        int n = Integer.parseInt(reader.readLine());

        TrafficLights current = TrafficLights.valueOf(input[1]);

        for (int i = 0; i < n; i++) {
            TrafficLightsIterator iterator = new TrafficLightsIterator(current);
            System.out.println(iterator);
            current = iterator.getLast();
        }


    }
}

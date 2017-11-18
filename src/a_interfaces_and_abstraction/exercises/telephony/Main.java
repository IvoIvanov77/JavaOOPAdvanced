package a_interfaces_and_abstraction.exercises.telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        SmartPhone phone = new SmartPhone();

        String[] numbers = scan.readLine().split("\\s+");
        String[] urls = scan.readLine().split("\\s+");

        for (String number : numbers) {
            System.out.println(phone.call(number));
        }

        for (String url : urls) {
            System.out.println(phone.browse(url));
        }
    }
}
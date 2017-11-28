package c_iterators_and_comparators.exercises.p3_stack_Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Stack<String> myStack;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        myStack = new Stack<>();

        String line;

        while (true){
            if("end".equalsIgnoreCase(line = reader.readLine())){
                printStack();
                printStack();
                break;
            }

            String[] input = line.split("\\s+", 2);
            String command = input[0];
            switch (command){
                case "Push":{
                    String[] items = input[1].split(", ");
                    for (String item : items) {
                        myStack.push(item);
                    }
                    break;
                }
                case "Pop" : {
                    try{
                        myStack.pop();
                    }catch (UnsupportedOperationException uoe){
                        System.out.println(uoe.getMessage());
                    }

                }
            }
        }
    }

    private static void printStack() {
        for (String item : myStack) {
            System.out.println(item);
        }
    }
}

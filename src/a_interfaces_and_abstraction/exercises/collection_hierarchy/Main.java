package a_interfaces_and_abstraction.exercises.collection_hierarchy;

import a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections.AddCollection;
import a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections.AddRemoveCollection;
import a_interfaces_and_abstraction.exercises.collection_hierarchy.custom_collections.MyList;
import a_interfaces_and_abstraction.exercises.collection_hierarchy.interfaces.IAddCollection;
import a_interfaces_and_abstraction.exercises.collection_hierarchy.interfaces.IAddRemoveCollection;
import a_interfaces_and_abstraction.exercises.collection_hierarchy.interfaces.IMyList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        IAddCollection addCollection = new AddCollection();
        IAddRemoveCollection addAndRemoveCollection = new AddRemoveCollection();
        IMyList myCollection = new MyList();
        String line = reader.readLine();
        int count = Integer.parseInt(reader.readLine());

        System.out.println(addMethodToString(addCollection, line));
        System.out.println(addMethodToString(addAndRemoveCollection, line));
        System.out.println(addMethodToString(myCollection, line));

        System.out.println(removeMethodToString(addAndRemoveCollection, count));
        System.out.println(removeMethodToString(myCollection, count));
    }

    private static String addMethodToString(IAddCollection collection, String line){
        String[] input = line.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String s : input) {
            builder.append(collection.add(s)).append(" ");
        }
        return builder.toString().trim();
    }

    private static String removeMethodToString(IAddRemoveCollection collection, int count){

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(collection.remove()).append(" ");
        }
        return builder.toString().trim();
    }
}

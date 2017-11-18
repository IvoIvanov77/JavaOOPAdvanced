package b_generics.exercises.custom_list_plus_sorter_and_iterator;

import java.util.Iterator;

public class CommandInterpreter {

    private CustomList<String> customList;

    public CommandInterpreter(CustomList<String> customList) {
        this.customList = customList;
    }

    public void execute(String line){

        String[] input = line.split(" ");
        String command = input[0];

        switch (command){
            case "Add" : {
                String item = input[1];
                this.customList.add(item);
                break;
            }
            case "Remove" :{
                int index = Integer.parseInt(input[1]);
                this.customList.remove(index);
                break;
            }
            case "Contains" : {
                String item = input[1];
                System.out.println(this.customList.contains(item));
                break;
            }
            case "Swap" : {
                int i = Integer.parseInt(input[1]);
                int j = Integer.parseInt(input[2]);
                this.customList.swap(i, j);
                break;
            }
            case "Greater" : {
                String item = input[1];
                System.out.println(this.customList.countGreaterThan(item));
                break;
            }
            case "Max" : {
                System.out.println(this.customList.getMax());
                break;
            }
            case "Min" : {
                System.out.println(this.customList.getMin());
                break;
            }
            case "Print" : {
//                System.out.println(this.customList);
                this.iteratorTest();
                break;
            }
            case "Sort" : {
                this.customList.sort();
                break;
            }
        }
    }

    private void iteratorTest(){
        Iterator iterator = this.customList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

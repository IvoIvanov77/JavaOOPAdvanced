package c_iterators_and_comparators.exercises.p8_pet_clinics.controllers;

public class CommandInterpreter {

    private ClinicManager manager;

    public CommandInterpreter() {
        this.manager = new ClinicManager();
    }

    public void execute(String line){
        String[] input = line.split("\\s+");
        String command = input[0];

        switch (command){
            case "Create":{
                if(input[1].equals("Pet")){
                    this.manager.createPet(input[2], Integer.parseInt(input[3]), input[4]);
                }else if(input[1].equals("Clinic")){
                    this.manager.createClinic(input[2], Integer.parseInt(input[3]));
                }
                break;
            }

            case "Add" :
                System.out.println(this.manager.add(input[1], input[2]));
                break;

            case "Release" :
                System.out.println(this.manager.release(input[1]));
                break;

            case "HasEmptyRooms" :
                System.out.println(this.manager.hasEmptyRooms(input[1]));
                break;

            case "Print" :
                if(input.length == 2){
                    System.out.println(manager.print(input[1]));
                }else {
                    System.out.println(manager.print(input[1], Integer.parseInt(input[2])));
                }
                break;
        }
    }
}

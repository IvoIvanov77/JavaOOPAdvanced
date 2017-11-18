package a_interfaces_and_abstraction.exercises.military_elite;

import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.LeutenantGeneral;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.Private;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.Spy;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers.Commando;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers.Engineer;

public class CommandInterpreter {

//    Private 1 Pesho Peshev 22.22
//    Commando 13 Stamat Stamov 13.1 Airforces
//    Private 222 Toncho Tonchev 80.08
//    LeutenantGeneral 3 Joro Jorev 100 222
//    End1
//    Engineer 7 Pencho Penchev 12.23 Marines Boat 2 Crane 17
//    Commando 19 Penka Ivanova 150.15 Airforces HairyFoot finished Freedom inProgress
//            End

    private static SoldierManager manager = new SoldierManager();


    public static String executeCommand(String line){
        String[] input = line.split("\\s+");

        String command = input[0];
        String id = input[1];
        String firstName = input[2];
        String secondName = input[3];

        switch (command){
            case "Private" : {
                Private soldier = new Private(id, firstName, secondName,
                        Double.parseDouble(input[4]));
                return manager.registerSoldier(soldier);
            }
            case "Commando" : {
                Commando commando = null;
                try{
                    commando = new Commando(id, firstName, secondName,
                            Double.parseDouble(input[4]), input[5]);
                }catch (IllegalArgumentException iae){
                    return "";
                }
                for (int i = 6; i < input.length; i+=2) {
                    String codeName = input[i];
                    String state = input[i + 1];
                    try{
                        commando.addMission(new Mission(codeName, state));
                    }catch (IllegalArgumentException ignored){

                    }
                }
                return manager.registerSoldier(commando);
            }
            case "Engineer" : {
                Engineer engineer = null;
                try{
                    engineer = new Engineer(id, firstName, secondName,
                            Double.parseDouble(input[4]), input[5]);
                }catch (IllegalArgumentException iae){
                    return "";
                }
                for (int i = 6; i < input.length; i+=2) {
                    String name = input[i];
                    int hoursWorked = Integer.parseInt(input[i + 1]);
                    engineer.addRepair(new Repair(name, hoursWorked));
                }
                return manager.registerSoldier(engineer);
            }
            case "Spy": {
                Spy spy = new Spy(id, firstName, secondName, input[4]);
                return spy.toString();
            }
            case "LeutenantGeneral" : {
                LeutenantGeneral general = new LeutenantGeneral(id, firstName, secondName,
                        Double.parseDouble(input[4]));
                for (int i = 5; i < input.length; i++) {
                    String privateId = input[i];
                    Private soldier = manager.getSoldiers().get(privateId);
                    general.addPrivate(soldier);
                }
                return manager.registerSoldier(general);

            }
        }

        return "";

    }



}

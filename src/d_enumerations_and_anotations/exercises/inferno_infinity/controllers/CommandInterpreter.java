package d_enumerations_and_anotations.exercises.inferno_infinity.controllers;

import d_enumerations_and_anotations.exercises.inferno_infinity.anotations.ClassInfo;
import d_enumerations_and_anotations.exercises.inferno_infinity.enums.BaseStats;
import d_enumerations_and_anotations.exercises.inferno_infinity.enums.Gem;
import d_enumerations_and_anotations.exercises.inferno_infinity.models.Weapon;

import java.util.Arrays;

public class CommandInterpreter {

    private WeaponManager manager;

    public CommandInterpreter() {
        this.manager = new WeaponManager();
    }



    public String execute(String line){
        String[] input = line.split(";");
        String command = input[0];

        switch (command){
            case "Create":{
                BaseStats stats = BaseStats.valueOf(input[1]);
                this.manager.create(stats, input[2]);
                return "";
            }
            case "Add" :{
                Gem gem = Gem.valueOf(input[3]);
                this.manager.add(input[1], Integer.parseInt(input[2]),gem);
                return "";
            }
            case "Remove" :
                this.manager.remove(input[1], Integer.parseInt(input[2]));
                return "";

            case "Print":
                return this.manager.print(input[1]);

            case "Compare":
                return this.manager.compare(input[1], input[2]);

            case "Author":
                return ("Author: " + Weapon.class.getAnnotation(ClassInfo.class).author());

            case "Revision":
               return ("Revision: " + Weapon.class.getAnnotation(ClassInfo.class).revision());

            case "Description":
                return ("Class description: " + Weapon.class.getAnnotation(ClassInfo.class).description());

            case "Reviewers":
                return ("Reviewers: " + Arrays.toString(Weapon.class.getAnnotation(ClassInfo.class)
                        .reviewers()).replace("]","").replace("[",""));
            default: return "";
        }
    }
}

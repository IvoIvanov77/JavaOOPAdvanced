package d_enumerations_and_anotations.exercises.inferno_infinity.models;

import d_enumerations_and_anotations.exercises.inferno_infinity.anotations.ClassInfo;
import d_enumerations_and_anotations.exercises.inferno_infinity.enums.BaseStats;
import d_enumerations_and_anotations.exercises.inferno_infinity.enums.Gem;

//•	author = "Pesho"
//        •	revision = 3
//        •	description = "Used for Java OOP Advanced course - Enumerations and Annotations."
//        •	reviewers = "Pesho", "Svetlio


@ClassInfo(author = "Pesho",
        revision = 3,
        description ="Used for Java OOP Advanced course - Enumerations and Annotations.",
        reviewers = {"Pesho", "Svetlio"})
public class Weapon implements Comparable<Weapon>{

    private String name;

    private int minDamage;
    private int maxDamage;
    private Gem[] sockets;

    public Weapon(String name, BaseStats baseStats) {
        this.name = name;
        this.minDamage = baseStats.getMinDamage();
        this.maxDamage = baseStats.getMaxDamage();
        this.sockets = new Gem[baseStats.getSockets()];
    }

    public String getName() {
        return name;
    }

    private int getMinDamage() {
        int strength = getStrength();
        int agility = getAgility();
        return this.minDamage + 2 * strength + agility;

    }

    private int getMaxDamage() {
        int strength = getStrength();
        int agility = getAgility();
        return this.maxDamage + 3 * strength + 4 * agility;
    }



    public void addGem(int index, Gem gem){
        if(index >= 0 && index < this.sockets.length){
            this.sockets[index] = gem;

        }
    }

    public void removeGem(int index){
        if(index >= 0 && index < this.sockets.length){
            this.sockets[index] = null;

        }
    }

    private int getStrength(){
        int result = 0;
        for (Gem gem : sockets) {
            if(gem != null){
                result += gem.getStrength();
            }
        }
        return result;
    }

    public double getItemLevel(){
         //average of the min and max damage, plus every additional stat it has.
        return (this.getMinDamage() + this.getMaxDamage()) / 2.0 + this.getStrength() + this.getAgility() + this.getVitality();
    }

    private int getAgility (){
        int result = 0;
        for (Gem gem : sockets) {
            if(gem != null){
              result += gem.getAgility();
              }
        }
        return result;
    }

    private int getVitality (){
        int result = 0;
        for (Gem gem : sockets) {
            if(gem != null){
                result += gem.getVitality();
            }
        }
        return result;
    }



    @Override
    public String toString() {
        return String.format("%s: %d-%d Damage, +%d Strength, +%d Agility, +%d Vitality",
                this.name,
                this.getMinDamage(),
                this.getMaxDamage(),
                this.getStrength(),
                this.getAgility(),
                this.getVitality()
                );
    }

    @Override
    public int compareTo(Weapon other) {
        return Double.compare(this.getItemLevel(), other.getItemLevel());
    }
}

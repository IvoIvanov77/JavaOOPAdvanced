package d_enumerations_and_anotations.exercises.inferno_infinity.controllers;

import d_enumerations_and_anotations.exercises.inferno_infinity.enums.BaseStats;
import d_enumerations_and_anotations.exercises.inferno_infinity.enums.Gem;
import d_enumerations_and_anotations.exercises.inferno_infinity.models.Weapon;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeaponManager {

    private Map<String, Weapon> weapons;


    WeaponManager() {
        this.weapons = new LinkedHashMap<>();
    }

//    •	Create;{weapon type};{weapon name}
//•	Add;{weapon name};{socket index};{gem type}
//•	Remove;{weapon name};{socket index}
//•	Print;{weapon name}
//    •	Compare;{weapon name};{weapon name}

    void create(BaseStats stats, String name){
        Weapon weapon = new Weapon(name, stats);
        this.weapons.put(weapon.getName(), weapon);
    }

    public void add(String name, int index, Gem gem){
        Weapon weapon = this.weapons.get(name);
        if(weapon != null){
            weapon.addGem(index, gem);
        }
    }

    public void remove(String name, int index){
        Weapon weapon = this.weapons.get(name);
        if(weapon != null){
            weapon.removeGem(index);
        }
    }

    public String print(String name){
        Weapon weapon = this.weapons.get(name);
        if(weapon != null){
            return weapon.toString();
        }
        return "";
    }

    public String compare(String first, String second){
        Weapon firstWeapon = this.weapons.get(first);
        Weapon secondWeapon = this.weapons.get(second);
        if(firstWeapon == null || secondWeapon == null){
            return "";
        }
        if(firstWeapon.compareTo(secondWeapon) >= 0){
            return String.format("%s (Item Level: %.1f)", firstWeapon, firstWeapon.getItemLevel());
        }else{
            return String.format("%s (Item Level: %.1f)", secondWeapon, secondWeapon.getItemLevel());
        }

    }

}

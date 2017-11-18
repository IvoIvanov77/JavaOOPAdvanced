package a_interfaces_and_abstraction.exercises.military_elite;

import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.Private;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoldierManager {

    private Map<String, Private> soldiers;


    public SoldierManager() {
        this.soldiers = new LinkedHashMap<>();
    }

    public Map<String, Private> getSoldiers() {
        return Collections.unmodifiableMap(this.soldiers);
    }

    public String registerSoldier(Private soldier){
        this.soldiers.put(soldier.getId(), soldier);
        return soldier.toString();
    }




}

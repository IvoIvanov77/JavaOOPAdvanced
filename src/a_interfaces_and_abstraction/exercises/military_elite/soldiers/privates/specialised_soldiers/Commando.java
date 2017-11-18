package a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.ICommando;
import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IMission;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers.SpecialisedSoldier;

import java.util.ArrayList;
import java.util.List;

public class Commando extends SpecialisedSoldier implements ICommando{

    private List<IMission> missions;

    public Commando(String id, String fistName, String lastName, double salary, String corps) {
        super(id, fistName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(IMission mission) {
        this.missions.add(mission);
    }

    private String missionsToString(){
        StringBuilder builder = new StringBuilder("Missions:");

        this.missions.forEach(r -> {
            builder.append("\n  ").append(r.toString());
        });
        return builder.toString();

    }

    @Override
    public String toString() {

        return String.format(
                "%s\n" +
                "%s",
                super.toString(),
                missionsToString()
        );
    }
}

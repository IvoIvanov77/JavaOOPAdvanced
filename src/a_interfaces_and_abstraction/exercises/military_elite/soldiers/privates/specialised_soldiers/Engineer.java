package a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers;
import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IEngineer;
import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IRepair;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers.SpecialisedSoldier;

import java.util.ArrayList;
import java.util.List;

public class Engineer extends SpecialisedSoldier implements IEngineer{

    private List<IRepair> repairs;

    public Engineer(String id, String fistName, String lastName, double salary, String corps) {
        super(id, fistName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public void addRepair(IRepair repair) {
        this.repairs.add(repair);
    }

    private String repairsToString(){
        StringBuilder builder = new StringBuilder("Repairs:");

        this.repairs.forEach(r -> {
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
                repairsToString()
        );
    }
}

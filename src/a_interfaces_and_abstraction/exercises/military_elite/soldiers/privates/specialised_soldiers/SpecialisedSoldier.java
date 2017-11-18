package a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.specialised_soldiers;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.ISpecialisedSoldier;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.Private;

public abstract class SpecialisedSoldier extends Private implements ISpecialisedSoldier {

    private String corps;

    public SpecialisedSoldier(String id, String fistName, String lastName, double salary, String corps) {
        super(id, fistName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public void setCorps(String corps) {
//        Airforces or Marines
        if("Airforces".equals(corps) || "Marines".equals(corps)){
            this.corps = corps;
        }else {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                "Corps: %s",
                super.toString(),
                this.getCorps()
        );
    }
}

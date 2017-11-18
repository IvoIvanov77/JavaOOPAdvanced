package a_interfaces_and_abstraction.exercises.military_elite.soldiers;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.ISoldier;

public abstract class Soldier implements ISoldier {

//    id, first name and last name

    private String id;
    private String fistName;
    private String lastName;

    public Soldier(String id, String fistName, String lastName) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.fistName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s %s Id: %s",
                this.getFirstName(),
                this.getLastName(),
                this.getId()
        );
    }
}

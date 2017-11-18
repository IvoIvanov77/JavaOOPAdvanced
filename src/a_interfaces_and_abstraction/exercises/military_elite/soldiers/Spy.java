package a_interfaces_and_abstraction.exercises.military_elite.soldiers;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.ISpy;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.Soldier;

public class Spy extends Soldier implements ISpy {

    private String codeNumber;

    public Spy(String id, String fistName, String lastName, String codeNumber) {
        super(id, fistName, lastName);
        this.codeNumber = codeNumber;
    }


    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                "Code Number: %s",
                super.toString(),
                this.getCodeNumber()
        );
    }
}

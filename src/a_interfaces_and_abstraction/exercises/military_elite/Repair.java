package a_interfaces_and_abstraction.exercises.military_elite;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IRepair;

public class Repair implements IRepair{

//    part name and hours worked(int).

    private String name;
    private int hoursWorked;

    public Repair(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public String toString() {
        return String.format(
                "Part Name: %s Hours Worked: %d",
                this.getName(), this.getHoursWorked()
        );
    }
}

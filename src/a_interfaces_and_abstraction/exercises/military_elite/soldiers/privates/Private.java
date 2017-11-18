package a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IPrivate;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.Soldier;

public  class Private extends Soldier implements IPrivate {

    private double salary;

    public Private(String id, String fistName, String lastName, double salary) {
        super(id, fistName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
//        Name: <firstName> <lastName> Id: <id> Salary: <salary>
        return String.format(
                "%s Salary: %.2f",
                super.toString(),
                this.getSalary()
        );
    }
}

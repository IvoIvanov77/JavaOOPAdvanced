package a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates;

import a_interfaces_and_abstraction.exercises.military_elite.interfaces.ILeutenantGeneral;
import a_interfaces_and_abstraction.exercises.military_elite.interfaces.IPrivate;
import a_interfaces_and_abstraction.exercises.military_elite.soldiers.privates.Private;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeutenantGeneral extends Private implements ILeutenantGeneral {

    private List<IPrivate> privates;

    public LeutenantGeneral(String id, String fistName, String lastName, double salary) {
        super(id, fistName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(IPrivate soldier) {
        this.privates.add(soldier);
    }

    private String privatesToString(){
        StringBuilder builder = new StringBuilder("Privates:");
        Comparator<IPrivate> comparator = Comparator.comparing(IPrivate::getId).reversed();
        this.privates.stream().sorted(comparator)
                .forEach(p -> {
                    builder.append("\n  ").append(p.toString());
                });
        return builder.toString();

    }

    @Override
    public String toString() {
        return String.format(
                "%s\n" +
                "%s",
                super.toString(),
                privatesToString()
        );
    }
}

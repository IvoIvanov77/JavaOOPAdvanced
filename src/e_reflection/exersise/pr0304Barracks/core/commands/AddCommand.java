package e_reflection.exersise.pr0304Barracks.core.commands;

import e_reflection.exersise.pr0304Barracks.anotations.Inject;
import e_reflection.exersise.pr0304Barracks.contracts.Repository;
import e_reflection.exersise.pr0304Barracks.contracts.Unit;
import e_reflection.exersise.pr0304Barracks.contracts.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class AddCommand extends Command {

    @Inject
    private UnitFactory unitFactory;

    @Inject
    private Repository repository;

    public AddCommand(String[] data) {
        super(data);
    }


    @Override
    public String execute() {
        String unitType = super.getData()[1];
        Unit unitToAdd = null;
        try {
            unitToAdd = this.unitFactory.createUnit(unitType);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        this.repository.addUnit(unitToAdd);
        String output = unitType + " added!";
        return output;
    }
}

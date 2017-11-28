package e_reflection.exersise.pr0304Barracks.core.commands;

import e_reflection.exersise.pr0304Barracks.anotations.Inject;
import e_reflection.exersise.pr0304Barracks.contracts.Repository;

public class RetireCommand extends Command {

    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        String unitType = super.getData()[1];
        try{
            this.repository.removeUnit(unitType);
        }catch (UnsupportedOperationException uoe){
            return uoe.getMessage();
        }

        return unitType + " retired!";
    }
}

package e_reflection.exersise.pr0304Barracks.core.commands;

import e_reflection.exersise.pr0304Barracks.anotations.Inject;
import e_reflection.exersise.pr0304Barracks.contracts.Repository;

public class ReportCommand extends Command {

    @Inject
    private Repository repository;

    public ReportCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}

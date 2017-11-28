package e_reflection.exersise.pr0304Barracks.core.commands;

import e_reflection.exersise.pr0304Barracks.contracts.Executable;

public abstract class Command implements Executable {

    private String[] data;


    protected Command(String[] data) {
        this.data = data;

    }

    protected String[] getData() {
        return data;
    }


}

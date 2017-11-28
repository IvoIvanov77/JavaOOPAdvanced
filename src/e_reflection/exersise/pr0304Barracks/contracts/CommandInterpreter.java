package e_reflection.exersise.pr0304Barracks.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}

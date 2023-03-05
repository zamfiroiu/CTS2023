package ro.ase.cts.command.undo.clase;

public interface Command {
	void executa();
	void unexecute();
}

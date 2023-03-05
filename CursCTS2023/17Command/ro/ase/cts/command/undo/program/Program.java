package ro.ase.cts.command.undo.program;

import ro.ase.cts.command.undo.clase.ComandaRezervare;
import ro.ase.cts.command.undo.clase.ComandaVanzare;
import ro.ase.cts.command.undo.clase.Command;
import ro.ase.cts.command.undo.clase.Operator;
import ro.ase.cts.command.undo.clase.PachetCazare;
import ro.ase.cts.command.undo.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();
		
		Command vanzare=new ComandaVanzare(pachet);
		Command rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);
		
		operator.undo();
		operator.undo();
	}

}

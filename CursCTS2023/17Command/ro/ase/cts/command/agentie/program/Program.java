package ro.ase.cts.command.agentie.program;

import ro.ase.cts.command.agentie.clase.ComandaRezervare;
import ro.ase.cts.command.agentie.clase.ComandaVanzare;
import ro.ase.cts.command.agentie.clase.Command;
import ro.ase.cts.command.agentie.clase.Operator;
import ro.ase.cts.command.agentie.clase.PachetCazare;
import ro.ase.cts.command.agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetCazare(23);

		Operator operator=new Operator();
		
		Command vanzare=new ComandaVanzare(pachet);
		Command rezervare=new ComandaRezervare(pachet);

		operator.invoca(rezervare);
		operator.invoca(vanzare);
		

	}

}

package ro.ase.cts.decorator.agentie.program;

import ro.ase.cts.decorator.agentie.clase.PachetCazare;
import ro.ase.cts.decorator.agentie.clase.PachetTuristic;
import ro.ase.cts.decorator.agentie.decorator.OfertaPachetCazare;
import ro.ase.cts.decorator.agentie.decorator.OfertaPachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachetTuristic = new PachetCazare();
		pachetTuristic.descriere();
		System.out.println("Acest pachet nu poate fi anulat");
		System.out.println();
		
		
		OfertaPachetTuristic pachetTuristicOferta=new OfertaPachetCazare(pachetTuristic);
		pachetTuristicOferta.descriere();
		System.out.println("Acest pachet poate fi anulat");
		pachetTuristicOferta.anulareRezervare();
	}

}

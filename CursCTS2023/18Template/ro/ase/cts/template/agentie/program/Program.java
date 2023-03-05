package ro.ase.cts.template.agentie.program;

import ro.ase.cts.template.agentie.clase.PachetCazare;
import ro.ase.cts.template.agentie.clase.PachetCazareTransport;
import ro.ase.cts.template.agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachetCazare=new PachetCazare(5);
		pachetCazare.vindePachet();
		
		PachetTuristic pachetCT=new PachetCazareTransport(23);
		pachetCT.vindePachet();
		
	}

}

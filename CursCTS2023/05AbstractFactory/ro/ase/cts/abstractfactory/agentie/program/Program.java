package ro.ase.cts.abstractfactory.agentie.program;

import ro.ase.cts.abstractfactory.agentie.clase.Factory;
import ro.ase.cts.abstractfactory.agentie.clase.FactoryCategoria1;
import ro.ase.cts.abstractfactory.agentie.clase.PachetCazare;

public class Program {	
	PachetCazare obtineCazare(Factory fabrica){
		return fabrica.createPachetCazare();
	}

	public static void main(String[] args) {
		Factory fabricaAgentie=new FactoryCategoria1();
		PachetCazare cazare= fabricaAgentie.createPachetCazare();
		cazare.descriere();
	}
}

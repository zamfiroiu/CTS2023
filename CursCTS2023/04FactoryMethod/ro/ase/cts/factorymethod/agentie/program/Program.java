package ro.ase.cts.factorymethod.agentie.program;

import ro.ase.cts.factorymethod.agentie.clase.Factory;
import ro.ase.cts.factorymethod.agentie.clase.FactoryPacetAllInclusive;
import ro.ase.cts.factorymethod.agentie.clase.PachetTuristic;

public class Program {
	
	private static void afisare(Factory fabrica) {
		PachetTuristic pachetTuristic=fabrica.createPachet();		
		pachetTuristic.descriere();
	}
	
	public static void main(String[] args) {
		afisare(new FactoryPacetAllInclusive());		
	}
}

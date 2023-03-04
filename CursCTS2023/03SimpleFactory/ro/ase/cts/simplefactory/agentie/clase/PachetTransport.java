package ro.ase.cts.simplefactory.agentie.clase;

import ro.ase.cts.factorymethod.agentie.clase.PachetTuristic;

public class PachetTransport implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet inlude doar transport");
	}
}

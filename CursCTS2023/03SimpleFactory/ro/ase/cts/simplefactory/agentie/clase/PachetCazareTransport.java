package ro.ase.cts.simplefactory.agentie.clase;

import ro.ase.cts.factorymethod.agentie.clase.PachetTuristic;

public class PachetCazareTransport implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet inlude cazare si transport");
	}
}

package ro.ase.cts.simplefactory.agentie.clase;

import ro.ase.cts.factorymethod.agentie.clase.PachetTuristic;

public class PachetCazare implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet include doar cazare");
	}

}

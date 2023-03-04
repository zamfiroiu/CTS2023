package ro.ase.cts.factorymethod.agentie.clase;

public class FactoryPachetCazare implements Factory {

	@Override
	public PachetTuristic createPachet() {
		return new PachetCazare();
	}
}

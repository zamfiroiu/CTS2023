package ro.ase.cts.factorymethod.agentie.clase;

public class FactoryPachetTransport implements Factory {

	@Override
	public PachetTuristic createPachet() {
		return new PachetTransport();
	}

}

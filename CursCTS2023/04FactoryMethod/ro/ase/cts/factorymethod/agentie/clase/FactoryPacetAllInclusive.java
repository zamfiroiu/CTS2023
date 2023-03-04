package ro.ase.cts.factorymethod.agentie.clase;


public class FactoryPacetAllInclusive implements Factory {

	@Override
	public PachetTuristic createPachet() {
		return new PachetAllInclusive();
	}

}

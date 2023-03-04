package ro.ase.cts.factorymethod.agentie.clase;

public class PachetCazareTransport implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet inlude cazare si transport");
	}
}

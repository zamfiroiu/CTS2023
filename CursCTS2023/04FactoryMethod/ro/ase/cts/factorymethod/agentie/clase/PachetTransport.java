package ro.ase.cts.factorymethod.agentie.clase;

public class PachetTransport implements PachetTuristic {

	@Override
	public void descriere() {
		System.out.println("Acest pachet inlude doar transport");
	}
}

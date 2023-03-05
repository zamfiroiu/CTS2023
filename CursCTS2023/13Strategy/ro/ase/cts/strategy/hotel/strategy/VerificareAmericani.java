package ro.ase.cts.strategy.hotel.strategy;

public class VerificareAmericani implements ModVerificare {

	@Override
	public void verificaActe(String nume) {
		System.out.println("Am verificat viza lui "+nume);		
	}

}

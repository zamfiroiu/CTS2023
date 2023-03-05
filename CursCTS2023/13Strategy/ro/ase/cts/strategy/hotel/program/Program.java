package ro.ase.cts.strategy.hotel.program;

import ro.ase.cts.strategy.hotel.strategy.Client;
import ro.ase.cts.strategy.hotel.strategy.VerificareAmericani;
import ro.ase.cts.strategy.hotel.strategy.VerificareEuropeniUE;

public class Program {

	public static void main(String[] args) {
		Client client = new Client("Gigel", new VerificareAmericani());
		client.verificareDocumente();
		client.setModVerificare(new VerificareEuropeniUE());
		client.verificareDocumente();
	}

}

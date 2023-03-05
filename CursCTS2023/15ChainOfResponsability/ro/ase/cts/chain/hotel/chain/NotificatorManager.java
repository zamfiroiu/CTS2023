package ro.ase.cts.chain.hotel.chain;

import ro.ase.cts.chain.hotel.observer.Client;

public class NotificatorManager extends Notificator{

	@Override
	public void notifica(Client client, String mesaj) {
		System.out.println("Nu avem date pentru clientul "+client.getNume());
		
	}

}

package ro.ase.cts.chain.hotel.chain;

import ro.ase.cts.chain.hotel.observer.Client;

public class NotificatorEmail extends Notificator {

	@Override
	public void notifica(Client client, String mesaj) {
		if (client.getEmail() != null) {
			client.primesteEmail(mesaj);
		} else {
			super.getSuccesor().notifica(client, mesaj);
		}
	}

}

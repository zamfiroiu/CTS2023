package ro.ase.cts.chain.hotel.chain;

import ro.ase.cts.chain.hotel.observer.Client;

public class NotificatorSMS extends Notificator {

	@Override
	 public void notifica(Client client, String mesaj) {
		if(client.getNrTelefon()!= null) {
			client.primesteSMS(mesaj);
		}
		else {
			super.getSuccesor().notifica(client, mesaj);
		}
	
	}

}

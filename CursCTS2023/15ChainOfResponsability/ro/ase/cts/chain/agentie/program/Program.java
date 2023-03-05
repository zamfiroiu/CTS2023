package ro.ase.cts.chain.agentie.program;

import ro.ase.cts.chain.agentie.clase.Client;
import ro.ase.cts.chain.agentie.clase.Notificator;
import ro.ase.cts.chain.agentie.clase.NotificatorEmail;
import ro.ase.cts.chain.agentie.clase.NotificatorManager;
import ro.ase.cts.chain.agentie.clase.NotificatorSMS;

public class Program {

	public static void main(String[] args) {
		Notificator notificatorSMS=new NotificatorSMS();
		Notificator notificatorEmail=new NotificatorEmail();
		Notificator notificatorManager=new NotificatorManager();
		
		notificatorSMS.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		Client client=new Client("Popescu", null, null);
		
		notificatorSMS.notifica(client, "Notificare TEST");
	}

}

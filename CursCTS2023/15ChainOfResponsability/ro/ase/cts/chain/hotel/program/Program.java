package ro.ase.cts.chain.hotel.program;

import ro.ase.cts.chain.hotel.chain.NotificatorEmail;
import ro.ase.cts.chain.hotel.chain.NotificatorManager;
import ro.ase.cts.chain.hotel.chain.NotificatorSMS;
import ro.ase.cts.chain.hotel.observer.Client;
import ro.ase.cts.chain.hotel.observer.Hotel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel();
		Client client1=new Client("Gigel", "07234456", "gigel@gmail.com");
		Client client2=new Client("Tom", null, "gigel@gmail.com");
		Client client3=new Client("Bob", null, null);
		
		hotel.adaugaObserver(client1);
		hotel.adaugaObserver(client2);
		hotel.adaugaObserver(client3);
		
		hotel.trimiteNotificare("Astazi nu este apa calda intre 15-17");
		

	}

}

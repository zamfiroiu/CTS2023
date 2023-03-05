package ro.ase.cts.chain.hotel.observer;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.chain.hotel.chain.NotificatorEmail;
import ro.ase.cts.chain.hotel.chain.NotificatorManager;
import ro.ase.cts.chain.hotel.chain.NotificatorSMS;

public class Hotel implements Subject {
	List<Observer> observeri;

	public Hotel() {
		observeri = new ArrayList<>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		observeri.add(observer);

	}

	@Override
	public void stergerObserver(Observer observer) {
		observeri.remove(observer);

	}

	@Override
	public void trimiteNotificare(String mesaj) {

		NotificatorEmail notificatorEmail = new NotificatorEmail();
		NotificatorSMS notificatorSMS = new NotificatorSMS();
		NotificatorManager notificatorManager = new NotificatorManager();

		notificatorSMS.setSuccesor(notificatorEmail);
		notificatorEmail.setSuccesor(notificatorManager);

		for (Observer observer : observeri) {
			notificatorSMS.notifica((Client) observer, mesaj);
		}

	}

}

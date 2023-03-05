package ro.ase.cts.observer.agentie.clase;

import ro.ase.cts.observer.agentie.client.Observer;

public interface Subject {
	void adaugaObserver(Observer observer);
	void stergeObserver(Observer observer);
	void trimiteNotificare(String mesaj);
}

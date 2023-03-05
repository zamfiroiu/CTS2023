package ro.ase.cts.observer.agentie.program;

import ro.ase.cts.observer.agentie.clase.Agentie;
import ro.ase.cts.observer.agentie.client.ClientFidel;

public class Program {

	public static void main(String[] args) {
		ClientFidel clientPopescu=new ClientFidel("Popescu");
		ClientFidel clientIonescu=new ClientFidel("Ionescu");
		ClientFidel clientVasilescu=new ClientFidel("Vasilescu");
		
		Agentie agentie=new Agentie("AgeTur");
		
		agentie.adaugaObserver(clientVasilescu);		
		agentie.adaugaObserver(clientIonescu);
		agentie.notificareOfertaNoua();
		agentie.adaugaObserver(clientPopescu);
		agentie.notificareReducerePret();
	}
}

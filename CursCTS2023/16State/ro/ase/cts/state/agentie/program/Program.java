package ro.ase.cts.state.agentie.program;

import ro.ase.cts.state.agentie.clase.Rezervare;
import ro.ase.cts.state.agentie.clase.StareNeplatita;
import ro.ase.cts.state.agentie.clase.StarePlatita;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1000);
		
		StareNeplatita neplatita=new StareNeplatita();
		neplatita.doAction(rezervare);
		
		StarePlatita platita=new StarePlatita();
		platita.doAction(rezervare);
		
	}

}

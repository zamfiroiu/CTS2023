package ro.ase.cts.strategy.agentie.program;

import ro.ase.cts.strategy.agentie.strategy.Card;
import ro.ase.cts.strategy.agentie.strategy.Cash;
import ro.ase.cts.strategy.agentie.strategy.Client;

public class Program {

	public static void main(String[] args) {
		Client client=new Client("Popescu");
		
		client.setModPlata(new Card());
		client.plateste(300);
		
		client.setModPlata(new Cash());
		client.plateste(100);
	}

}

package ro.ase.cts.simplefactory.agentie.program;

import ro.ase.cts.factorymethod.agentie.clase.PachetTuristic;
import ro.ase.cts.simplefactory.agentie.clase.AgentieFactory;
import ro.ase.cts.simplefactory.agentie.clase.TipPachet;

public class Program {

	public static void main(String[] args) {
		AgentieFactory agentieFactory = new AgentieFactory();
		PachetTuristic pachetTuristic = null;
		try {
			pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazare);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		pachetTuristic.descriere();

		/*AgentieSingletonFactory agentieFabrica = AgentieSingletonFactory.getInstanta();
		try {
			pachetTuristic = agentieFabrica.createPachet(TipPachet.pachetCazareSiTransport);
		} catch (Exception e) {
			e.printStackTrace();
		}
		pachetTuristic.descriere();*/
	}

}

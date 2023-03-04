package ro.ase.cts.decorator.agentie.decorator;

import ro.ase.cts.decorator.agentie.clase.PachetTuristic;

public abstract class OfertaPachetTuristic implements PachetTuristic {
	private PachetTuristic pachetTuristic;
	
	public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
		this.pachetTuristic = pachetTuristic;
	}

	public void descriere(){
		pachetTuristic.descriere();
	}
	
	public abstract void anulareRezervare();
}

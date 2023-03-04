package ro.ase.cts.adapter.agentie.adapterclase.clase;

import ro.ase.cts.adapter.agentie.adapterclase.inchirieremasini.Masina;
import ro.ase.cts.adapter.agentie.adapterclase.inchirieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata extends MasinaInchiriata implements PachetTuristic {
	
	public PachetMasinaInchiriata(Masina masina){
		super(masina);
	}
	
	@Override
	public void descriere() {
		System.out.println(super.toString());
	}

	@Override
	public void rezervaPachet() {
		super.inchiriazaMasina();
	}

}

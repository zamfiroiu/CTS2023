package ro.ase.cts.adapter.agentie.adapterobiecte.clase;

import ro.ase.cts.adapter.agentie.adapterobiecte.inchirieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata implements PachetTuristic {

	private MasinaInchiriata masinaInchiriata;
	
	public PachetMasinaInchiriata(MasinaInchiriata masinaInchiriata){
		this.masinaInchiriata=masinaInchiriata;
	}
	
	@Override
	public void descriere() {
		System.out.println(this.masinaInchiriata.toString());
	}

	@Override
	public void rezervaPachet() {
		this.masinaInchiriata.inchiriazaMasina();
	}

}

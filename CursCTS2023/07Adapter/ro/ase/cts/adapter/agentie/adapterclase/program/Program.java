package ro.ase.cts.adapter.agentie.adapterclase.program;

import ro.ase.cts.adapter.agentie.adapterclase.clase.PachetCazare;
import ro.ase.cts.adapter.agentie.adapterclase.clase.PachetMasinaInchiriata;
import ro.ase.cts.adapter.agentie.adapterclase.clase.PachetTuristic;
import ro.ase.cts.adapter.agentie.adapterclase.inchirieremasini.Masina;
import ro.ase.cts.adapter.agentie.adapterclase.inchirieremasini.MasinaInchiriata;

public class Program {

	private static void printeazaRezervare(PachetTuristic pachetTuristic) {
		System.out.print("Pentru client: ");
		pachetTuristic.descriere();
		System.out.print("Pentru Operator: ");
		pachetTuristic.rezervaPachet();
	}

	public static void main(String[] args) {
		PachetTuristic pachetCazare = new PachetCazare();
		printeazaRezervare(pachetCazare);

		System.out.println("");
		System.out.println("se doreste utilizarea librariei pentru masini inchiriate.");

		System.out.println();
		System.out.println("Utilizarea in modul clasic:");
		Masina masina = new Masina("Opel", 1300);
		MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);

		System.out.println();
		System.out.println("Nu se foloseste metoda de printare.");
		System.out.print("Pentru client: ");
		System.out.println(masinaInchiriata.toString());
		System.out.print("Pentru Operator: ");
		masinaInchiriata.inchiriazaMasina();

		System.out.println();
		System.out.println("Se utilizeaza adapterul");
		Masina masina2 = new Masina("Renault", 1400);
		
		System.out.println();
		System.out.println("Acum pachetul este creat direct cu masina dorita");
		PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(masina2);
		System.out.println();
		System.out.println("Se foloseste metoda de printare");
		printeazaRezervare(pachetMasinaInchiriata);
	}
}

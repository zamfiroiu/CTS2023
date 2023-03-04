package ro.ase.cts.facade.agentie.program;

import ro.ase.cts.facade.agentie.clase.Facade;

public class Program {

	public static void main(String[] args) {
		Facade rezervareSejur=new Facade();		
		rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Moeciu de Sus");
	}
}

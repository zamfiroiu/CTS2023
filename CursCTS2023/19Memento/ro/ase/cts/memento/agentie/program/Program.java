package ro.ase.cts.memento.agentie.program;

import ro.ase.cts.memento.agentie.clase.ManagerPacheteTuritice;
import ro.ase.cts.memento.agentie.clase.PachetTuristic;

public class Program {

	public static void main(String[] args) {
		PachetTuristic pachet=new PachetTuristic(20);		
		ManagerPacheteTuritice managerPachete=new ManagerPacheteTuritice();
		
		System.out.println(pachet.toString());
		managerPachete.adaugaMemento(pachet.salvareMemento());
		pachet.setPret(50);
		System.out.println(pachet.toString());
		pachet.setPret(100);
		managerPachete.adaugaMemento(pachet.salvareMemento());
		System.out.println(pachet.toString());
		pachet.setPret(200);
		System.out.println(pachet.toString());

		try{
			pachet.undoToMemento(managerPachete.getMemento(0));
			System.out.println(pachet.toString());
		}catch(Exception exception){
			
		}

	}

}

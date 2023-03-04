package ro.ase.cts.proxy.agentie.program;

import ro.ase.cts.proxy.agentie.clase.PachetTransport;
import ro.ase.cts.proxy.agentie.clase.Persoana;
import ro.ase.cts.proxy.agentie.clase.ProxyPachet;

public class Program {

	public static void main(String[] args) {
		Persoana persoana=new Persoana("Popescu", 34);
		PachetTransport pachetTransport=new PachetTransport(persoana);
		pachetTransport.rezervaPachet();
		
		ProxyPachet pachetTransportProxy=new ProxyPachet(persoana);
		pachetTransportProxy.rezervaPachet();

	}

}

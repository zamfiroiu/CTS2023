package ro.ase.cts.proxy.hotel.program;

import ro.ase.cts.proxy.hotel.clase.ProxyRezervare;
import ro.ase.cts.proxy.hotel.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(2, 111);		
		rezervare.anulareRezervare();

		ProxyRezervare proxy=new ProxyRezervare(rezervare) ;
		proxy.anulareRezervare();
	}

}

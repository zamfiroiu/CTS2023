package ro.ase.cts.decorator.factura.decorator;

import ro.ase.cts.decorator.factura.clase.Factura;

public abstract class Decorator implements ro.ase.cts.decorator.factura.clase.IFactura {

	protected Factura factura;
	
	
	public Decorator(Factura factura){
		this.factura=factura;
	}
	@Override
	public void printeazaFactura() {
		factura.printeazaFactura();
		System.out.println("La multi ani!");
	}
	
	public abstract void aplicaDiscount(int procent);
		


}

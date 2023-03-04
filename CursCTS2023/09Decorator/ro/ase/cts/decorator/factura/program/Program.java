package ro.ase.cts.decorator.factura.program;

import ro.ase.cts.decorator.factura.clase.Factura;
import ro.ase.cts.decorator.factura.decorator.Decorator;
import ro.ase.cts.decorator.factura.decorator.FacturaDecorata;

public class Program {

	public static void main(String[] args) {
		Factura factura=new Factura(123, 1000);
		
		factura.printeazaFactura();
		
		Decorator facturaDecorata=new FacturaDecorata(factura);
		
		facturaDecorata.aplicaDiscount(10);
		facturaDecorata.printeazaFactura();
	}

}

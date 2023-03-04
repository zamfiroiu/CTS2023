package ro.ase.cts.decorator.factura.decorator;

import ro.ase.cts.decorator.factura.clase.Factura;

public class FacturaDecorata extends Decorator {

	public FacturaDecorata(Factura factura) {
		super(factura);
	}

	@Override
	public void aplicaDiscount(int procent) {
		super.factura.setSumaFactura(super.factura.getSumaFactura()*(100-procent)/100);

	}

}

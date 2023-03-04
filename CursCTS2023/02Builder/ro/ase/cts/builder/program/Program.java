package ro.ase.cts.builder.program;

import ro.ase.cts.builder.v2_builder.PachetTransport;
import ro.ase.cts.builder.v2_builder.PachetTransportBuilder;
import ro.ase.cts.builder.v3_builder.PachetCalatorie;

public class Program {

	public static void main(String[] args) {
		PachetTransport pachetTransport=new PachetTransportBuilder()
				.setHasAC(true).setHasTV(true).setHasWiFi(true).build();
		System.out.println(pachetTransport.toString());

		PachetTransport pt=new PachetTransport();
		pt.setHasAC(true);
		pt.setHasTV(true);

        PachetCalatorie pachetCalatorie = PachetCalatorie.builder()
                .setHasWiFi(true).setHasAC(true).setHasAnimale(true).build();
        System.out.println(pachetCalatorie);
	}

}

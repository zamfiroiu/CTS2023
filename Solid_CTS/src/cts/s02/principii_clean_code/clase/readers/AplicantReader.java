package cts.s02.principii_clean_code.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;


public abstract class AplicantReader {
	public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}

package cl.lisandro.src.test;

import cl.lisandro.src.TipoVehiculo;

public class ValidatorPatenteExample {

	public static void main(String[] args) {

		String patente = null;
		patente = "XXXO34";

		testMoto(patente);

	}

	static void testMoto(String patente) {
		System.out.print("Entrada : " + patente);
		TipoVehiculo tipo = TipoVehiculo.MOTO;

		System.out.println(" : is valid : " + tipo.isValid(patente));
		if( !tipo.isValid(patente)){
			
			patente = tipo.setNormalized(patente);
			patente = tipo.setComplete(patente);
			
			
		}

		System.out.print("Salida : " + patente);
		System.out.println(" : is valid : " + tipo.isValid(patente));
	}

}

package cl.lisandro.src.test;

import cl.lisandro.src.TipoVehiculo;
import cl.lisandro.src.ValidadorPatenteChile;

public class ValidatorPatenteExample {

	public static void main(String[] args) {

		System.out.println(ValidadorPatenteChile.isPatenteValida("QWE123", TipoVehiculo.MOTO));
		System.out.println(ValidadorPatenteChile.isPatenteValida("QWE123"));

		// String[] patentes =
		// {"DU1234","GFTR12","ZAY123","PA0123","QW12QW","XXP23"};
		// for (int i = 0; i < patentes.length ; i++ ){
		// String patente = patentes[i].trim().toUpperCase();
		// ValidadorPatenteChile validator = new ValidadorPatenteChile();

		// validar formato de patente
		// isPatenteValida(patente)

		// validar patente de moto
		// isPatenteValida(patente, tipovehiculo)

		// validar si se puede reemplazar O en patente
		// regla de negocio

		// reemplazar el O en patente
		// getPatenteMotoNormalizada(patente)

		// System.out.println("Patente: "+patente+" Tipo: "+validator.getDetails(patente));
		// }
	}

}

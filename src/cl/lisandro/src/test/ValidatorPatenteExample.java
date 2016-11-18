package cl.lisandro.src.test;

import cl.lisandro.src.NormalizadorPatenteMoto;
import cl.lisandro.src.TipoVehiculo;
import cl.lisandro.src.ValidadorPatente;

public class ValidatorPatenteExample {

	public static void main(String[] args) {

		String patente = "XXO123";
		String patenteNueva = patente;
		String mostrar = "Entrada: " + patente + " :: Salida: ";
		System.out.println(mostrar + ValidadorPatente.isPatenteValida(patente, TipoVehiculo.MOTO));
		
		if (!ValidadorPatente.isPatenteValida(patente, TipoVehiculo.MOTO)){
			patenteNueva = NormalizadorPatenteMoto.getPatenteMotoNormalizada(patente);
		}
		
		mostrar = "Entrada: " + patenteNueva + " :: Salida: ";
		
		System.out.println(mostrar + ValidadorPatente.isPatenteValida(patenteNueva, TipoVehiculo.MOTO));

	}

}

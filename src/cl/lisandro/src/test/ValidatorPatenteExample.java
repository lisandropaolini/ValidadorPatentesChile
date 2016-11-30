package cl.lisandro.src.test;

import cl.lisandro.src.NormalizadorPatenteMoto;
import cl.lisandro.src.TipoVehiculo;
import cl.lisandro.src.ValidadorPatente;

public class ValidatorPatenteExample {

	public static void main(String[] args) {

		String patente = "XXDR34";
		String patenteNueva = patente;
		String mostrar = "Entrada: " + patente + " :: Salida: ";
		System.out.println(mostrar + ValidadorPatente.isPatenteValida(patente, TipoVehiculo.AUTO));
		
		if (!ValidadorPatente.isPatenteValida(patente, TipoVehiculo.AUTO)){
			patenteNueva = NormalizadorPatenteMoto.getPatenteMotoNormalizada(patente);
		}
		
		mostrar = "Entrada: " + patenteNueva + " :: Salida: ";
		
		System.out.println(mostrar + ValidadorPatente.isPatenteValida(patenteNueva, TipoVehiculo.AUTO));

	}

}

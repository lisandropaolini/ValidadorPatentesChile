package cl.lisandro.src.test;

import cl.lisandro.src.NormalizadorPatenteMoto;
import cl.lisandro.src.ValidadorPatente;

public class ValidatorPatenteExample {

	public static void main(String[] args) {

		String patente = "XXO34";
		String mostrar = "Entrada: " + patente + " :: Salida: ";
		System.out.println(mostrar + ValidadorPatente.isPatenteValida(patente));
		
		System.out.println(NormalizadorPatenteMoto.validaPatenteMotoFix(patente));		
	}

}

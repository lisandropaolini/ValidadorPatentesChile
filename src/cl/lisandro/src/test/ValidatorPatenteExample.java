package cl.lisandro.src.test;

import cl.lisandro.src.PatenteAuto;
import cl.lisandro.src.PatenteMoto;

public class ValidatorPatenteExample {

	public static void main(String[] args) {

		String patente = null;
		patente = "XXLO34";
		
		testMoto(patente);

		


	}
	
	static void testMoto(String patente){
		System.out.println("Entrada : " + patente);
		PatenteMoto moto = new PatenteMoto(patente);

		System.out.println("moto.isValid() : "+ moto.isValid());
		if (!moto.isValid()) {

			try {
				System.out.println("moto.isBeNormalized() : "+ moto.isBeNormalized());
				if (moto.isBeNormalized())
					moto.setNormalized();

				System.out.println("moto.isBeComplete() : " + moto.isBeComplete());
				if (moto.isBeComplete())
					moto.setComplete();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Salida : " + moto.getPatente());
	}
	
	static void testAuto(String patente){
		System.out.println("Entrada : " + patente);
		PatenteAuto auto = new PatenteAuto(patente);
		
		System.out.println("auto.isValid() : " + auto.isValid());
	}

}

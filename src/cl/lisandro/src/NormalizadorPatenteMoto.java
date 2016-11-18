package cl.lisandro.src;

public abstract class NormalizadorPatenteMoto {

	public static String getPatenteMotoNormalizada(String patente){
		
		if (ValidadorPatente.isPatternMatcher(Constants.EXP_MOTO_NUEVA_CON_O, patente) )
			patente = patente.substring(0,3) + "0" + patente.substring(4,6);
		if (ValidadorPatente.isPatternMatcher(Constants.EXP_MOTO_VIEJA_CON_O, patente) )
			patente = patente.substring(0,2) + "0" + patente.substring(3,6);
		return patente;
	}
}

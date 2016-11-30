package cl.lisandro.src;

public abstract class NormalizadorPatenteMoto {

	/**
	 * valida que sea patente de moto y tenga una O en el 3er o 4to lugar y lo cambia por un cero 0
	 * @param patente
	 * @return
	 */
	public static String getPatenteMotoNormalizada(String patente){
		String retorno = null;
		
		if (ValidadorPatente.isPatternMatcher(Constants.EXP_MOTO_NUEVA_CON_O, patente) )
			retorno = patente.substring(0,3) + "0" + patente.substring(4,6);
		else if (ValidadorPatente.isPatternMatcher(Constants.EXP_MOTO_VIEJA_CON_O, patente) )
			retorno = patente.substring(0,2) + "0" + patente.substring(3,5);
		
		return retorno;
	}
	
	/**
	 * Valida formato patente de moto
	 * retorno:
	 * null -> patente invalida //
	 * patente -> se le agrega un 0 en caso de ser moto //
	 * fix patente moto, se cambia O por 0
	 * 
	 * @param patente
	 * @return patente
	 */
	public static String validaPatenteMotoFix(String patente) {
		String retorno = null;

		if (ValidadorPatente.isPatenteMotoVieja(patente))
			retorno = patente;
		else if (ValidadorPatente.isPatenteMotoNueva(patente))
			retorno = patenteCompleteMoto(patente);
		else
			retorno = getPatenteMotoNormalizada(patente);
		
		return retorno;
	}

	static String patenteCompleteMoto(String patente){
		if (patente.length() != 5)
			return null;
		else
			return (patente.substring(0, 3) + "0" + patente.substring(3, 5));
	}
}

package cl.lisandro.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ValidadorPatenteChile {
	
	
	public static Boolean isPatenteValida(String patente){
		return isPatenteValida(patente, null);
	}
	
	public static Boolean isPatenteValida(String patente, TipoVehiculo tipoVehiculo){
		
		if (tipoVehiculo == null){
			return (isPatenteMoto(patente) || isPatenteAuto(patente) || isPatenteCArrastre(patente));
		}
		
		switch (tipoVehiculo) {
		case MOTO:
			return isPatenteMoto(patente);
		case CARRO_ARRASTRE:
			return isPatenteCArrastre(patente);
		case AUTO:
		
			return isPatenteAuto(patente);
		default:
			return Boolean.FALSE;
		}
	}
	
	

	private static boolean isPatenteMoto(String patente){
		return (isPatenteMotoVieja(patente) 
				|| isPatenteMotoNueva(patente));
	}
	
	private static boolean isPatenteMotoVieja(String patente) {
		return isPatternMatcher(Constants.EXP_MOTO_VIEJA_5, patente);
	}

	private static boolean isPatenteMotoNueva(String patente) {
		return isPatternMatcher(Constants.EXP_MOTO_VIEJA_6, patente);
	}

	private static boolean isPatenteCArrastre(String patente) {
		return isPatternMatcher(Constants.EXP_C_ARRASTRE, patente);
	}

	private static boolean isPatenteAuto(String patente){
		return (isPatenteAutoViejo(patente) || isPatenteAutoNuevo(patente));
	}
	
	private static boolean isPatenteAutoViejo(String patente) {
		return isPatternMatcher(Constants.EXP_AUTO_VIEJO, patente);
	}

	private static boolean isPatenteAutoNuevo(String patente) {
		return isPatternMatcher(Constants.EXP_AUTO_NUEVO, patente);
	}

	private static boolean isPatternMatcher(String exp, String val) {
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(val);
		return m.matches();
	}

	private boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

}

package cl.lisandro.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ValidadorPatente {

	public static Boolean isPatenteValida(String patente) {
		return isPatenteValida(patente, null);
	}

	public static Boolean isPatenteValida(String patente,
			TipoVehiculo tipoVehiculo) {

		if (tipoVehiculo == null) 
			return (isPatenteMoto(patente) || isPatenteAuto(patente) || isPatenteCArrastre(patente));

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

	static boolean isPatenteMoto(String patente) {
		return (isPatenteMotoVieja(patente) || isPatenteMotoNueva(patente));
	}

	static boolean isPatenteMotoVieja(String patente) {
		return (isPatternMatcher(Constants.EXP_MOTO_VIEJA_5, patente) 
				|| isPatternMatcher(Constants.EXP_MOTO_VIEJA_6, patente));
	}

	static boolean isPatenteMotoNueva(String patente) {
		return (isPatternMatcher(Constants.EXP_MOTO_NUEVA_5, patente) 
				|| isPatternMatcher(Constants.EXP_MOTO_NUEVA_6, patente));
	}

	static boolean isPatenteCArrastre(String patente) {
		return isPatternMatcher(Constants.EXP_C_ARRASTRE, patente);
	}

	static boolean isPatenteAuto(String patente) {
		return (isPatenteAutoViejo(patente) || isPatenteAutoNuevo(patente));
	}

	static boolean isPatenteAutoViejo(String patente) {
		return isPatternMatcher(Constants.EXP_AUTO_VIEJO, patente);
	}

	static boolean isPatenteAutoNuevo(String patente) {
		return isPatternMatcher(Constants.EXP_AUTO_NUEVO, patente);
	}

	static boolean isPatternMatcher(String exp, String val) {
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(val);
		return m.matches();
	}

}

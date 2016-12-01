package cl.lisandro.src;

abstract class ValidadorPatente {

	static boolean isPatenteMoto(String patente) {
		try {
			return (isPatenteMotoVieja(patente) || isPatenteMotoNueva(patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	private static boolean isPatenteMotoVieja(String patente) {
		try {
			return (Util.isPatternMatcher(Constants.EXP_MOTO_VIEJA_5, patente) || Util
					.isPatternMatcher(Constants.EXP_MOTO_VIEJA_6, patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	private static boolean isPatenteMotoNueva(String patente) {
		try {
			return (Util.isPatternMatcher(Constants.EXP_MOTO_NUEVA_5, patente) || Util
					.isPatternMatcher(Constants.EXP_MOTO_NUEVA_6, patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static boolean isPatenteMotoNotComplete(String patente) {
		try {
			return (Util.isPatternMatcher(Constants.EXP_MOTO_VIEJA_5, patente) || Util
					.isPatternMatcher(Constants.EXP_MOTO_VIEJA_5, patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static boolean isPatenteAuto(String patente) {
		try {
			return (isPatenteAutoViejo(patente) || isPatenteAutoNuevo(patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	private static boolean isPatenteAutoViejo(String patente) {
		try {
			return Util.isPatternMatcher(Constants.EXP_AUTO_VIEJO, patente);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	private static boolean isPatenteAutoNuevo(String patente) {
		try {
			return Util.isPatternMatcher(Constants.EXP_AUTO_NUEVO, patente);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static String getComplete(String patente) {
			return patenteMotoComplete(patente);
	}

	private static String patenteMotoComplete(String patente) {
		return (patente.substring(0, 3) + "0" + patente.substring(3, 5));
	}

	static String getNormalized(String patente) {
		return getNormalizedMatch(patente);
	}

	static Boolean isBeNormalized(String patente) {
		try {
			String retorno = null;

			retorno = getNormalizedMatch(patente);

			if (retorno != null)
				return Boolean.TRUE;

		} catch (Exception e) {
			return Boolean.FALSE;
		}
		return Boolean.FALSE;
	}

	private static String getNormalizedMatch(String patente) {
		if (Util.isPatternMatcher(Constants.EXP_MOTO_NUEVA_CON_O, patente))
			return patente.substring(0, 3) + "0" + patente.substring(4, 6);
		else if (Util.isPatternMatcher(Constants.EXP_MOTO_VIEJA_CON_O, patente))
			return patente.substring(0, 3) + "0" + patente.substring(3, 6);
		else
			return null;
	}

}

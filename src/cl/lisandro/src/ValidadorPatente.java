package cl.lisandro.src;

import cl.lisandro.src.enums.TipoVehiculo;

abstract class ValidadorPatente {

	static Boolean isPatenteValida(String patente) {
		return isPatenteValida(patente, null);
	}

	static Boolean isPatenteValida(String patente, TipoVehiculo tipoVehiculo) {
		try {
			if (tipoVehiculo == null)
				return (isPatenteMoto(patente) || isPatenteAuto(patente));

			switch (tipoVehiculo) {
			case MOTO:
				return isPatenteMoto(patente);
			case AUTO:
				return isPatenteAuto(patente);
			default:
				return Boolean.FALSE;
			}
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static boolean isPatenteMoto(String patente) {
		try {
			return (isPatenteMotoVieja(patente) || isPatenteMotoNueva(patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static boolean isPatenteMotoVieja(String patente) {
		try {
			return (Util.isPatternMatcher(Constants.EXP_MOTO_VIEJA_5, patente) || Util
					.isPatternMatcher(Constants.EXP_MOTO_VIEJA_6, patente));
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static boolean isPatenteMotoNueva(String patente) {
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

	static boolean isPatenteAutoViejo(String patente) {
		try {
			return Util.isPatternMatcher(Constants.EXP_AUTO_VIEJO, patente);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

	static boolean isPatenteAutoNuevo(String patente) {
		try {
			return Util.isPatternMatcher(Constants.EXP_AUTO_NUEVO, patente);
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}

}

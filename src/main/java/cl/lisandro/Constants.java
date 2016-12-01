package cl.lisandro;

abstract class Constants {

	static final String EXP_AUTO_VIEJO = "[A-Z]{2}[1-9]{1}[0-9]{3}";
	static final String EXP_AUTO_NUEVO = "[BCDFGHJKLPRSTVWXYZ]{4}[0-9]{2}";

	static final String EXP_MOTO_VIEJA_5 = "[A-Z]{2}[0-9]{3}";
	static final String EXP_MOTO_NUEVA_5 = "[BCDFGHJKLPRSTVWXYZ]{3}[0-9]{2}";

	static final String EXP_MOTO_VIEJA_6 = "[A-Z]{2}[0]{1}[0-9]{3}";
	static final String EXP_MOTO_NUEVA_6 = "[BCDFGHJKLPRSTVWXYZ]{3}[0]{1}[0-9]{2}";

	static final String EXP_MOTO_VIEJA_CON_O = "[A-Z]{2}[O]{1}[0-9]{3}";
	static final String EXP_MOTO_NUEVA_CON_O = "[BCDFGHJKLPRSTVWXYZ]{3}[O]{1}[0-9]{2}";

}

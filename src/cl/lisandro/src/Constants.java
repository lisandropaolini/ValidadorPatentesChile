package cl.lisandro.src;

abstract class Constants {

	static final String EXP_AUTO_VIEJO = "[A-Za-z]{2}[0-9]{4}";
	static final String EXP_AUTO_NUEVO = "[B-DF-HJ-NQ-TV-Z]{4}[0-9]{2}";
	static final String EXP_MOTO_VIEJA_5 = "[A-Za-z]{2}[0-9]{3}";
	static final String EXP_MOTO_VIEJA_6 = "[A-Za-z]{2}[0]{1}[0-9]{3}";
	static final String EXP_MOTO_NUEVA_5 = "[B-DF-HJ-NQ-TV-Z]{3}[0-9]{2}";
	static final String EXP_MOTO_NUEVA_6 = "[B-DF-HJ-NQ-TV-Z]{3}[0]{1}[0-9]{2}";
	static final String EXP_C_ARRASTRE = "[A-Za-z]{3}[0-9]{3}";

	static final String EXP_MOTO_VIEJA_CON_O = "[A-Za-z]{2}[oO]{1}[0-9]{3}";
	static final String EXP_MOTO_NUEVA_CON_O = "[B-DF-HJ-NQ-TV-Z]{3}[oO]{1}[0-9]{2}";

}

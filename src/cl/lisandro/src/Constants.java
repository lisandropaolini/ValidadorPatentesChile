package cl.lisandro.src;

public class Constants {

	public static final String NO_VALIDA = "NO VALIDA";
	public static final String MOTO_NUEVA = "MOTO NUEVA";
	public static final String MOTO_VIEJA = "MOTO VIEJA";
	public static final String AUTO_VIEJO = "AUTO VIEJO";
	public static final String AUTO_NUEVO = "AUTO NUEVO";
	public static final String C_ARRASTRE = "CARRO DE ARRASTRE";
	public static final String CERO_SRT = "0";
	public static final String O_STR = "O";
	
	public static final String EXP_AUTO_VIEJO = "[A-Za-z]{2}[0-9]{4}";
	public static final String EXP_AUTO_NUEVO = "[^AEIOUaeiou(0-9)]{4}[0-9]{2}";
	public static final String EXP_MOTO_VIEJA_5 = "[A-Za-z]{2}[0-9]{3}";
	public static final String EXP_MOTO_VIEJA_6 = "[A-Za-z]{2}[0]{1}[0-9]{3}";
	public static final String EXP_MOTO_NUEVA_5 = "[^AEIOU(0-9)]{3}[0-9]{2}";
	public static final String EXP_MOTO_NUEVA_6 = "[^AEIOUaeiou(0-9)]{3}[0]{1}[0-9]{2}";
	public static final String EXP_C_ARRASTRE = "[A-Za-z]{3}[0-9]{3}";
	
	public static final String EXP_MOTO_VIEJA_CERO = "";
	public static final String EXP_MOTO_NUEVA_CERO = "";
	
}

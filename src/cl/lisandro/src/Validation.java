package cl.lisandro.src;

public interface Validation {

	public Boolean isValid(String patente);
	public String setNormalized(String patente);
	public String setComplete(String patente);
}

package cl.lisandro.src;


public class PatenteAuto extends ValidadorPatente {

	private String patente;

	/**
	 * Constructor se recibe la patente con la que se va a trabajar
	 * 
	 * @param patente
	 */
	public PatenteAuto(String patente){
		this.patente = patente;
	}

	/**
	 * is Patente valid
	 * 
	 * @return Boolean
	 */
	public Boolean isValid() {
		return isPatenteAuto(this.patente);
	}
	
	/**
	 * getter patente
	 * @return
	 */
	public String getPatente(){
		return this.patente;
	}
}

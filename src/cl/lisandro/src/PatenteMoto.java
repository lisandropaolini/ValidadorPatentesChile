package cl.lisandro.src;

public class PatenteMoto extends ValidadorPatente {

	private String patente;

	/**
	 * Constructor
	 * 
	 * @param patente
	 */
	public PatenteMoto(String patente) {
		this.patente = patente;
	}

	/**
	 * is Patente valid
	 * 
	 * @return Boolean
	 */
	public Boolean isValid() {
		return isPatenteMoto(this.patente);
	}

	/**
	 * is be a Patente valid to normalized
	 * @return
	 */
	public Boolean isBeNormalized(){
		try{
			getNormalized();
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}
	
	/**
	 * Change the Patente with an O in the 0 place of complete format
	 * 
	 * @throws Exception
	 *             The Patente does not contain a O in the String
	 */
	public void setNormalized() throws Exception {
		try {
			this.patente = getNormalized();
		} catch (Exception e) {
			throw new Exception(
					"The Patente does not contain a O in the String");
		}
	}
	
	String getNormalized() throws Exception {
		String retorno = null;

		if (Util.isPatternMatcher(Constants.EXP_MOTO_NUEVA_CON_O, this.patente))
			retorno = this.patente.substring(0, 3) + "0"
					+ this.patente.substring(4, 6);
		else if (Util.isPatternMatcher(Constants.EXP_MOTO_VIEJA_CON_O,
				this.patente))
			retorno = this.patente.substring(0, 3) + "0"
					+ this.patente.substring(3, 6);

		if (retorno != null)
			return retorno;
		else
			throw new Exception();	
	}

	/**
	 * is be a Patente valid to add a 0 to complete the full format length
	 * 
	 * @return Boolean
	 */
	public Boolean isBeComplete(){
		try{
			getComplete();
			return Boolean.TRUE;
		} catch (Exception e) {
			return Boolean.FALSE;
		}
	}
	/**
	 * Add a 0 to complete the full format length of Patente
	 * 
	 * @throws Exception
	 *             The Patente is not 5 characters in length
	 */
	public void setComplete() throws Exception {
		try {
			this.patente = getComplete();
		} catch (Exception e) {
			throw new Exception(
					"The Patente is not 5 characters in length");
		}
	}
	
	String getComplete() throws Exception{
		if (isPatenteMotoNotComplete(this.patente))
			return this.patenteMotoComplete();
		else
			throw new Exception();
	}

	String patenteMotoComplete() {
		return (this.patente.substring(0, 3) + "0" + this.patente.substring(3, 5));
	}

	/**
	 * getter of Patente
	 * 
	 * @return
	 */
	public String getPatente() {
		return this.patente;
	}
}

package cl.lisandro.src;

import cl.lisandro.src.enums.TipoVehiculo;

public class ValidadorPatenteAuto extends ValidadorPatente {

	private String patente;

	/**
	 * Constructor se recibe la patente con la que se va a trabajar
	 * 
	 * @param patente
	 */
	public ValidadorPatenteAuto(String patente){
		this.patente = patente;
	}

	/**
	 * Valida si la patente coincide con un tipo de vehiculo
	 * @return
	 */
	public Boolean isPatenteValida() {
		return isPatenteValida(this.patente);
	}
	
	/**
	 * Valida la patente contra el tipo de vehiculo ingresado
	 * 
	 * @param tipoVehiculo
	 * @return
	 */
	public Boolean isPatenteMatchTipoVehiculo(TipoVehiculo tipoVehiculo){
		return isPatenteValida(this.patente, tipoVehiculo);
	}
	
	
	/**
	 * getter patente
	 * @return
	 */
	public String getPatente(){
		return this.patente;
	}
}

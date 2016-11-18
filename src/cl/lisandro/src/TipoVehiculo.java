package cl.lisandro.src;

public enum TipoVehiculo {
	AUTO(1), MOTO(2), CARRO_ARRASTRE(3);

	private int index;

	TipoVehiculo(int index) {
		this.index = index;
	}

	public int getIndex() {
		return this.index;
	}

}

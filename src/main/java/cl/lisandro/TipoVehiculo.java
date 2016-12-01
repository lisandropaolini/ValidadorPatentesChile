package cl.lisandro;

public enum TipoVehiculo implements Validation {

	AUTO {
		public Boolean isValid(String patente) {
			return ValidadorPatente.isPatenteAuto(patente);
		}

		public String setNormalized(String patente) {
			return patente;
		}

		public String setComplete(String patente) {
			return patente;
		}
	},
	MOTO {
		public Boolean isValid(String patente) {
			return ValidadorPatente.isPatenteMoto(patente);
		}

		public String setNormalized(String patente) {
			if (ValidadorPatente.isBeNormalized(patente)) {
				return ValidadorPatente.getNormalized(patente);
			}
			return patente;
		}

		public String setComplete(String patente) {
			if (ValidadorPatente.isPatenteMotoNotComplete(patente)) {
				return ValidadorPatente.getComplete(patente);
			}
			return patente;
		}
	};

}

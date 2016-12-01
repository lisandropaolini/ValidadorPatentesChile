# ValidadorPatentesChile

Validador de patentes de Chile.


Se encuentra en pre-beta, ya que solo valida las patentes segun tipo de vehiculo en forma macro.

segun lo reglamentado...

las patentes de automoviles vijentes pueden ser de formato

	LLnnnn con serie de AA1000 a ZZ9999
	LLLLnn con serie de BBBB10 a ZZZZ99

las patentes de moto vigentes pueden ser de formato

	LL0nnn con serie AA0000 a ZZ0999
	LLL0nn con serie BBB000 a ZZZ099


API

	String patente = "XXXO12";
	TipoVehiculo tipo = TipoVehiculo.MOTO;

	if( !tipo.isValid(patente)){
			patente = tipo.setNormalized(patente);
			patente = tipo.setComplete(patente);
		}

slds
lp

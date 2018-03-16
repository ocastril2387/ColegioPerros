package ejercicios;

public enum Localidad {
	TEUSAQUILLO ("Teusaquillo"),
	SUBA ("Suba"),
	USAQUEN ("Usaqu�n"),
	CHAPINERO ("Chapinero");
	
	private final String localidad;
	
	private Localidad(String localidad) {
		this.localidad = localidad;
	}
	
	String getLocalidad() {
		return localidad;
	}
}

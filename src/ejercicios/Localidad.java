package ejercicios;

public enum Localidad {
	TEUSAQUILLO ("Teusaquillo"),
	SUBA ("Suba"),
	USAQUEN ("Usaquén"),
	CHAPINERO ("Chapinero");
	
	private final String localidad;
	
	private Localidad(String localidad) {
		this.localidad = localidad;
	}
	
	String getLocalidad() {
		return localidad;
	}
}

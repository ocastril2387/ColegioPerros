package ejercicios;

import java.util.ArrayList;

public class PruebaPerro {
	public static void main(String[] args) {
		
		ArrayList<Perro> perrosLocalidadChapinero = new ArrayList<>();
		ArrayList<Perro> perrosLocalidadSuba = new ArrayList<>();
		ArrayList<Perro> perrosLocalidadTeusaquillo= new ArrayList<>();
		ArrayList<Perro> perrosLocalidadUsaquen= new ArrayList<>();
		
		for(int i = 0; i < obtenerPerros().length; ++i) {
			switch (obtenerPerros()[i].getLocalidad()) {
				case CHAPINERO:	
					perrosLocalidadChapinero.add(obtenerPerros()[i]);
					break;
				case SUBA:
					perrosLocalidadSuba.add(obtenerPerros()[i]);
					break;
				case TEUSAQUILLO:
					perrosLocalidadTeusaquillo.add(obtenerPerros()[i]);
					break;
				case USAQUEN:
					perrosLocalidadUsaquen.add(obtenerPerros()[i]);
			}
		}
		
		if(perrosLocalidadChapinero.size() > 0) {
			System.out.println("Perros localidad Chapinero:\n");
			
			for (Perro perro : perrosLocalidadChapinero) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadSuba.size() > 0) {
			System.out.println("\nPerros localidad Suba:\n");
			
			for (Perro perro : perrosLocalidadSuba) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadTeusaquillo.size() > 0) {
			System.out.println("\nPerros localidad Teusaquillo:\n");
			
			for (Perro perro : perrosLocalidadTeusaquillo) {
				System.out.println(perro.toString());
			}
		}
		
		if(perrosLocalidadUsaquen.size() > 0) {
			System.out.println("\nPerros localidad Usaquén:\n");
			
			for (Perro perro : perrosLocalidadUsaquen) {
				System.out.println(perro.toString());
			}
		}
	}
	
	public static Perro[] obtenerPerros() {
		Perro[] perros = new Perro[10];
		
		perros[0] = new Perro("Tony", "Akita", Localidad.CHAPINERO, "123123", "Julio", "3111114444", DiaSemana.DOMINGO);
		perros[1] = new Perro("Rosy", "Bull Terrier", Localidad.CHAPINERO, "951456", "Carlos", "3222225555", DiaSemana.SABADO);
		perros[2] = new Perro("Rams", "Boyero de Berna", Localidad.CHAPINERO, "951753", "Sofía", "3222224444", DiaSemana.VIERNES);
		perros[3] = new Perro("Cator", "Airedale terrier", Localidad.SUBA, "753456", "Tomás", "3011114664", DiaSemana.LUNES);
		perros[4] = new Perro("Truman", "Bóxer", Localidad.SUBA, "995566", "Lorena", "3202012345", DiaSemana.LUNES);
		perros[5] = new Perro("Antira", "Beagle", Localidad.TEUSAQUILLO, "4568723", "Edward", "3136547895", DiaSemana.MARTES);
		perros[6] = new Perro("Lucy", "Samoyedo", Localidad.TEUSAQUILLO, "100054", "Juan", "3015498752", DiaSemana.MIERCOLES);
		perros[7] = new Perro("Arvel", "Pastor belga", Localidad.TEUSAQUILLO, "539716", "Angela", "3224568526", DiaSemana.VIERNES);
		perros[8] = new Perro("Robert", "Norfolk terrier", Localidad.USAQUEN, "579314", "Andrea", "3010185245", DiaSemana.MIERCOLES);
		perros[9] = new Perro("Tira", "San Bernardo", Localidad.USAQUEN, "85274136", "Yarelis", "3015649514", DiaSemana.JUEVES);
		
		return perros;
	}
}

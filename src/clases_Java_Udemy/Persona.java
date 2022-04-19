package clases_Java_Udemy;


/**
 * una clase es una plantilla (template) a partir de la cual creamos objetos 
 * por ejemplo una clase llamada persona con atributos y metodos que abstrae informacion 
 * del mundo real.  
 * para poder trabajar con la clase se realiza la instancia del objeto.
 */

public class Persona { // la clase debe de iniciar con mayuscula.

	// se recomienda declarar los atributos al incio de la clase.
	// nombre, genero, ocupación
	
	String nombre;
	String apellido;
	
	// posterior los metodos:  obtener nombre, obtenerGenero(),modificarNombre().
	// para usar la clase debemos crear objetos (instanciar).
    
	
	public void desplegarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		
	}
}

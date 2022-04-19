package clases_Java_Udemy;

public class PruebaPersona {

	public static void main(String[] args) {
		
     Persona persona; // define variable de tipo persona.
	 persona = new Persona();	// se mandó llamar a un constructor de manera automatica.
	 // las variables y los objetos se almacenan en diferentes secciones de memoria. 
     // el constructor reserva memoria para que se pueda crear el objeto.
	 // una vez que se termina de crear el objeto el constructor regresa la referencia de memoria.
	 
	 persona.nombre = "Juan";
	 persona.apellido = "perez";
	 persona.desplegarInformacion();
	 
	 // cada vez que observamos la palabra reservada "new" es porque estamos creando un nuevo objeto.
	 
	 Persona persona2 = new Persona();
	 System.out.println("persona2 = " + persona2);
	 persona2.desplegarInformacion();
	 
	}

}

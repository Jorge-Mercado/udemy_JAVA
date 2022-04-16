package basico;

public class EtiquetasLabels {

	// una etiqueta nos va a permitir indicar a las palabras continue y break, ir hacia un lugar especifico del programa
	//esto no es muy recomendable de aplicar debido a que es programación de tipo goto.
	//puede romper con la logica de nuestros programas y no es buena practica.
	
	
	public static void main(String[] args) {
		inicio: // manejo de etiquetas es simplemente Agregar un texto al cual debemos irnos
		for(var counter =0; counter <3;counter++) {
			if(counter % 2 != 0){
			 continue inicio; // podemos decirle que vamos hacia una etiqueta
			                  //esto podria ser util dentro de un ciclo for anidado unicamente.
			}
			System.out.println("contador: " + counter);
		}
		
		
		for(var counter =0; counter <3;counter++) {
			if(counter % 2 == 0){
				System.out.println("contador: " + counter);
				break; // podemos indicarle que valla hacia la etiqueta de inicio.
				       // con esta etiqueta puedes romper ciclos for anidados.
			}			
		}
		

	}

}

package basico;

public class BreakContinue {

	public static void main(String[] args) {
		
		for(var counter =0; counter <3;counter++) {
			if(counter % 2 != 0){
			 continue; // ya no va a ejecutar nada más de nuestro ciclo for
			 // las siguientes lineas las va a omitir y nos vamos a ir a la siguiente iteración
			}
			System.out.println("contador: " + counter);
		}
		
		/*
		for(var counter =0; counter <3;counter++) {
			if(counter % 2 == 0){
				System.out.println("contador: " + counter);
				break; // termina todo el ciclo completo que se está ejecutando
			}			
		}
		*/

	}

}

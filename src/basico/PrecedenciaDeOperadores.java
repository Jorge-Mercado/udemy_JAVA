package basico;

public class PrecedenciaDeOperadores {

	public static void main(String[] args) {
		/*
		 * prioridad   operador                     tipo de operacion 
		 * 
		 *  1    ++,--,suma unaria, resta unaria, cambio de bit unario----- (operadores unarios )
		 * 
		 *  2   (tipo) si utilizamos parentesis modificamos el orden de evaluacion de nuestras expresiones
		 *      los parentesis tienen un orden de prioridad bastante alto
		 * 
		 *  3    operaciones aritmeticas de multiplicación, división, y residuo
		 *  
		 *  4    operaciones aritmeticas de suma y resta, y la concatenacion de cadenas
		 *  
		 *  5   la tabla completa de prioridades está en documentos/RECURSOS_UDEMY_JAVA
		 *  y tambien en el folder img del proyecto udemy_java
		 *  
		 * 
		 */
		
		// la precedencia de operadores es la prioridad que tienen unos operadores respecto a otros
		var x = 5; 
		var y = 10; 
		var z = ++x + y--;
		System.out.println("z= " +z);
		
		
		
	}

}

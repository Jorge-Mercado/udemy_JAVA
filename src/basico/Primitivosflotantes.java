package basico;

public class Primitivosflotantes {

	public static void main(String[] args) {
	
		/* tipos flotantes:
		 * 
		 * float 32 bits
		 * double 64 bits 
		 * 
		 * al utilizar notación de punto flotante, el tipo float puede almacenar valores más grandes
		 * que un tipo int o un tipo long, sólo por utilizar notaciones exponenciales
		 * 
		 * */
		
		
		// las literales de punto flotante en JAVA por default son de tipo double
		// un double con 64 bits no se alamcena de manera inmediata a un tipo float
		
		float  numeroFloat = 10.0F; // poner la f es una forma  de solucionar este problema
		// o indicar al compilador que de igual forma convierta a tipo float (float)10.0;
		
		System.out.println("numeroFloat: " + numeroFloat);
        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE );
        System.out.println("valor minimo tipo float: " + Float.MAX_VALUE );
	}

}

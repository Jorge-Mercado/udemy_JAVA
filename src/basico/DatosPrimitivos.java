package basico;
import java.util.*;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/**
		 * tipos primitivos enteros: byte,short,int,long y char.
		 */
		
		byte numeroByte = (byte)129;  // ya se pasó del rango, anteponiendo (byte) obligamos a covertir el valor de
		// entero a byte 
		System.out.println("valor byte: " + numeroByte); // impresicion por superar el rango que soporta el tipo de dato
		System.out.println("valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768; // forzamos a realizar la conversion perdiendo precision 
		System.out.println("numeroShort: " + numeroShort);
		System.out.println("valor minimo de Short: " + Short.MIN_VALUE);
        System.out.println("valor maximo Short: " + Short.MAX_VALUE);
        
        // lo más recomendable siempre es utilizar el tipo primitivo INT
        
        int numeroInt = 10; // si sobrepasamos el tamaño de int, debemos agregar una L mayuscula al final de los numeros
        System.out.println("numeroInt: " + numeroInt);
		System.out.println("valor minimo de Int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo Int: " + Integer.MAX_VALUE);
        
        long numeroLong = 10; // si nos pasamos de tipo Long, agregamos una F o una D de double.
        System.out.println("numeroLong: " + numeroLong);
		System.out.println("valor minimo de Short: " + Long.MIN_VALUE);
        System.out.println("valor maximo Short: " + Long.MAX_VALUE);
	}

}

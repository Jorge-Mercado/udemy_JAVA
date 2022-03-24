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
	}

}

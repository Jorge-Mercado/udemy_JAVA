package basico;
import java.util.*;

public class ConversionTiposPrimitivos {

	public static void main(String[] args) {
		// convertir un tipo string a un tipo int 
		var edad = Integer.parseInt("20"); // recibe un valor de una cadena y lo convierte a un tipo entero
		// en lugar de ser de tipo string se va a hacer de tipo entero
        System.out.println("edad: " + (edad + 1));
        
        // convertir un tipo de dato String a double 
         var valorPI = Double.parseDouble("3.1416");
         System.out.println("valorPI: " + valorPI);
         // esto nos va a servir cuando estemos trabajando con la clase escanner
         
         var consola = new Scanner(System.in);
         System.out.println("proporciona tu edad: ");
         edad = Integer.parseInt(consola.nextLine());
         System.out.println("Edad = " + edad);
         
         // vamos a convertir un tipo Int a un tipo String 
         
         var EdadTexto = String.valueOf(10);
         System.out.println("EdadTexto: " + EdadTexto);
         
         // conversion de tipo String a tipo caracter 
         var caracter = "hola".charAt(0);
         System.out.println("Caracter: " + caracter);
         
         
         
         
	}

}

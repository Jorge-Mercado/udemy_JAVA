package basico;

public class EjercicioTipoChar {

	public static void main(String[] args) {
		
		
		var miCaracter = 'a'; // almacena sólo un caracter y se usan comillas simples.
		System.out.println("miCaracter: " + miCaracter);
		// ahora vamos a usar los caracteres manejando unicode ( list of unicode characters)
		var varChar = '\u0021'; // la inferencia se hace con Char porque estamos usando unicode
		System.out.println("varChar: " + varChar);
		
		// tambien podemos utilizar el código decimal asociado en unicode
		
		var varCharDecimal = 33; // en la inferencia se hace de tipo entera por la literal, en este caso no es char
		// deberemos hacer una conversion (char)
		System.out.println("varCharDecimal: " + varCharDecimal);
		
		// tambien podemos asignar directamente el simbolo: char varCharSimbolo = '!';
		var varCharSimbolo = '!';
		System.out.println("varCharSimbolo: " + varCharSimbolo);
		
		// un tipo char se puede convertir a un tipo entero 
         
	}

}

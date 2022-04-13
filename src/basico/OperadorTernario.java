package basico;

public class OperadorTernario {

	public static void main(String[] args) {
		
		var resultado = (1 > 2) ? "verdadero" : "falso" ;
		System.out.println("resultado: " + resultado);
		
		// vamos a preguntar si este numero es par o impar reutilizando nuestra variable de resultado.
		var numero = 7;
		resultado = (numero % 2 == 0) ? "es numero par" : "es numero impar" ;
		System.out.println(resultado);
		
		var cadena1 = "hola";
		var cadena2 = "hola";
		var e = cadena1 == cadena2;
		// si e nos da true es porque tiene que ver con otros factores como el manejo de cadenas en java
		// en ningun momento está comparando el contenido, lo que realmente compara es 
		//la referencia de  memoria del objeto que almacena la variable
		System.out.println("e = " + e);
		//para realmente comparar el contenido de la cadena se hace lo siguiente
		
        var f = cadena1.equals(cadena2);// esta es la forma correcta para comparar el contenido de una cadena
        System.out.println("f= " +f);
	}

}

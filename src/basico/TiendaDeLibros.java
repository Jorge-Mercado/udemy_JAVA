package basico;
import java.util.*;

public class TiendaDeLibros {

	public static void main(String[] args) {
	
		var SC = new Scanner(System.in);
		System.out.println("ingresa tu nombre:");
		var nombre = SC.nextLine();
        System.out.println("proporciona el id: ");
        var Id = Integer.parseInt(SC.nextLine());
        System.out.println("proporciona el precio: ");
        var precio = Double.parseDouble(SC.nextLine());
        System.out.println("proporciona el envio gratuito:");
        var envio = Boolean.parseBoolean(SC.nextLine());
        
        System.out.println(nombre + " #" + Id);
        System.out.println("Precio: $" +precio);
        System.out.println("Envio Gratuito: " + envio);
        
	}

}

package basico;
import java.util.*;

public class Rectanguloarea {

	public static void main(String[] args) {
	
		Scanner SC = new Scanner(System.in);
		System.out.println("porgrama que calcula el area de un rectangulo");
		System.out.println("introduce el alto: ");
		var alto = SC.nextInt();
		System.out.println("introduce el ancho: ");
		var ancho = SC.nextInt();
		
		var Area = alto *ancho;
		var perimetro = (alto + ancho)*2;
		System.out.println("Area: " + Area);
		System.out.println("perimetro: " + perimetro);

	}

}

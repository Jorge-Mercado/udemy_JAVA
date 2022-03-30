package basico;

public class TipoPrimitivoBoolean {

	public static void main(String[] args) {
		
		boolean varBoolean = true;  // valores de tipo bandera
		System.out.println("varBoolean: " + varBoolean);
		
		
		if(varBoolean) {
			
			System.out.println("la bandera es verdadera");
		}else {
			
			System.out.println("la bandera es falsa");
		}
		
		
		var edad = 30;
		var esAdulto = edad >= 18;
		if(esAdulto) {
			
			System.out.println("eres mayor de edad");
			
		}else {
			
			System.out.println("eres menor de edad");
		}
		
		
		

	}

}

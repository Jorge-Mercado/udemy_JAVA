
package pasoPorValor;

public class PasoPorValor {
    
    public static void main(String[] args) {
        // todos los metodos que mandemos a llamar desde el metodo main
        // tienen que ser estaticos.
        var x = 10; // se puede usar var porque está en modo local.
        System.out.println("x= " + x);
        // deseamos modificar el valor de esta variable desde otro metodo
        //sin embargo,debido a que unicamente le vamos a pasar una copia de su valor 
        //esto no va a ser posible. no podemos modificar el valor de esta variable
        // definida en un metodo,  y modificarla desde otro metodo.
        // solamente se pasa la copia del valor.
        
        cambioValor(x);
        System.out.println("nuevo valor x:" + x);
    }
    
    public static void cambioValor(int arg1){
    
        System.out.println("arg1= " + arg1);
        arg1 = 15;
    }
    
}
 // resumen: solamente se pasa una copia del valor de nuestra variable al metodo que estamos mandando
// a llamar. pero este metodo no puede modificar el valor de la variable original. 
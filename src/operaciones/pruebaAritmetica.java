/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

      // si tienes constructores declarados, y quieres agregar el default
      // ya no lo hace, no debes tener constructores declarados para agregar
      // el constructor vacio.

public class pruebaAritmetica {
    public static void main(String[] args) {
        
        // variables locales porque estan adentro del metodo main.
        // var solamente puede utilizarse cuando trabajamos con variables locales
        var a = 10; 
        var b = 2;
        
        Aritmetica aritmetica1 = new Aritmetica(5,3);
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        /*
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
       System.out.println(aritmetica1.sumarConRetorno()); 
        
       var resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado: " +resultado);*/
    }
}

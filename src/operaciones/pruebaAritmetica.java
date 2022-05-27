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
        // el metodo main es un metodo estatico que solo puede mandar a llamar 
        //otros metodos estaticos.
        // variables locales porque estan adentro del metodo main.
        // var solamente puede utilizarse cuando trabajamos con variables locales
        var a = 10; 
        var b = 2;
        
        Aritmetica aritmetica1 = new Aritmetica(5,3); // se almacena en memoria heap.
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        metodo2();
        
        
        // si la variable aritmetica1 es local al metodo main, se destruye al 
        // finalizar el metodo, no es necesario igualarla a null 
        // los administradores de sistemas tienen sus metodos para limpiar la 
        // memoria de los programas.
        /*
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();
       System.out.println(aritmetica1.sumarConRetorno()); 
        
       var resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado: " +resultado);*/
    }
    
    public static void metodo2(){
    
        System.out.println("estoy utilizando el segundo metodo");
    }
    
    // Memoria stack y heap en java
    // las variables locales son almacenadas en la memoria Stack
    // los objetos se crean en lo que se conoce como la memoria Heap.
    //tambien los atributos de la clase se van a almacenar en la memoria heap.
    //en variables locales sólo se guardan las referencias al objeto.
    // si las variables son locales se almacenan en la memoria stack.
    // para regresar el valor solo hay que usar el return. 
}

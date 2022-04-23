
package operaciones;

// recomendado que nuestras clases empiecen con una mayúscula.
// atributos y metodos van con minusculas al inicio.
public class Aritmetica {
    // ausencia de valor para todos los tipos object es "null"
    // para tipo primitivos como int el default es "0"
    // boolean valor por default es "false".
    // primero definimos los atributos y despues los metodos.
    int a;
    int b;
    
    // metodo
    public void sumar (){
    
        int resultado = a+b;
        System.out.println("resultado= " + resultado);
    }
    
    public int sumarConRetorno (){
    
      return a +b;
    }
}

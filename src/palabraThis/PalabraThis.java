
package palabraThis;

// en java en un archivo solamente podemos tener una clase que es de tipo publico
// todas las demas no pueden ser public 
public class PalabraThis {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("apollo","paez");
        
    }
}


// si omitimos public su modificador de acceso se vuelve default. 
// default singifica que esta clase solo la vamos a poder acceder dentro del 
// mismo paquete. 
class Persona {

    String nombre;
    String apellido;
    
    // debemos de crear objetos de este tipo para realmente pasarle valores. 
    // como tenemos un constructor declarado, el compilador ya no agrega
    // el constructor vacio. 
    Persona(String nombre, String apellido){
       // utilizando super se manda a llamar el constructor de la clase padre
       // la clase object es la clase padre de todas las clases en java
       // super() es un constructor vacio, no pasamos ningun argumento
       //super(); // constructor de la clase padre (object) que se encarga
       //de reservar el espacio de memoria.
       // aunque no se ve, aqui hay una llamada implicita al constructor de la 
       // clase padre ( object()).
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " +this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    
    public Imprimir(){
    
    super(); //el constructor de la clase padre(object) para reservar memoria.
    
    }

    public void imprimir(Persona persona){
    
        System.out.println("persona desde imprimir: " + persona);
        System.out.println("impresion del objeto this: " +this);// apunta segun el objeto que se ejecuta
    }
}

package operaciones;

// recomendado que nuestras clases empiecen con una mayúscula.
// atributos y metodos van con minusculas al inicio.
// el constructor tiene el mismo nombre que la clase.
// si nuestras clases no tienen definido ningun constructor entonces se agrega
// el constructor por default.
public class Aritmetica {
    // ausencia de valor para todos los tipos object es "null"
    // para tipo primitivos como int el default es "0"
    // boolean valor por default es "false".
    // primero definimos los atributos y despues los metodos.
    int a;
    int b;
    
    //constructor default 
    // un constructor es un metodo especial. la unica vez que se puede 
    // mandar a llamar es cuando creamos nuestro objeto.
    public Aritmetica(){
        System.out.println("ejecutando constructor");
    }
    
    // sobre carga de constructores es agregar uno o más constructores a nuestra
    //clase.
    // var no se puede usar para definir argumentos de un metodo.
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("ejecutando constructor con argumentos");
    }
    
    // metodo
    public void sumar (){
    
        int resultado = a+b;
        System.out.println("resultado= " + resultado);
    }
    
    public int sumarConRetorno (){
    
      return this.a + this.b;
    }
    
    public int sumarConArgumentos( int a, int b){
    
        this.a = a; // this es una variable que apunta hacia el objeto que se ha creado en ese momento. 
        this.b = b; // con this especificamos que estamos usando los atributos de nuestra clase
        return this.sumarConRetorno(); // tambien especificamos que usamos el metodo de la clase.
        // los metodos estaticos no pueden acceder al operador this.
        // el operador this se destruye cuando se termina de usar la clase. es local.
    }
}

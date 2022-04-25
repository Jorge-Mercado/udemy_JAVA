
package Caja;


public class Caja {
   
    // atributos 
    int alto,ancho,profundo;
    // constructor 
    
    public Caja(){
        System.out.println("se usa constructor vacio");
        System.out.println("las variables se inicializan en 0");
    
    }
    public Caja(int arg1,int arg2,int arg3){
    
        this.alto = arg1;
        this.ancho = arg2;
        this.profundo = arg3;
        
        
    }
    
    // metodos 
    public double volumen(){
    
    var vol = this.alto * this.ancho * this.profundo;
    return vol;
    
    }
}

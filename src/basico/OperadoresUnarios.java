package basico;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		// first unary operator: sign change
		var a = 3;
		var b = -a;
		System.out.println("a = " + a);
		System.out.println("b = " + b); // b is equal to minus three due to the change in sign
		
		var c = true;
		var d = !c; // sign for not 
		System.out.println("c = " +c);
		System.out.println("d= " +d);
		
		// increments 
		// preincrement ( with the sign before the variable) 
		var e = 3;
		var f = ++e; //first the variable is incremented and then its value is used.
		System.out.println(" e = " + e);
		System.out.println(" f = " +f);
		// 2.- postincrement (with the sign after the variable)
		var g = 5;
		var h = g++; // first the variable is used, and then its value is incremented.
		System.out.println("g= " + g);
		System.out.println("h= " + h);
		
		
		
		

	}

}

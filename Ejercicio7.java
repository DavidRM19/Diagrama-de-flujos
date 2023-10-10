package entorno;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main( String[] args ) {
		
		
		Scanner teclado=new Scanner(System.in);

	int x;
	System.out.println( "Dime un número del 1 al 10: " );
	int a = teclado.nextInt();
	
	if (a>=0 && a<=10) {
		for (x=1 ; x<=10 ; x++) {
		System.out.println(a + " x " + x + " = " + x*a);
		}
		
	}
	
	}

}
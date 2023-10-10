package entorno;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main( String[] args ) {
		
		
		Scanner teclado=new Scanner(System.in);

	
	System.out.println( "Dime un número: " );
	int a = teclado.nextInt();
	int c=0;
	
	for(int b=1 ; b<=a ; b++) {
		c=c+b;
	}
	System.out.println( "La suma total es: " + c );
	
	}

}
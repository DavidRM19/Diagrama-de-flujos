package entorno;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main( String[] args ) {
		
		
		Scanner teclado=new Scanner(System.in);

	
	System.out.print( "Dime tu edad: " );
	int a = teclado.nextInt();
	
	if(a>=0 && a<12) {
		System.out.println( "Infante" );
	} else if (a>=12 && a<=17) {
		System.out.println( "Adolescente" );
	} else if (a>=18 && a<60) {
		System.out.println( "Adulto" );
	} else if (a>=60) {
		System.out.println( "Anciano" );
	}
	
	}

}
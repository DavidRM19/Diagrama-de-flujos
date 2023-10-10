package entorno;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main( String[] args ) {
		
		
		Scanner teclado=new Scanner(System.in);

	
	System.out.println( "Escribe el número de un dia de la semana: " );
	int a = teclado.nextInt();
	
	if(a<=0 || a>7) {
		System.out.println( "No existe ese dia de la semana" );
	} else if (a==1) {
		System.out.println( "Lunes" );
	} else if (a==2) {
		System.out.println( "Martes" );
	} else if (a==3) {
		System.out.println( "Miercoles" );
	} else if (a==4) {
		System.out.println( "Jueves" );
	} else if (a==5) {
		System.out.println( "Viernes" );
	} else if (a==6) {
		System.out.println( "Sabado" );
	} else if (a==7) {
		System.out.println( "Domingo" );
	}
	
	}

}
package entorno;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main( String[] args ) {
		
		
		Scanner teclado=new Scanner(System.in);

	
	System.out.println( "Escribe el número de un dia de la semana: " );
	int a = teclado.nextInt();
	
	if(a<=0 || a>7) {
		System.out.println( "No existe ese dia de la semana" );
		
	} switch(a) {
	  case 1:
		    System.out.println("Lunes");
		    break;
	  case 2:
		    System.out.println("Martes");
		    break;
	  case 3:
		    System.out.println("Miercoles");
		    break;
	  case 4:
		    System.out.println("Jueves");
		    break;
	  case 5:
		    System.out.println("Viernes");
		    break;
	  case 6:
		    System.out.println("Sabado");
		    break;
	  case 7:
		    System.out.println("Domingo");
		    break;
	}

}
}
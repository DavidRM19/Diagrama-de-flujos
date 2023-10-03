package hola_mundo;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Usamos la clase Scanner para leer por consola
		Scanner scanner = new Scanner(System.in);
		
		//definimos variables
		
		int distancia;
		int velocidad;
		float tiempo;
		
		//obtenemos datos
		
		System.out.print("Introduzca la distancia que vas a recorrer: ");
		distancia= scanner.nextInt();
		System.out.print("Introduzca la velocidad promedia: ");
		velocidad= scanner.nextInt();
		
		//operación
		
		tiempo= distancia / velocidad;
		System.out.print(tiempo + " horas");
	}

}

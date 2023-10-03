package hola_mundo;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Usamos la clase Scanner para leer por consola
		Scanner scanner = new Scanner(System.in);
		
		//definimos variables
		
		String nombre;
		String apellido;
		String saludo;
		
		//obtenemos datos
		
		System.out.print("Dime como te llamas: ");
		nombre= scanner.next();
		System.out.print("Dime como te apellidas: ");
		apellido= scanner.next();
		
		//operación
		
		saludo= "Hola " + nombre + " " + apellido + " Encantado";
		System.out.print(saludo);
	}

}
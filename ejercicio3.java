package hola_mundo;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int x,y,z;
		
		System.out.print("Escribe el primer número: ");
		x= scanner.nextInt();
		System.out.print("Escribe el segundo número: ");
		y= scanner.nextInt();
		System.out.print("Escribe el tercer número: ");
		z= scanner.nextInt();
		
		if ((x>y) && (x>z)) {
			System.out.print("El primer número es mayor");
		}
		else if ((y>x) && (y>z)) {
			System.out.print("El segundo número es mayor");
		}
		else {
			System.out.print("El tercer número es mayor");
		}
	}

}

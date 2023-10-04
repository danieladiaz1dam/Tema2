package ejer4;

import java.util.Scanner;

/*
 * Pedir dos números y mostrarlos ordenados de menor a mayor.
 */

public class Ejer4 {
	public static void main(String[] args) {
		// Variable 1
		int a;
		// Variable 2
		int b;
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pedir numeros al usuario
		System.out.println("Introduce dos numeros:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// Mirar cual es mas grande e imprimir
		if (a > b)
			System.out.println(String.format("Numero ordenados: %d %d", b, a));
		else
			System.out.println(String.format("Numero ordenados: %d %d", a, b));
		
		// Cerrar scanner
		sc.close();
	}
}

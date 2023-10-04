package ejer1;

import java.util.Scanner;

/*
 * Diseñar una aplicación que solicite al usuario
 * un número e indique si es par o impar.
 */

public class Ejer1 {
	public static void main(String[] args) {
		// Variable para guardar el numero del usuario
		int num;
		// Scanner
		Scanner sc = new Scanner(System.in);

		// Preguntar un numero al user
		System.out.print("Introduce un numero: ");
		// Guardar la respuesta
		num = sc.nextInt();

		// Mirar si es par o no, e imprimir
		if (num % 2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}

		// Cerrar el scanner
		sc.close();
	}
}

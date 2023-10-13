package ejer4;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números y muestre por pantalla si el número es par o impar
 * (indistintamente que sea positivo o negativo). El algoritmo terminará cuando el usuario introduzca el número cero.
 */

public class Ejer4 {
	public static void main(String[] args) {
		// Varaible para guardar el input del usuario
		int input = 0;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		// pedir el numero al usuario
		System.out.printf("Introduce un numero: ");
		// Guardar el numero
		input = sc.nextInt();

		while (input != 0) {
			// Imprimir si es par o impar
			System.out.printf("El numero es %s\n\n", input % 2 == 0 ? "par" : "impar");
			// pedir el numero al usuario
			System.out.printf("Introduce un numero: ");
			// Guardar el numero
			input = sc.nextInt();
		}

		System.out.printf("Exit.");

		// Cerrar scanner
		sc.close();
	}
}

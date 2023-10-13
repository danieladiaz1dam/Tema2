package ejer2;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir contando.
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo,
 * antes de acabar, mostrará la cantidad de números positivos introducidos por el usuario.
 */

public class Ejer2 {
	public static void main(String[] args) {
		// Varaible para ir guardando la cuenta
		int contador = 0;
		// Variable para el input del usuario
		int input = 0;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		// Pedir numero al usuario
		System.out.printf("Introduce un numero: ");
		// Guardar el numero
		input = sc.nextInt();

		// Pedir numero hasat que se introduzac uno negativo
		while (input >= 0) {
			// Pedir numero al usuario
			System.out.printf("Introduce un numero: ");
			// Guardar el numero
			input = sc.nextInt();
			// Añadir al contador
			contador += 1;
		}

		// Imprimir la suma total
		System.out.printf("La cantidad de numero positivos introducidos es de %d.", contador);

		// Cerrar scanner
		sc.close();
	}
}

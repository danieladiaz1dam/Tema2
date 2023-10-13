package ejer3;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
 * Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo,
 * antes de acabar, mostrará la media de los números positivos introducidos por el usuario.
 */

public class Ejer3 {
	public static void main(String[] args) {
		// Varaible para ir guardando la cuenta
		int suma = 0;
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

		// Pedir numero hasta que se introduzca uno negativo
		while (input >= 0) {
			// Pedir numero al usuario
			System.out.printf("Introduce un numero: ");
			// Guardar el numero
			input = sc.nextInt();
			// Añadir al contador y a la suma
			contador += 1;
			suma += input;

		}

		// Imprimir la suma total
		System.out.printf("La media de los numeros positivos introducidos es de %d.", suma / contador);

		// Cerrar scanner
		sc.close();
	}
}

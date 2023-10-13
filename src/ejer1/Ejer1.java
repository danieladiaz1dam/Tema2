package ejer1;

import java.util.Scanner;

/*
 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará
 * la suma de los números positivos introducidos por el usuario.
 */

public class Ejer1 {
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

		// Pedir numero hasat que se introduzca uno negativo
		while (input >= 0) {
			// añadir input anterior al contador, lo pongo 
			// arriba para no sumarle un numero negativo
			contador += input;
			// Pedir numero al usuario
			System.out.printf("Introduce un numero: ");
			// Guardar el numero
			input = sc.nextInt();
		}

		// Imprimir la suma total
		System.out.printf("La suma total es de %d.", contador);

		// Cerrar scanner
		sc.close();
	}
}

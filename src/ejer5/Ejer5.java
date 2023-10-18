package ejer5;

import java.util.Random;
import java.util.Scanner;

/*
 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo.
 * Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle
 * al ordenador si es mayor, menor o igual al número que ha pensado).
 */

public class Ejer5 {
	public static void main(String[] args) {
		// Variable input del usuario
		int num;
		// Variable input string del usuario
		String input;
		// Variable numero ordenador, y varaibles para guardar el rango
		int guessPC, max = 100, min = 1;
		// Scanner
		Scanner sc = new Scanner(System.in);
		// Random
		Random rand = new Random();

		// Pedirle numero al usuario
		System.out.printf("Introduce un numero del 1 al 100: ");
		// Guardar el input del usuario
		num = sc.nextInt();

		// Quitar el caracter de enter que queda
		sc.nextLine();

		// Generar el primer numero random
		guessPC = rand.nextInt(max - min) + min;

		// Preguntar al usuario si el numero que adivina el PC es menor o mayor al que
		// esta pensando
		do {
			System.out.printf("Rango [%d, %d]\n", min, max);
			System.out.printf("Tu numero es mayor o menor que %d?\n", guessPC);
			input = sc.nextLine();

			// Actualizar el rango
			if (input.equals("mayor")) {
				min = guessPC + 1;
			} else {
				max = guessPC;
			}

			guessPC = rand.nextInt(max - min) + min;

		} while (guessPC != num);

		System.out.printf("He adivinado que tu numero es %d.", guessPC);

		// Cerrar scanner
		sc.close();
	}
}

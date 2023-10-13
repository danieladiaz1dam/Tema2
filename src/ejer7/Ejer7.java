package ejer7;

import java.util.Scanner;
import java.util.Random;

/*
 * Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100
 * (generado aleatoriamente). Para ello se introduce por teclado una serie de números,
 * para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al
 * número secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).
 */

public class Ejer7 {
	public static void main(String[] args) {
		// Varaible con el numero a adivinar
		int guessNumber;
		// Varaible para guardar el input del usuario
		int input;
		// Variable scanner
		Scanner sc = new Scanner(System.in);
		// Variable random
		Random rn = new Random();
		
		// Generar numero entre 1 y 100
		guessNumber = rn.nextInt(99) + 1;
		
		// Pedir numero al usuario
		System.out.printf("Introduce un numero entre 1 y 100: ");
		// Guardar el numero
		input = sc.nextInt();
		
		while (input != guessNumber && input != -1) {
			// Comprobar si es menor o mayor
			if (guessNumber < input)
				System.out.printf("menor\n");
			else
				System.out.printf("mayor\n");
			
			// Pedir numero al usuario
			System.out.printf("Introduce un numero entre 1 y 100: ");
			// Guardar el numero
			input = sc.nextInt();
		}
		
		if (input == guessNumber)
			System.out.printf("Has ganado!");
		else 
			System.out.printf("Has perdido, el numero era %d.", guessNumber);

		// Cerrar scanner
		sc.close();
	}
}

package ejer8;

import java.util.Scanner;

/*
 * Repetir el ejercicio de los dados del boletín de SWITCH.
 * Mientras en la primera tirada no se introduzca un valor válido se le seguirá preguntando.
 * Lo mismo con la segunda tirada.
 */

public class Ejer8 {
	public static void main(String[] args) {
		// Variable pra guardar la tirada1
		String tirada1;
		// Variable para guardar la tirada1 pero en numero
		int numTirada1;
		// Variable pra guardar la tirada2
		String tirada2;
		// Variable para guardar la tirada2 pero en numero
		int numTirada2;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		do {
			// Preguntar al usuario por la primera tirada
			System.out.print("Introduce la primera tirada: ");
			// Guardar la tirada
			tirada1 = sc.nextLine().toUpperCase();
		} while (!tirada1.equals("UNO") && !tirada1.equals("DOS") && !tirada1.equals("TRES")
				&& !tirada1.equals("CUATRO") && !tirada1.equals("CINCO") && !tirada1.equals("SEIS"));

		// Mirar que numero es
		numTirada1 = switch (tirada1) {
		case "UNO":
			yield 1;
		case "DOS":
			yield 2;
		case "TRES":
			yield 3;
		case "CUATRO":
			yield 4;
		case "CINCO":
			yield 5;
		case "SEIS":
			yield 6;
		default:
			yield -1;
		};

		do {
			// Preguntar al usuario por la seunga tirada
			System.out.print("Introduce la segunda tirada: ");
			// Guardar la tirada
			tirada2 = sc.nextLine().toUpperCase();
		} while (!tirada2.equals("UNO") && !tirada2.equals("DOS") && !tirada2.equals("TRES")
				&& !tirada2.equals("CUATRO") && !tirada2.equals("CINCO") && !tirada2.equals("SEIS"));

		// Mirar que numero es
		numTirada2 = switch (tirada2) {
		case "UNO":
			yield 1;
		case "DOS":
			yield 2;
		case "TRES":
			yield 3;
		case "CUATRO":
			yield 4;
		case "CINCO":
			yield 5;
		case "SEIS":
			yield 6;
		default:
			yield -1;
		};

		// imprimir info al usuario
		if (numTirada1 == -1 || numTirada2 == -1)
			// somehow i guess
			System.out.println("Alguna de las dos tiradas es inválida");
		else
			System.out.printf("La suma de las tiradas es %d.", numTirada1 + numTirada2);

		// Cerrar scanner
		sc.close();
	}
}

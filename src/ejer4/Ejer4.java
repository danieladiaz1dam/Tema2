package ejer4;

import java.util.Scanner;

/*
 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que haría el usuario.
 * El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará
 * esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”).
 * Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada
 * y el usuario también dará esa información en formato cadena.
 * Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.
 */

public class Ejer4 {
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
		
		// Preguntar al usuario por la primera tirada
		System.out.print("Introduce la primera tirada: ");
		// Guardar la tirada
		tirada1 = sc.nextLine().toUpperCase();
		
		// Mirar que numero es
		numTirada1 = switch(tirada1) {
		case "UNO" -> { yield 1; }
		case "DOS" -> { yield 2; }
		case "TRES" -> { yield 3; }
		case "CUATRO" -> { yield 4; }
		case "CINCO" -> { yield 5; }
		case "SEIS" -> { yield 6; }
		default -> { yield -1; }
		};
			
		// Preguntar al usuario por la segunda tirada
		System.out.print("Introduce la segunda tirada: ");
		// Guardar la tirada
		tirada2 = sc.nextLine().toUpperCase();
		
		// Mirar que numero es
		numTirada2 = switch(tirada2) {
		case "UNO" -> { yield 1; }
		case "DOS" -> { yield 2; }
		case "TRES" -> { yield 3; }
		case "CUATRO" -> { yield 4; }
		case "CINCO" -> { yield 5; }
		case "SEIS" -> { yield 6; }
		default -> { yield -1; }
		};
		
		// imprimir info al usuario
		if (numTirada1 == -1 || numTirada2 == -1)
			System.out.println("Alguna de las dos tiradas es inválida");
		else
			System.out.printf("La suma de las tiradas es %d.", numTirada1 + numTirada2);
		
		
		// Cerrar scanner
		sc.close();
	}
}

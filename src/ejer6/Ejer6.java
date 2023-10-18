package ejer6;

import java.util.Scanner;

/* 
 * juego de PIEDRA - PAPEL - TIJERA
 */

public class Ejer6 {
	public static void main(String[] args) {
		// Variable input del jugador 1 y del jugador 2 y la variable del ganador
		String p1, p2, winner;
		// Char para preguntar si salir del juego
		char input;
		// Variable para salir del juego
		boolean exit = false;
		// Variable del scanner
		Scanner sc = new Scanner(System.in);

		// Mientras no queramos salir
		do {

			// Guardar el input valido del jugador1
			do {
				System.out.printf("Jugador1, elige PIEDRA, PAPEL o TIJERA: ");
				p1 = sc.nextLine().toUpperCase();
			} while (!p1.equals("PIEDRA") && !p1.equals("PAPEL") && !p1.equals("TIJERA"));

			//System.out.printf("\n");

			// Guardar el input valido del jugador2
			do {
				System.out.printf("Jugador2, elige PIEDRA, PAPEL o TIJERA: ");
				p2 = sc.nextLine().toUpperCase();
			} while (!p2.equals("PIEDRA") && !p2.equals("PAPEL") && !p2.equals("TIJERA"));

			// Mirar quien gana
			if (p1.equals(p2))
				System.out.printf("\nEs un empate!\n\n");
			else {
				winner = switch (p1) {
				case "PIEDRA":
					yield p2.equals("PAPEL") ? "Jugador2" : "Jugador1";
				case "PAPEL":
					yield p2.equals("TIJERA") ? "Jugador2" : "Jugador1";
				case "TIJERA":
					yield p2.equals("PIEDRA") ? "Jugador2" : "Jugador1";
				default:
					yield "ERROR!!";
				};

				// Imprimir ganador
				System.out.printf("\n%s ha ganado la partida!!\n\n", winner);
			}

			// Preguntar si quiere jugar de nuevo
			System.out.printf("Quieres jugar de nuevo? [Y/N]: ");
			input = sc.nextLine().toUpperCase().charAt(0);

			if (input != 'Y' && input != 'S') {
				exit = true;
				System.out.printf("\nExit.");
			}
			
			// Clear screen, eclipse no deja hacer un clear ¡-¡
			System.out.printf("%s", "\n".repeat(15));

		} while (!exit);

		// Cerrar el scanner
		sc.close();
	}
}

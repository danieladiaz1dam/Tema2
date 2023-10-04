package ejer9;

import java.util.Scanner;

/*
 * Escribir un programa que simule el juego de
 * PIEDRA, PAPEL, TIJERA, pidiendo a cada jugador
 * que escriba PIEDRA, PAPEL o TIJERA. El juego
 * debe mostrar por pantalla quién ha ganado el
 * juego tras jugar una partida. Hay que
 * contemplar el caso de que empaten.
 */

public class Ejer9 {
	public static void main(String[] args) {
		// Variable para el input del jugador uno;
		String player1;
		// Variable para el input del jugador dos;
		String player2;
		// String para saber quien ha ganado
		String winner = "";
		
		// Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedir input al player1
		System.out.println("Player1 introduce PIEDRA, PAPEL o TIJERAS:");
		// Guardar su input
		player1 = sc.nextLine().toUpperCase();
		
		// Si el usuario introduce un valor no valido
		if (!player1.equals("PIEDRA") && !player1.equals("PAPEL") && !player1.equals("TIJERAS")) {
			System.out.println("El juagdor 1 ha introducido un valor inválido");
			sc.close();
			return;
		}
			
		// Pedir input al player2
		System.out.println("Player2 introduce PIEDRA, PAPEL o TIJERAS:");
		// Guardar su input
		player2 = sc.nextLine().toUpperCase();
		
		// Si el usuario introduce un valor no valido
		if (!player2.equals("PIEDRA") && !player2.equals("PAPEL") && !player2.equals("TIJERAS")) {
			System.out.println("El juagdor 2 ha introducido un valor inválido");
			sc.close();
			return;
		}
		
		// Comparar posibles resultados
		// EMPATE imprimimos y cerramos el programa
		if (player1.equals(player2)) {
			System.out.println("Es un empate");
			sc.close();
			return;
			// PIEDRA VS PAPEL
		} else if (player1.equals("PIEDRA"))
			winner = player2.equals("PAPEL")? "Player 2" : "Player 1";
		// PAPEL VS TIJERAS
		else if (player1.equals("PAPEL"))
			winner = player2.equals("TIJERAS")? "Player 2" : "Player 1";
		// TIJERAS VS PIEDRA
		else if (player1.equals("TIJERAS"))
			winner = player2.equals("PIEDRA")? "Player 2" : "Player 1";
		
		// Imprimir el ganador
		System.out.println(winner + " wins!!");
		
		// Cerrar el Scanner
		sc.close();
	}
}

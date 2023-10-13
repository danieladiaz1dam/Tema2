package ejer1;

import java.util.Scanner;

/*
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
 * 
 * insuficiente (de 0 a 4)
 * suficiente (5)
 * bien (6)
 * notable (7 y 8)
 * sobresaliente (9 y 10)
 */

public class Ejer1 {
	public static void main(String[] args) {
		// Variable para guardar la nota
		byte nota;
		// Variable para guardar el resultado
		String res;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		// Pedir nota al usuario
		System.out.print("Introduce una nota del 0 al 10: ");
		// Guardar la nota
		nota = sc.nextByte();

		// Guardar el resultado de cada nota
		res = switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			yield "Insuficiente";
		}
		case 5 -> {
			yield "Suficiente";
		}
		case 6 -> {
			yield "Bien";
		}
		case 7, 8 -> {
			yield "Notable";
		}
		case 9, 10 -> {
			yield "Sobresaliente";
		}
		default -> {
			yield "Invalida";
		}
		};
		
		// Imprimir el resultado
		System.out.println(String.format("La nota %d es %s", nota, res));

		// Cerrar Scanner
		sc.close();
	}
}

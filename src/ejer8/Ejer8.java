package ejer8;

import java.util.Scanner;

/*
 * Un centro de investigación de la flora urbana necesita una
 * aplicación que muestre cuál es el árbol más alto. Para ello 
 * se introducirá por teclado la altura (en centímetros) de
 * cada árbol (terminando la introducción de datos cuando se
 * utilice -1 como altura).
 * La aplicación debe devolver la altura del árbol más alto.
 */

public class Ejer8 {
	public static void main(String[] args) {
		// Variable para guardar el input del usuario
		int input;
		// Varaible para guardar el arbol mas alto
		int max = 0;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		// Pedir altura al usuario
		System.out.printf("Introduce la altura del arbol: ");
		// Guardar la altura
		input = sc.nextInt();

		while (input != -1) {
			// Si el input es mayor que max, lo asignamos
			max = input > max ? input : max;

			// Pedir altura al usuario
			System.out.printf("Introduce la altura del arbol: ");
			// Guardar la altura
			input = sc.nextInt();
		}
		
		// Imprimir el arbol mas alto
		System.out.printf("La altura maxima es de %dcm", max);

		// Cerrar scanner
		sc.close();
	}
}

package ejer7;

import java.util.Scanner;

/*
 * Repetir el ejercicio de la calculadora del boletín de SWITCH de forma
 * que se añada una opción más al menú, quedando el menú así:
 * A) SUMAR LOS NÚMEROS
 * B) RESTAR LOS NÚMEROS
 * C) MULTIPLICAR LOS NÚMEROS
 * D) DIVIDIR LOS NÚMEROS
 * E) SALIR
 *
 */

public class Ejer7 {
	public static void main(String[] args) {
		// Variables para los numeros y el resultado
		float num1, num2, res;
		// Variable para salir y para imprimir o no
		boolean exit = false, print = true;
		// Varaible para introducir la opcion
		char c;
		// Variable Scanner
		Scanner sc = new Scanner(System.in);

		do {
			// Pedir los numeros al usuario
			System.out.printf("Introduce dos numeros: ");
			num1 = sc.nextFloat();
			num2 = sc.nextFloat();
			// quitar el salto de linea \n
			sc.nextLine();

			// Imprimir el menu
			System.out.printf("Puedes hacer estas operaciones: \n");
			System.out.printf("A) SUMAR LOS NÚMEROS\n");
			System.out.printf("B) RESTAR LOS NÚMEROS\n");
			System.out.printf("C) MULTIPLICAR LOS NÚMEROS\n");
			System.out.printf("D) DIVIDIR LOS NÚMEROS\n");
			System.out.printf("E) SALIR\n");
			c = sc.nextLine().toUpperCase().charAt(0);

			// Calcular el resultado
			res = switch (c) {
			case 'A':
				yield num1 + num2;
			case 'B':
				yield num1 - num2;
			case 'C':
				yield num1 * num2;
			case 'D':
				yield num1 / num2;
			case 'E':
				print = false;
				exit = true;
				yield 0;
			default:
				System.out.printf("Error!!");
				print = false;
				yield 0;
			};

			// Imprimir el resultado
			// (i) Imprimir el resultado como una String (%s),
			// formatea el float / double sin numeros decimales innecesarios
			// Ej: 4.0 en vez de 4.00000
			// Para quitar el .0 habria que comprobar si el double == (long)double
			// es decir, mirar si es el mismo numero, quitando la parte decimal
			// e imprimirlo como numero entero (%d)
			// https://stackoverflow.com/questions/703396/how-to-nicely-format-floating-numbers-to-string-without-unnecessary-decimal-0s
			if (print)
				if (res == (long) res)
					System.out.printf("El resultado es %d\n\n", (long) res);
				else
					System.out.printf("El resultado es %s\n\n", res);
			else
				System.out.printf("\nExit.");

		} while (!exit);

		// Cerrar scanner
		sc.close();
	}
}

package ejer4;

import java.util.Scanner;

/*
 * Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado.
 */

public class Ejer4 {
	public static void main(String[] args) {
		// Variable para el input del usuario
		int input;
		// Variable de incremento
		int i = 1;
		// Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		// Preguntar numero al usuario
		System.out.printf("Introduce un numero: ");
		// Guardar el numero
		input = sc.nextInt();
		
		// Imprimir la tabla de multiplicar
		do {
			System.out.printf("%d x %2d = %2d\n", input, i, input*i);
			i++;
		} while (i <= 10);
		
		// Cerrar el scanner
		sc.close();
	}
}

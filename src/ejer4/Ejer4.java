package ejer4;

import java.util.Scanner;

/*
 * Realiza un programa que cuente los múltiplos de 3
 * desde el 1 hasta un número que introducimos por teclado.
 */

public class Ejer4 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		// Preguntar numero
		System.out.printf("Introduce un numero: ");
		num = sc.nextInt();

		// Imprimir numero de 3 en 3
		for (int i = 0; i <= num; i += 3)
			System.out.printf("%d\n", i);

		sc.close();
	}
}

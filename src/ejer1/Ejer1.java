package ejer1;

import java.util.Scanner;

/* 
 * Escribir una aplicación para aprender a contar,
 * que pedirá un número n y mostrará todos los números del 1 al n.
 */

public class Ejer1 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);

		// Preguntar numero al usuario
		System.out.printf("Introduce un numero: ");
		num = sc.nextInt();

		// Contar
		for (int i = 1; i <= num; i++)
			System.out.printf("%d\n", i);

		sc.close();
	}
}

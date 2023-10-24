package ejer10;

import java.util.Scanner;

/*
 * Realiza un programa que pida dos números enteros A y B,
 * siendo B mayor que A. Luego visualiza los números desde A hasta B.
 */

public class Ejer10 {
	public static void main(String[] args) {
		int a, b, tmp;
		Scanner sc = new Scanner(System.in);

		// Pedir dos numeros
		System.out.printf("Introduce un rango: ");
		a = sc.nextInt();
		b = sc.nextInt();

		// Si b es mayor que a, intercambiar sus valores
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		System.out.printf("\nrango [%d, %d]: ", a, b);
		
		// Imprimir el rango de numeros introducidos
		for (int i = a; i <= b; i++) {
			// Si es el ultimo numero, no imprimir la coma
			if (i == b)
				System.out.printf("%d\n", i);
			else
				System.out.printf("%d, ", i);
		}
		
		System.out.println("\nExit.");

		sc.close();
	}
}

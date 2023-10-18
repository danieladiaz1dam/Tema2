package ejer2;

/*
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
 */

public class Ejer2 {
	public static void main(String[] args) {
		// Variable de incremento
		int i = 0;

		do {
			// Imprimir i
			System.out.printf("%d\n", i);
			// Sumarle i + 2, para que sigan siendo numeros pares
			// sin necesidad de un if
			i += 2;
		// Hasta el 200
		} while (i <= 200);
	}
}

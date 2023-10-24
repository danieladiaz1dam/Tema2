package ejer2;

/*
 * Realiza un programa que muestre los números pares
 * comprendidos entre el 1 y el 200. Para ello suma de 2 en 2.
 */

public class Ejer2 {
	public static void main(String[] args) {
		// Contar de 2 en 2
		for (int i = 2; i <= 200; i += 2) {
			System.out.printf("%3d ", i);
			// Formatear para ponerlo pretty
			if (i % 10 == 0)
				System.out.printf("\n");
		}
	}
}

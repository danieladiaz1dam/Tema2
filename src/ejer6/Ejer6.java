package ejer6;

/* 
 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
 */

public class Ejer6 {
	public static void main(String[] args) {
		int suma = 0;

		// Sumar los pares
		for (int i = 0; i < 10; i += 2) {
			if (i == 8)
				System.out.printf("%d", i);
			else
				System.out.printf("%d + ", i);
				
			suma += i;
		}

		// Imprimir
		System.out.printf(" = %d.", suma);
	}
}

package ejer1;

/*
 * Realiza un programa que muestre por pantalla los
 * 20 primeros números naturales (1, 2, 3... 20).
 */

public class Ejer1 {
	public static void main(String[] args) {
		// Variable de incremento
		int i = 1;
		
		// Imprimir numeros del 1 al 19 (con coma)
		do {
			System.out.printf("%d, ", i);
			i++;
		} while (i <= 19);
		
		// Imprimir el ultimo numero (sin la coma)
		System.out.printf("20");
	}
}

package ejer7;

import java.util.Scanner;

/*
 * Pedir un número y calcular su factorial.
 * Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.
 */

public class Ejer7 {
	public static void main(String[] args) {
		int num, res = 1;
		Scanner sc = new Scanner(System.in);

		// Preguntar el numero
		System.out.printf("Introduce un numero: ");
		num = sc.nextInt();

		// Calcular el factorial
		for (int i = 1; i <= num; i++)
			res *= i;

		// Imprimir resultado
		System.out.printf("%d! es %d", num, res);

		sc.close();
	}
}

package ejer5;

import java.util.Scanner;

/*
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

public class Ejer5 {
	public static void main(String[] args) {
		// Variable 1
		int a;
		// Variable 2
		int b;
		// Variable 3
		int c;
		// Variable temporal
		int tmp;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Preguntar al usuario por tres numeros
		System.out.println("Introduce tres numeros:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// Reordenarlos de mayor a menor
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if (b < c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		// Imprimir numeros ordenados
		System.out.println(String.format("\nNumero ordenados: %d %d %d", a, b, c));

		// Cerrar Scanner
		sc.close();
	}
}

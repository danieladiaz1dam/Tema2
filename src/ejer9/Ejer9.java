package ejer9;

import java.util.Scanner;

/*
 * Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */

public class Ejer9 {
	public static void main(String[] args) {
		int num;
		boolean primo = true;
		Scanner sc = new Scanner(System.in);

		// Pedir numero
		System.out.printf("Introduce un numero: ");
		num = sc.nextInt();

		// Mirar si tiene algun numero q lo divida
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// Si encontramos algun numero que lo divida, salir
				primo = false;
				break;
			}
		}
		
		// imprimir si es primo o no
		if (primo)
			System.out.printf("%d es primo.\n", num);
		else
			System.out.printf("%d no es primo.\n", num);

		sc.close();
	}
}

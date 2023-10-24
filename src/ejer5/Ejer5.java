package ejer5;

import java.util.Scanner;

/*
 * Pedir diez números por teclado y mostrar la media.
 */

public class Ejer5 {
	public static void main(String[] args) {
		float media = 0;
		Scanner sc = new Scanner(System.in);
		
		// Pedir numeros y sumar su parte de la media
		for (int i = 0; i < 10; i++) {
			System.out.printf("Introduce la nota #%d: ", i+1);
			media += sc.nextFloat() / 10;
		}
		
		// Imprimirlo pretty
		if (media == (long) media)
			System.out.printf("La media de los números es %d.", (long) media);
		else
		System.out.printf("La media de los números es %s.", media);
		
		sc.close();
	}
}

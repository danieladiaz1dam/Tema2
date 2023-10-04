package ejer6;

import java.util.Scanner;

/*
 * Pedir los coeficientes de una ecuación de
 * segundo grado y mostrar sus soluciones reales.
 */

public class Ejer6 {
	public static void main(String[] args) {
		// Variable coeficiente a
		float a;
		// Variable coeficiente b
		float b;
		// Variable coeficiente c
		float c;
		// Variable coeficiento x
		double x;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pedir y guardar coeficientes del user
		System.out.print("Introduce el coeficiente a: ");
		a = sc.nextFloat();
		System.out.print("Introduce el coeficiente b: ");
		b = sc.nextFloat();
		System.out.print("Introduce el coeficiente c: ");
		c = sc.nextFloat();

		// Calcular x con Raiz negativa
		x = (b * -1 - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

		// Imprimir resultado si es real
		if (!Double.isNaN(x))
			System.out.println("Resultado con la raiz negativa: " + x);
		else
			System.out.println("El resultado de la raiz negativa no es real");

		// Calcular x con Raiz positiva
		x = (b * -1 + Math.sqrt(b * b - 4 * a * c)) / 2 * a;

		// Imprimir resultado si es real
		if (!Double.isNaN(x))
			System.out.println("Resultado con la raiz positiva: " + x);
		else
			System.out.println("El resultado de la raiz positiva no es real");

		// Cerrar Scanner
		sc.close();
	}
}

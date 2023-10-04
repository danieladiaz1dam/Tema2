package ejer10;

import java.util.Scanner;

/*
 * Escribir un programa que pida al usuario tres números enteros, 
 * y que muestre por pantalla si la suma de dos de esos números da
 * como resultado el otro número.
 */

public class Ejer10 {
	public static void main(String[] args) {
		// Variable para guardar el numero 1
		int a;
		// Variable para guardar el numero 2
		int b;
		// Variable para guardar el numero 3
		int c;
		
		// Variable Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedir tres numero al user
		System.out.println("Introduce tres numeros:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		// mirar si la suma de alguno es igual al otro e imprimirlo
		if (a+b == c)
			System.out.println(String.format("%d + %d = %d", a, b, c));
		if (a+c == b)
			System.out.println(String.format("%d + %d = %d", a, c, b));
		if (b+c == a)
			System.out.println(String.format("%d + %d = %d", b, c, a));
		
		// Cerrar el Scanner
		sc.close();
	}
}

package ejer7;

import java.util.Scanner;

/*
 * Escribir una aplicación que indique cuántas
 * cifras tiene un número introducido por teclado,
 * que está comprendido entre 0 y 99.999.
 */

public class Ejer7 {
	public static void main(String[] args) {
		// Variable para guardar el numero del usuario
		long num = 0;
		// Varaible para guardar el numero de cifras
		byte cifras = 0;
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		/*
		 * cifras = 1;
		if (num > 10)
			cifras = 2;
		else if (num > 100)
			cifras = 3;
	  	 ...
		*/
		
		// Pedir numero al usuario
		System.out.print("Introduce un numero: ");
		// Guardar el numero del usuario
		num = sc.nextInt();

		// Si el numero es 0, tiene 1 cifra
		// asi que imprimimos y terminamos el programa
		if (num == 0) {
			System.out.println("Numero de cifras: 1");
			sc.close();
			return;
		}
		
		// Si el numero es negativo, lo pasamos a positivo
		if (num < 0)
			num *= -1;
		
		// Mientras que nos queden cifras
		while (num > 0 ) {
			// Le vamos restando cifras y aumentando nuestra variable
			num /= 10;
			cifras++;
		}
		
		// Imprimimos el numero de cifras
		System.out.println("Numero de cifras: " + cifras);
		
		// Cerrar el Scanner
		sc.close();
	}
}

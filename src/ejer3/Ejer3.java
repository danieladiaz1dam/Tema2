package ejer3;

import java.util.Scanner;

/*
 * Implementar un programa que pida por teclado un
 * número decimal e indique si es un número casi-cero, 
 * que son aquellos, positivos o negativos, que se acercan
 *  a 0 por menos de 1 unidad, aunque curiosamente el 0 no
 *  se considera un número casi-cero. Es decir, un número
 *  casi-cero es el que se encuentra en el intervalo (-1, 1),
 *  donde se excluye el -1, el 0 y el 1.
 */

public class Ejer3 {
	public static void main(String[] args) {
		// Variable para guardar el input de usuario
		float num;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pedir numero al usuario
		System.out.print("Introduce un numero: ");
		// Guardar el numero del user
		num = sc.nextFloat();

		// Calcular si es un numero casi cero
		if (num > -1 && num < 0 || num > 0 && num < 1)
			System.out.println("El numero es casi cero");
		else
			System.out.println("El numero no es casi cero");

		// Cerrar Scanner
		sc.close();
	}
}

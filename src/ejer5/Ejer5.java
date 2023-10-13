package ejer5;

import java.util.Scanner;

/*
 * Escribe un algoritmo que pida al usuario 10 números enteros(pueden ser positivos, negativos o cero).
 * Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos,
 * la media de los números negativos y el número de ceros que ha introducido el usuario.
 */

public class Ejer5 {
	public static void main(String[] args) {
		// Variable suma positivos
		int sumaPositivos = 0;
		// Varible contador negativos
		int contadorNegativo = 0;
		// Variable suma negativos
		int sumaNegativos = 0;
		// Variable contador ceros
		int contadorCeros = 0;
		// Variable indice
		int index = 0;
		// Variable para guardar el input del usuario
		int input = 0;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		// mientras que index sea mas pequeño que 10
		while (index < 10) {
			// Pedir numero al usuario
			System.out.printf("Introduce un numero: ");
			// Guardar el input
			input = sc.nextInt();
			
			// Si es positivo
			if (input > 0)
				// Añadir valor a la suma de los positivos
				sumaPositivos += input;
			// Si es 0
			else if (input == 0)
				// Añadir +1 al contador de los 0s
				contadorCeros++;
			// Si es negativo
			else {
				// Añadir +1 al contador de negativos y añadir el valor a la suma de negativos
				contadorNegativo++;
				sumaNegativos += input;
			}
			
			// Añadir +1 al index para que no sea infinito
			index++;
		}
		
		// Imprimir todo
		System.out.printf("La suma de los numeros positivos es: %d\n", sumaPositivos);
		System.out.printf("La cantidad de ceros introducida es de %d\n", contadorCeros);
		if (contadorNegativo <= 0)
			System.out.printf("No hay suficientes numeros negativos para hacer la media.");
		else
			System.out.printf("La media de los numeros negativos es de %d\n", sumaNegativos/contadorNegativo);
		
		// Cerrar scanner
		sc.close();
	}
}

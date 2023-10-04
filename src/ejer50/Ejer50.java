package ejer50;

import java.util.Scanner;

/*
 * Pedir una lista de numero al usuario y ordenarlos
 * de menor a mayor
 */

public class Ejer50 {
	public static void main(String[] args) {
		// Varaible para guardar la cantidad de numero que el usuario quiere introducir
		byte nums;
		// Variale temporal
		int tmp;
		// Variable para guardar la posicion por la que vamos
		int index = 0;
		// Lista de numeros
		int[] lista;

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Preguntar cuantos numeros quiere
		System.out.print("Cuantos numeros quieres?: ");
		nums = sc.nextByte();

		// Cambiar el tamaño de las listas
		lista = new int[nums];

		// Rellenar la lista con valores del usuario
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Introduce el numero #" + (i + 1) + ": ");
			lista[i] = sc.nextInt();
		}

		// Mirar la parte que nos va quedando de la lista
		while (index < lista.length) {
			// Mirar la lista desde el 0 hasta el final menos index, que son los que ya
			// hemos mirado
			for (int i = 0; i < lista.length - 1 - index; i++) {
				// Si el primero numero es mayor que el de la derecha, intercambiarlo
				// de este modo, vamos poniendo el numero mas grande en el final
				if (lista[i] > lista[i + 1]) {
					tmp = lista[i];
					lista[i] = lista[i + 1];
					lista[i + 1] = tmp;
				}
			}

			// Aumentar index, la parte que ya tenemos ordenada
			index++;
		}

		// Imprimir lista ordenada
		System.out.print("\nLista ordenada: {");
		for (int i = 0; i < lista.length - 1; i++) {
			System.out.print(lista[i] + ", ");
		}
		System.out.print(lista[lista.length - 1] + "};");

		// Cerrar el scanner
		sc.close();
	}
}

package ejer3;

import java.util.Scanner;

/*
 * Realiza un programa que sume los números desde el 1 hasta un número N que 
 * se introducirá por teclado. Si el usuario introduce un 5, el programa
 * debe devolver la suma de 1+2+3+4+5. 
 */

public class Ejer3 {
	public static void main(String[] args) {
		// Variable para el input del usuario
		int input;
		// Variable suma
		int suma = 0;
		// Variable Scanner
		Scanner sc = new Scanner(System.in);

		// Preguntar el numero al usuario
		System.out.printf("Introduce un numero: ");
		// Guardar el numero
		input = sc.nextInt();

		// Sumamos el input a suma y le restamos 1 a input hasta q sea 1
		// ( Para no imprimir el + al final
		do {
			suma += input;
			System.out.printf("%d + ", input);
			input--;
		} while (input > 1);
		
		// Imprimimos el 1 que falta y el resultado
		System.out.printf("1 = %d\n", suma);

		// Cerrar el scanner
		sc.close();
	}
}

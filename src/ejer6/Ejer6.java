package ejer6;

import java.util.Scanner;

/*
 * Implementar una aplicación para calcular datos estadísticos de las edades
 * de los alumnos de un centro educativo. Se introducirán datos hasta que uno
 * de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
 * la media, el número de alumnos y cuántos son mayores de edad.
 */

public class Ejer6 {
	public static void main(String[] args) {
		// Variable para la suma de edades
		int sumaEdad = 0;
		// Variable para el numero de alumnos
		int cantAlumnos = 0;
		// Variable para mayores de edad
		int cantMayorEdad = 0;
		// Variable para el input del usuario
		int input = 0;
		// Variable scanner
		Scanner sc = new Scanner(System.in);

		// Preuntar edad al usuario
		System.out.printf("Alumno #%d, introduzca su edad: ", cantAlumnos + 1);
		// Guardar el input
		input = sc.nextInt();

		while (input > 0) {
			// Preuntar edad al usuario
			System.out.printf("Alumno #%d, introduzca su edad: ", cantAlumnos + 1);
			// Guardar el input
			input = sc.nextInt();

			sumaEdad += input;
			cantAlumnos++;
			if (input >= 18)
				cantMayorEdad++;
		}

		System.out.printf("\nLa suma de las edades da un total de %d años.\n", sumaEdad);
		System.out.printf("Hay un total de %d alumnos,\nde los cuales %d son mayores de edad.", cantAlumnos,
				cantMayorEdad);

		// Cerrar scanner
		sc.close();
	}
}

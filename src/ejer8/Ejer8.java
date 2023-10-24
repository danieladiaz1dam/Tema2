package ejer8;

import java.util.Scanner;

/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

public class Ejer8 {
	public static void main(String[] args) {
		boolean suspenso = false;
		float calificacion;
		Scanner sc = new Scanner(System.in);
		
		// Pedir notas y mirar si hay alguno suspenso
		for (int i = 0; i < 5; i++) {
			System.out.printf("Introduce la nota #%d: ", i+1);
			calificacion = sc.nextFloat();
			
			if (calificacion < 5)
				suspenso = true;
		}
		
		if (suspenso)
			System.out.printf("Hay alguno suspenso.");
		else
			System.out.printf("Nadie ha suspendido.");
		
		sc.close();
		
	}
}

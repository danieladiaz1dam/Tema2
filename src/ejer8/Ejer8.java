package ejer8;

import java.util.Scanner;

/*
 * Escribir una aplicación que pida al usuario un número real
 * y muestre por pantalla la nota del alumno, teniendo en cuenta:
 *	[0-5) es INSUFICIENTE (0 inclusive)
 *	[5-6) es SUFICIENTE (5 inclusive)
 *	[6-7) es BIEN (6 inclusive)
 *	[7-9) es NOTABLE (7 inclusive)
 *	[9-10] es SOBRESALIENTE (9 y 10 inclusives)
 *
 */

public class Ejer8 {
	public static void main(String[] args) {
		// Variable para guardar el numero del usuario
		byte num;
		// Variable para mostrar el resultado
		String res;
		// Variable del Scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedir un numero al usuario
		System.out.print("Introduce un numero entre 0 y 10: ");
		// Guardar el numero
		num = sc.nextByte();
		
		// Calcular la respuesta
		if (num > 0 && num < 5)
			res = "INSUFICIENTE";
		else if (num >= 5 && num < 6)
			res = "SUFICIENTE";
		else if (num >= 6 && num < 7)
			res = "BIEN";
		else if (num >= 7 && num < 9)
			res = "NOTABLE";
		else if (num >= 9 && num <= 10)
			res = "SOBRESALIENTE";
		else
			res = "un numero no valido";
		
		// Responder al usuario
		System.out.print(num + " es " + res);
		
		// Cerrar el scanner
		sc.close();
	}
}

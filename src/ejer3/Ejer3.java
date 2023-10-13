package ejer3;

import java.util.Scanner;

/*
 * Escribe un algoritmo que le pida al usuario dos números.
 * A continuación debe mostrar el siguiente menú por pantalla:
 * SUMAR LOS NÚMEROS
 * RESTAR LOS NÚMEROS
 * MULTIPLICAR LOS NÚMEROS
 * DIVIDIR LOS NÚMEROS
 * 
 * Después, el algoritmo debe pedirle al usuario que seleccione
 * una opción y que haga la operación que marca esa opción,
 * mostrando por último el resultado de la operación elegida por
 * el usuario. Si el usuario elige una opción incorrecta,
 * el algoritmo se lo hace saber al usuario	y no haría nada.
 */

public class Ejer3 {
	public static void main(String[] args) {
		// Varibale para guardar el primer numero
		float num1;
		// Variable para guardar el segundo numero
		float num2;
		// Variable para guardar el resultado
		float res = 0;
		// Variable para guardar la opcion
		byte opcion;
		// Varialbe para saber si la opcion es valida
		boolean opcionValida = true;
		// Variable scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedir los dos numeros al usuario
		System.out.print("Introduce un numero: ");
		num1 = sc.nextFloat();
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextFloat();
		
		// Imprimir el menu al usuario
		System.out.println("\n" + "#".repeat(33));
		System.out.println(String.format("# %29s #", "Que quieres hacer con ellos?:"));
		System.out.println(String.format("# %29s #", ""));
		System.out.println(String.format("# %-29s #", "1) Sumarlos"));
		System.out.println(String.format("# %-29s #", "2) Restarlos "));
		System.out.println(String.format("# %-29s #", "3) Multiplicarlos"));
		System.out.println(String.format("# %-29s #", "4) Dividirlos"));
		System.out.println(String.format("# %29s #", ""));
		System.out.println("#".repeat(33));
		
		// Guardar la opcion
		opcion = sc.nextByte();
		
		// Calcular el resultado segun la opcion
		switch(opcion) {
		case 1:
			res = num1+num2;
			break;
		case 2:
			res = num1-num2;
			break;
		case 3:
			res = num1*num2;
			break;
		case 4:
			res = num1/num2;
			break;
		default:
			System.out.println("Opcion invalida");
			opcionValida = false;
		};
		
		// Imprimir el resultado si la opcion era valida
		if (opcionValida)
			System.out.println(String.format("El resultado es %.2f.", res));
		
		// Cerrar scanner
		sc.close();
	}
}

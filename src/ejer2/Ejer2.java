package ejer2;

import java.util.Scanner;

/*
 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
 * la semana al que corresponde.
 * Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.
 */

public class Ejer2 {
	public static void main(String[] args) {
		// Variable para guardar el numero del dia de la semana
		byte index;
		// Variable para guardar el dia de la semana en caracteres
		String nombreDia;
		// Varaible scanner
		Scanner sc = new Scanner(System.in);
		
		// Preguntar el numero al usuario
		System.out.print("introduce un numero del 1 al 7: ");
		// Guardar el numero
		index = sc.nextByte();
		
		// Calcular el dia de la semana con el index del usuario
		nombreDia = switch(index) {
		case 1: yield "Lunes";
		case 2: yield "Martes";
		case 3: yield "Miercoles";
		case 4: yield "Juevs";
		case 5: yield "Viernes";
		case 6: yield "Sábado";
		case 7: yield "Domingo";
		default: yield "Invalido";
		};
		
		// Imprimir
		System.out.println(String.format("El numero %d pertenece al dia \"%s\".", index, nombreDia));
		
		// Cerrar el scanner
		sc.close();
	}
}

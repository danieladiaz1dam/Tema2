package ejer5;

import java.util.Scanner;

/*
 * Queremos saber, una vez introducida la letra del tipo de carnet de conducir,
 * se debe imprimir a qué tipo de vehículos corresponde:
 *    E: remolques.
 *    D: autobuses.
 *    C1-C5: camiones.
 *    A: motocicletas.
 *    B1-B2: automóviles.
 *    En caso de introducir uno distinto: “Categoría no contemplada”.
 *
 */

public class Ejer5 {
	public static void main(String[] args) {
		// Varaible para guardar la letra del carnet
		String letra;
		// Variable para guardar el vehiculo
		String vehiculo;
		// Variable scanner
		Scanner sc = new Scanner(System.in);
		
		// Pedir letra al usuario
		System.out.print("Introduce la letra de tu tipo de carnet de conducir: ");
		// Guardar la letra
		letra = sc.next();
		
		// Guardar el vehiculo a partir de la letra del carnet de conducir
		vehiculo = switch(letra) {
		case "E" -> { yield "remolques"; }
		case "D" -> { yield "autobuses"; }
		case "C1", "C2", "C3", "C4", "C5" -> { yield "camiones"; }
		case "A" -> { yield "motocicletas"; }
		case "B1", "B2" -> { yield "automoviles"; }
		default -> { yield "Invalido"; }
		};
		
		if (vehiculo.equals("Invalido"))
				System.out.println("La letra introducida no es valida");
		else
			System.out.printf("La letra %s corresponde a %s", letra, vehiculo);
		
		// Cerrar scanner
		sc.close();
	}
}

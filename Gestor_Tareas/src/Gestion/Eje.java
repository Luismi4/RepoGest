package Gestion;

import java.util.Scanner;

public class Eje {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("\n*** Menú de Tareas ***");
			System.out.println("1. Crear Tarea");
			System.out.println("2. Listar Tareas");
			System.out.println("3. Modificar Tarea");
			System.out.println("4. Eliminar Tarea");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");

			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida. Intente nuevamente.");
			}
		} while (opcion != 5);
		scanner.close();
	}
}



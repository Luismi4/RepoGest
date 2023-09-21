package Gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Eliminar {
	static Scanner leer = new Scanner(System.in);
	public static void EliminarTarea (ArrayList<Tarea> ta) {
		String titulo;
        System.out.println("Introduce el título de la tarea que quieres eliminar:");
        Listar.List(ta); // Suponiendo que Listar.List() muestra la lista de tareas

        titulo = leer.next();

        boolean tareaEncontrada = false;

        for (int i = 0; i < ta.size(); i++) {
            if (ta.get(i).getTit().equals(titulo)) {
                tareaEncontrada = true;
                ta.remove(i);
                System.out.println("Tarea eliminada exitosamente.");
                break; // Salimos del bucle una vez que encontramos la tarea
            }
        }

        if (!tareaEncontrada) {
            System.out.println("Título de tarea no encontrado en la lista.");
        }
    }
}



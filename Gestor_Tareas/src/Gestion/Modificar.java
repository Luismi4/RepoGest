package Gestion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Modificar {
	static Scanner leer = new Scanner(System.in);

    public static void modificar(ArrayList<Tarea> ta) {
    	int dia, mes, anio;
        String titulo;
        System.out.println("Introduce el título de la tarea que quieres modificar:");
        Listar.List(ta); // Suponiendo que Listar.List() muestra la lista de tareas

        titulo = leer.next();

        boolean tareaEncontrada = false;

        for (Tarea tarea : ta) {
            if (tarea.getTit().equals(titulo)) {
                tareaEncontrada = true;
                System.out.println("Tarea encontrada que desea modificar:");
                System.out.println("1. Modificar título");
                System.out.println("2. Modificar descripción");
                System.out.println("3. Modificar fecha");
                System.out.println("4. Cancelar");

                int opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nuevo título:");
                        String nuevoTitulo = leer.next();
                        tarea.setTit(nuevoTitulo);
                        System.out.println("Título modificado exitosamente.");
                        break;
                    case 2:
                        System.out.println("Introduce la nueva descripción:");
                        String nuevaDescripcion = leer.next();
                        tarea.setDesc(nuevaDescripcion);
                        System.out.println("Descripción modificada exitosamente.");
                        break;
                    case 3:
                    	System.out.println("Introduzca la fecha");
            			System.out.println("Dia: ");
            			dia = leer.nextInt();
            			System.out.println("Mes: ");
            			mes = leer.nextInt();
            			System.out.println("Anio: ");
            			anio = leer.nextInt();
            			LocalDate fec = LocalDate.of(anio, mes, dia);
                        tarea.setFec(fec);
                        System.out.println("Fecha modificada exitosamente.");
                        break;
                    case 4:
                        System.out.println("Operación cancelada.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                break; // Salimos del bucle una vez que encontramos la tarea
            }
        }

        if (!tareaEncontrada) {
            System.out.println("Título de tarea no encontrado en la lista.");
        }
    }
}
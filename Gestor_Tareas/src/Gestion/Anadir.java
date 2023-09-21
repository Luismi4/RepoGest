package Gestion;

import java.util.*;
import java.time.*;

public class Anadir {
	
	static String tit, desc;
	static int dia, mes, anio;
	static Scanner sc = new Scanner(System.in);
	
	public static void AniaUs(ArrayList<Tarea> ta) {
		
		try {
			System.out.println("Introduzca el titulo");
			tit = sc.nextLine();
			System.out.println("Introduzca la descripcion");
			desc = sc.nextLine();
			System.out.println("Introduzca la fecha");
			System.out.println("Dia: ");
			dia = sc.nextInt();
			System.out.println("Mes: ");
			mes = sc.nextInt();
			System.out.println("Anio: ");
			anio = sc.nextInt();
			LocalDate fec = LocalDate.of(anio, mes, dia);
			Tarea ta1 = new Tarea(tit, desc, fec); 
			ta.add(ta1);
            System.out.println("Asistente dado de alta con éxito.");
        } catch (Exception e) {
            System.out.println("Error al dar de alta al asistente: " + e.getMessage());
        }
		
	}
	
}

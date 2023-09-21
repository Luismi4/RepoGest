package Gestion;

import java.util.*;

public class Listar {

	public static void List(ArrayList<Tarea> ta) {	
		for (Tarea ele : ta) {
            System.out.println(ele.toString());
		}
	}
	
}

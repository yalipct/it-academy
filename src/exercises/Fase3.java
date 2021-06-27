package exercises;

import java.util.*;

public class Fase3 {

	public static void main(String[] args) {
		
		boolean esBisiesto;	
		String cierto;
		String falso;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce tu a�o de nacimiento:");
		int anio=sc.nextInt();		
		
		sc.close();
		
		if((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
			
			esBisiesto=true;
			cierto="El a�o " + anio + " es bisiesto.";
			System.out.print(cierto);
		}else {
			esBisiesto=false;
			falso="El a�o " + anio + " no es bisiesto.";
			System.out.print(falso);
		}		
		
		
	}

}

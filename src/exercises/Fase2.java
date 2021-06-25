package exercises;

public class Fase2 {

	public static void main(String[] args) {
		
		final int bisiesto=1948;
		final int mi_anio=1989;
		
		//var que guarda cada cuanto hay un a�o bisiesto
		int period=4;	
		//almacenar� total a�os bisiestos
		int total_bisiestos=0;		
		
		System.out.println("A�os bisiestos desde " + bisiesto + " hasta " + mi_anio + ":");
		
		//cu�ntos a�os bisiestos hay entre 1948 y mi a�o de nac
		for(int i=bisiesto; i<mi_anio; i++) {
								
			if((i % period == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
				total_bisiestos++;				
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("N�mero de a�os bisiestos desde "  + bisiesto + " hasta " + mi_anio + ": " + total_bisiestos);

	}

}

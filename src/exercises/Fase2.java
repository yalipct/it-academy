package exercises;

public class Fase2 {

	public static void main(String[] args) {
		
		final int bisiesto=1948;
		final int mi_anio=1989;
		
		//var que guarda cada cuanto hay un año bisiesto
		int period=4;	
		//almacenarà total años bisiestos
		int total_bisiestos=0;		
		
		System.out.println("Años bisiestos desde " + bisiesto + " hasta " + mi_anio + ":");
		
		//cuántos años bisiestos hay entre 1948 y mi año de nac
		for(int i=bisiesto; i<mi_anio; i++) {
								
			if((i % period == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0)) {
				total_bisiestos++;				
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Número de años bisiestos desde "  + bisiesto + " hasta " + mi_anio + ": " + total_bisiestos);

	}

}

package exercises;

public class Fase4 {

	public static void main(String[] args) {
		
		String nom="Lionel";
		String cognom1="Messi";
		String cognom2="Cuccittini";
		
		int dia=24;
		int mes=6;
		int any=1988;
		
		
		String nom_complet= nom + " " + cognom1 + " " + cognom2;
		
		String fecha_nac=dia+"/"+mes+"/"+any;
		
		//mensajes
		System.out.println(nom_complet);
		System.out.println(fecha_nac);
		
		if((any % 4 == 0 && any % 100 != 0) || (any % 100 == 0 && any % 400 == 0)) {
			
			System.out.println("El año " + any + " es bisiesto.");
		}else {
			System.out.println("El año " + any + " no es bisiesto.");
		}
		
	}

}

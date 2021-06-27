package exercisesModul2;

import java.util.Scanner;

public class piramideInvertida {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int altura, filas;
		
		System.out.println("Introduce la altura de la pirámide:");		
		altura=sc.nextInt();
		filas=altura;
		
		sc.close();
		
		filas=1;
		
		for(int i=altura; i>0; i--) {				
						
			//espacios en blanco			
			for(int j=0;j<filas;j++) {
				System.out.print(" ");				
			}
			//asteriscos
			for(int a=0; a<i*2-1; a++) {
				System.out.print("*");
			}
			filas++;
			System.out.println();
		}
	}
	
}

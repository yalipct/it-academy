package exercisesModul2;

import java.util.*;

public class escalaNumeros {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		int altura;
		
		System.out.println("Introduce la altura de la escala:");
		altura=sc.nextInt();
		
		sc.close();
		
		for(int i=0; i<=altura; i++) {
			
			System.out.println();
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(j);;
			}
		}

	}

}

package exercisesModul2;

import java.util.*;

public class Fase2 {
	
	public static void main(String[] args) {
		
		char mi_nombre [] = {'a', 'l','i','u','v','y','s'};
				
		List<Character> chars= new ArrayList<Character>();
		
		//añadir los caracteres del array a la lista
		for(char c: mi_nombre) {
			chars.add(c);			
		}	
		
		
		for(char el: chars) {
			
			//si encuentra un número muestra el mensaje y detiene la ejecución
			if(el>='0' && el<='9') {
				
				System.out.println("¡Los nombres de personas no contienen números!");
				//JOptionPane.showMessageDialog(null, "¡Los nombres de personas no contienen números!");
				break;
			}
			
			
			if(el=='a' || el=='e' || el=='i' || el=='o' || el=='u') {
				
				System.out.println(el + " VOCAL");		
			
			}else {
				System.out.println(el + " CONSONANTE");
			}	
		
		}
	}

}

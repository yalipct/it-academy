package exercisesModul2;

import java.util.*;

public class Fase2 {
	
	public static void main(String[] args) {
		
		char mi_nombre [] = {'a', 'l','i','u','v','y','s'};
				
		List<Character> chars= new ArrayList<Character>();
		
		//a�adir los caracteres del array a la lista
		for(char c: mi_nombre) {
			chars.add(c);			
		}	
		
		
		for(char el: chars) {
			
			//si encuentra un n�mero muestra el mensaje y detiene la ejecuci�n
			if(el>='0' && el<='9') {
				
				System.out.println("�Los nombres de personas no contienen n�meros!");
				//JOptionPane.showMessageDialog(null, "�Los nombres de personas no contienen n�meros!");
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

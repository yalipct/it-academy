package exercisesModul2;

import java.util.*;

public class Fase3 {

	public static void main(String[] args) {
				
		char mi_nombre [] = {'a', 'l','i','u','v','y','s'};
		
		HashMap<Character, Integer> contar=new HashMap<>();
		
		//
		for(char c: mi_nombre) {
			//
			if(contar.containsKey(c)) {
				contar.put(c, contar.get(c)+1);
			}else {
				contar.put(c, 1);
			}
		}		
		
		//mostrar el mapa
		for (Map.Entry<Character, Integer> entry : contar.entrySet()) {
           System.out.println("Clave= " + entry.getKey() + ", Valor=" + entry.getValue());
        }
		
		
	}

}

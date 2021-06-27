package exercisesModul2;

import java.util.*;

public class Fase4 {

	public static void main(String[] args) {
		
		char mi_nombre [] = {'A', 'l','i','u','v','y','s'};
		
		List<Character> name= new ArrayList<Character>();
		
		//añadir los caracteres del array a la lista
		for(char c: mi_nombre) {
			name.add(c);			
		}		
		
		//lista apellido
		List<Character>surname= new ArrayList<Character>();
		surname.add('O');
		surname.add('j');
		surname.add('e');
		surname.add('d');
		surname.add('a');
		
		//lista que contiene el nombre completo
		List<Character>fullName= new ArrayList<Character>(name);
		fullName.addAll(surname);
		
		//posición donde insertar el espacio entre listas
		int posicion = name.size();
		
		fullName.add(posicion, ' ');
		
		for(int i=0; i<fullName.size();i++) {
			
			System.out.print(fullName.get(i));
		}
	}

}

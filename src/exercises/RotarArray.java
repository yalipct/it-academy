package exercises;

public class RotarArray {

	public static void main(String[] args) {
		
		int num []= {1,2,3,4,5,6,7,8,9,10};
		
		//mostrar array normal
		for(int i=0; i<num.length; i++) {
			
			System.out.print(num[i]+" ");
			
		}
		System.out.println();
		
		//mostrar array rotado
		for(int i=num.length-1; i>=0; i--) {
			
			System.out.print(num[i]+" ");
		}

	}

}

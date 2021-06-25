package exercises;

public class CasteoVariables {

	public static void main(String[] args) {
		
		double num=3.1416;
				
		//casteo
		int num1=(int)num;
		
		float num2=(float)num;
		
		String cad=Double.toString(num);
		
		System.out.println("Valor double " + num);
		
		System.out.println("Valor int " + num1);
		
		System.out.println("Valor float " + num2);
		
		System.out.println("Valor String " + cad);
		

	}

}

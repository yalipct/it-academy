package exercisesModul2;

public class relojDigital {

	public static void main(String[] args) throws InterruptedException{
		
		int hour=0, minutes=59, seconds=56;
		
		while(true) {
			
			//mostrar el reloj
			if(hour<10){
				System.out.print("0");
			}
			System.out.print(hour+":");
			
			if(minutes<10){
				System.out.print("0");
			}
			System.out.print(minutes+":");
			
			if(seconds<10){
				System.out.print("0");
			}
			System.out.println(seconds);			
			
			
			//aumentar tiempo
			seconds++;
			
			//comprobaciones
			if(seconds==60) {
				seconds=0;
				minutes++;
				
				if(minutes==60) {
					minutes=0;
					hour++;
				}
				
				if(hour==24) {
					hour=0;
				}
			}			
			
			//segundo de espera
			Thread.sleep(1000);
		}

	}

}

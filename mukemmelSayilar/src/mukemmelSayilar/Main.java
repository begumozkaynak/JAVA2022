package mukemmelSayilar;

public class Main {

	public static void main(String[] args) {
		//Kendinden başka bölünen sayılara toplamı kendisine eşit ise, 6 ve 28 
		
		int number =28 ;
		int total =0;
		
		for(int i =1; i<number; i++ ) {
			if (number % i ==0) {
				total = total +i;
				
				}
			}
		if(total== number) {
			System.out.println("Mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
			
		
		
		
				
	}

}

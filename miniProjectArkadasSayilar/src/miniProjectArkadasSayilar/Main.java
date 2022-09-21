package miniProjectArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// Arkadaş sayilar  220 284 kendileri bölenlerin sayı toplamı birbiri ise 
		
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i=1; i<sayi1; i++) {
			if(sayi1 %i ==0) {
				toplam1 = toplam1 + i;
			}
		
		for (int i2= 1; i<sayi2; i2++) {
			if(sayi2 %i2 ==0) {
				toplam2 = toplam2 + i2;
			}
			
		if (sayi1==toplam2 && sayi2 ==toplam1) {
			System.out.println("bu iki sayı arkadaştır");
		}
		else {
			System.out.println("bu iki sayı arkadaş değildir");
		}
		}
		
		}
	}
}


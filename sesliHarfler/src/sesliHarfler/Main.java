package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf ='B';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf");
		default:
			System.out.println("Kalın-İnce sesli harf de değildir.");
		}
	}

}

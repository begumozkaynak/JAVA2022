package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomenGameCalculator womanGameCalculator = new WomenGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomenGameCalculator();
		

	}

}

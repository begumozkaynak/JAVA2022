package abstractClasses;

public abstract class GameCalculator {
	
	//hesapla var her oyuncu için olması zorunlı metot,bunu kullanıcı türüne göre herkes kendi yazaak.
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}
}

package polimorfizm;

public class CustomerManager {
	private BaseLogger logger;
	
	//constractorr , newlerken, temel nesne ile çalışıyoruz
	public CustomerManager (BaseLogger logger) {
		this.logger= logger;
	}
	
	
	public void add() {
		System.out.println("Müşteri Eklendi");
		this.logger.log("log mesajı");  // mainde gönderilen database logger  base logger diyorz ama base logger referasnsı database logger kullanılıyor.
		/*
		 * DatabaseLogger logger = new DatabaseLogger(); logger.log("Log mesaj");
		 */
	}

}

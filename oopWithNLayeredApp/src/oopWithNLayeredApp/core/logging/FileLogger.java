package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {
	//interface den abstractan geldiğini söyler 
	
	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandı:" +data );
		
	}

}

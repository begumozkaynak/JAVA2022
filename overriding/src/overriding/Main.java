package overriding;

public class Main {

	public static void main(String[] args) {
		/*
		 * OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager ();
		 * System.out.println(ogretmenKrediManager.hesapla(1000));
		 */
		
		
		//bir operasyonumuz var onu ezmek istedik, overriding yaparak ezdik
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] 
				{ new OgretmenKrediManager(), new TarimKrediManager()};
		for ( BaseKrediManager krediManager:krediManagers ) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}

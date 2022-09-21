package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		 String mesaj ="Bugün hava çok güzel.";
		 
		 System.out.println(mesaj);
		 /*
		 * //eleman sayısı System.out.println("Eleman sayısı:" +mesaj.length());
		 * 
		 * //karakterin 5.elemanını bulmak için mesela System.out.println("5.eleman:"
		 * +mesaj.charAt(4));
		 * 
		 * //String ifadeleri birleştirir.
		 * System.out.println(mesaj.concat("Yaşasın!!"));
		 * 
		 * //string ifade baş ve son kontrolu için kullanılır boolen ifadedir.
		 * System.out.println(mesaj.startsWith("Z"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5];
		 * 
		 * //mesaj.getChars(srcBegin: 0, srcEnd: 5 , karakterler, dstBegin: 0);
		 * System.out.println("karakterler");
		 * 
		 * System.out.println(mesaj.indexOf('a'));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */
		
		System.out.println(mesaj.replace(' ', '-'));
		
		
		// Daha sonra bu mesajı kullanmak için 
		String yeniMesaj =mesaj.replace(' ', '-');
		System.out.println(mesaj);
		
		System.out.println(mesaj.substring(2));
		//istediğimiz indexe kadar kesmke için
		System.out.println(mesaj.substring(2, 5));
		
		//karakter parçalamaya yarar.boşluğa göre ayırdı mesela.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		//
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		//boşlukları siler
		System.out.println(mesaj.trim());

	}

}

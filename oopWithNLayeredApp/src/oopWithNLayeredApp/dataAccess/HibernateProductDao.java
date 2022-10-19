package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao {
	
	public void add(Product product) {
		//sadece ve sadece db erişim ikodları buraya yazılır.. SQL
		System.out.println("Hibernate ile veritabanına eklendi");
	}
}

package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
/*import oopWithNLayeredApp.dataAccess.JdbcProductDao;*/
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;


public class ProductManager {
	private ProductDao productDao;
	
	//Yönetim diyorki ekleme yapılınca mail database ve dosyaya loglama yap.bunun için,
	private Logger[] loggers;
	
	//productmanager newlendiğinde bana bir productdao ver 
	public ProductManager(ProductDao productDao, Logger[]loggers) {
		
		this.productDao = productDao;
		this.loggers =loggers;
	}
	
	
	public void add(Product product) throws Exception {
		// iş kuralları
		
		if (product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		/*
		 * // isimler değişebilir ama doğru bir yöntem değil. kötü kod siliniyor
		 * JdbcProductDao productDao
		 * = new JdbcProductDao();
		 */
		productDao.add(product);
		
		for (Logger logger: loggers) { // [database ve file] 
			logger.log(product.getName());
		}
		
	}
}

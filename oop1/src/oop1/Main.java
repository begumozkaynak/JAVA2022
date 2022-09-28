package oop1;

public class Main {

	public static void main(String[] args) {

		String message = "Vade Oranı";

		Product product1 = new Product();
		// set value : değer atama yapıyoruz.
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne1.jpg");

		// get değerleri okuyor.

		/*
		 * System.out.println(product1.name); System.out.println(product1.unitPrice);
		 * System.out.println(product1.discount);
		 * System.out.println(product1.unitsInStock);
		 * System.out.println(product1.imageUrl);
		 */

		Product product2 = new Product();

		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();

		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bilmemne3.jpg");

		// tüm ürünler ekranı oluşturmak için önümüzde

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");

		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("02543369696");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		

	}

}

package interfaces;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new OracleCustomerDal (); //referans tutuyor.
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		/*
		 * CustomerManager customerManager = new CustomerManager(new
		 * MySqlCustomerDal());
		 */
		
		 //  bu şekilde kullanırsak; ICustomerDal customerDal ;
		/* CustomerManager customerManager = new CustomerManager(); */
		/* customerManager.customerDal = new OracleCustomerDal(); */
		/* customerManager.customerDal = new MySqlCustomerDal(); */
		customerManager.add();
	}

}

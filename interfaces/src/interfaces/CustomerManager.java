package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal ;
	
	
	//constractordan bir tane customer dal istiyoruz
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal =customerDal;
	}
	
	public void add() {
		//iş kodları yazılır ,mesela müşteri eklerken adı girmiş mi diye?
		
		customerDal.Add();
	}

}

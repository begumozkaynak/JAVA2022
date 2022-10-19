package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager =  new CustomerManager();
		//customerManager.databaseManager= new OracleDatabaseManager(); configurasssion 
		customerManager.databaseManager= new SqlServerDatabaseManager();
		customerManager.getCustomer();

	}

}

package interfaces;

public class MySqlCustomerDal implements ICustomerDal , IReposity {
	public void Add() {
		System.out.println("My Sql eklendi");
	}
	
}

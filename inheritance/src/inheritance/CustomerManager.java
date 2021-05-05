package inheritance;

public class CustomerManager {

	public void Add(Customer customer)
	{
		System.out.println(customer.customerNumber + " kaydedildi");
	}
	
	//bulk insert
	public void AddMultiply(Customer[] customers)
	{
		for(Customer customer:customers)
		{
			Add(customer);
		}
		
	}
}

package abstractDemo;

public class Main {

	public static void Main(String[] args)
	{
		//4.HAFTA ABSTRACT CLASS ÖDEVÝ
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.bdmanager=new OracleDatabaseManager();
		customerManager.getCustomers();
		
	}
	
	
	
}

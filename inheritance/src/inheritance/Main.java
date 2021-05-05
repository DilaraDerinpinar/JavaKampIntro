package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber="222";
		
		
		CorporateCustomer hepsiburada=new CorporateCustomer();
		hepsiburada.customerNumber="111";
		
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="999";
		
		CustomerManager customerManager=new CustomerManager();
		/*
		customerManager.Add(engin);
		customerManager.Add(hepsiburada);
		customerManager.Add(abc);
		*/
		
		Customer[] customers= {engin,abc,hepsiburada};
		
		customerManager.AddMultiply(customers);
	}

}

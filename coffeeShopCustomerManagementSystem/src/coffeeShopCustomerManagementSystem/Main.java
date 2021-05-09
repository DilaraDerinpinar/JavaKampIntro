package coffeeShopCustomerManagementSystem;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer(1,"dilara","derinpýnar",new Date(2000,12,12),"1883434");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		
		customerManager.save(customer);
		
		
	}

}

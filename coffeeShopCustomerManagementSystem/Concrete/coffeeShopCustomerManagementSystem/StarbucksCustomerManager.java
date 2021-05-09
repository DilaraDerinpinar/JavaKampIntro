package coffeeShopCustomerManagementSystem;

public class StarbucksCustomerManager extends BaseCustomerManager{

	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService)
	{
		_customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer)  {
		
			if(_customerCheckService.CheckIfRealPerson(customer))
			{
				this.save(customer);
			}
			else
			{
				System.out.println("not a valid person");
			}
	}

	

	
	

	
	
}

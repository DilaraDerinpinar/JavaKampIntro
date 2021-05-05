package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//3.HAFTA DERSÝ
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add(new DatabaseLogger());
		customerManager.Add(new FileLogger());
		
		
	}

}

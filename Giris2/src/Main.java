
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//V�DEO 24,25
		String message="hello";
		Yazdir(message);
		
		//V�DEO 26
		int s1=2;
		int s2=45;
		
		Yazdir2(s1,s2);
		
		//V�DEO 27,28
		CustomerManager customerManager=new CustomerManager();
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		
		//V�DEO 29
		int n1=6;
		int n2=9;
		n1=n2;
		n2=99;
		System.out.println(n1);
		
		int[] numbers=new int[2];
		numbers[0]=33;
		numbers[1]=44;
		
		numbers[0]=0;
		System.out.println(numbers[0]);
		
		//V�DEO RECAP DEMO
		DortIslem.topla();
		
		//V�DEO 31
		String name="dilara";
		int age=21;
		String college;
		
		//V�DEO 32,33,34
		Customer customer1=new Customer();
		customer1.setDepartment("computer science");
		
		Customer customer2=new Customer(1,"computer science");
		
		
		
		
		
	}
	
	public static void Yazdir(String msg)
	{
		System.out.println(msg);
	}
	
	public static void Yazdir2(int... sayilar)
	{
		System.out.println(sayilar);
	}
	
	

}

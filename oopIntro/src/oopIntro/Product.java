package oopIntro;

public class Product {
	
	public Product()
	{
		System.out.println("ben çalýþtým");
	}
	
	public Product(int id,String name, double unitPrice, String detail)
	{
		this(); //üstteki constructorda olanlarý alýr ve burda da çalýþtýrýr.
		this.id=id;
		this.detail=detail;
		this.name=name;
		this.unitPrice=unitPrice;
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
	

}

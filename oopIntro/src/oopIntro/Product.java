package oopIntro;

public class Product {
	
	public Product()
	{
		System.out.println("ben �al��t�m");
	}
	
	public Product(int id,String name, double unitPrice, String detail)
	{
		this(); //�stteki constructorda olanlar� al�r ve burda da �al��t�r�r.
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

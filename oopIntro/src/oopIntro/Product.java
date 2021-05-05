package oopIntro;

public class Product {
	
	//final kelimesi bu deðerin sadece constructorda set edilebileceðini ifade eder.
	
	private int id; 
	private String name;
	private double unitPrice;
	private String detail;
	private int discount;
	
	
	public Product()
	{
		
	}

	

	public Product(int id, String name, double unitPrice, String detail,int discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (unitPrice * this.discount/100);
	}
	
	/*
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
	
	*/
	
	
	
	
	

}

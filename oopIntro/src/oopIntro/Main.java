package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2.HAFTA VE 3.HAFTA DERSLERÝ
		
		Product product1=new Product(1,"lenovo v14",15000,"16 gb ram",10); //örnek oluþturma,referans oluþturma, instance oluþturma denir.
		
		
		/*product1.id=1;
		product1.name="lenovo v14";
		product1.unitPrice=15.000;
		product1.detail="16 gb ram";*/
		
		
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("lenovo v15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getDetail());
	
		Category category1=new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/*
		Product product3=new Product(); //örnek oluþturma,referans oluþturma, instance oluþturma denir.
		
		
		Product[] products= {product1,product2,product3};
		
		for(Product product:products)
		{
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		
		
		Category category1=new Category();
		category1.id=1;
		category1.name="computers";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="gardens";
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		*/
		
		
	}

}

package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1=new Product(1,"lenovo v14",15.000,"16 gb ram"); //örnek oluþturma,referans oluþturma, instance oluþturma denir.
		/*product1.id=1;
		product1.name="lenovo v14";
		product1.unitPrice=15.000;
		product1.detail="16 gb ram";*/
		
		
		
		Product product2=new Product(); 
		product2.id=2;
		product2.name="lenovo v15";
		product2.unitPrice=16.000;
		product2.detail="32 gb ram";
		
		
		
		Product product3=new Product(); //örnek oluþturma,referans oluþturma, instance oluþturma denir.
		product3.id=3;
		product3.name="hp 5";
		product3.unitPrice=15.000;
		product3.detail="32 gb ram";
		
		
		
		
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
		
		
		
	}

}

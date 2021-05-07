package overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OgretmenKrediManager ogretmen=new OgretmenKrediManager();
		double result= ogretmen.hesapla(100.00);
		
		BaseKrediManager[] krediManager= {new TarimKrediManager(),new OgretmenKrediManager()};
		
		for(BaseKrediManager krediler:krediManager)
		{
			System.out.println(krediler.hesapla(56.00));
		}
		
		
		
		
	}

}

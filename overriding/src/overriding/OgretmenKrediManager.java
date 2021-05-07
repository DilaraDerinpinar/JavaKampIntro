package overriding;

public class OgretmenKrediManager extends BaseKrediManager{

	
	public double hesapla(double tutar) //overriding işlemi yapmış olduk
	{
		return tutar*0.20;
	}
	
	
}

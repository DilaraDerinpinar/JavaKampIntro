package overriding;

public class OgretmenKrediManager extends BaseKrediManager{

	
	public double hesapla(double tutar) //overriding i�lemi yapm�� olduk
	{
		return tutar*0.20;
	}
	
	
}

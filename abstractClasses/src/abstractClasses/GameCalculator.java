package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla(int tip);  //hesaplayý içermek zorunda fakat override edicek. yani her classýn farklý farklý olaabilir içeriði
	//bu multaka implemente edilir
	
	public final void gameOver() //final olduðu için override edilemiyor oldugu gibi kullanýlacaktýr bu þekil
	{
		System.out.println("oyun bitti");
	}
	
	//abstract classta illa abstract bir method olmak zorunda deðli. Bu þekilde karýþýk 2 operasyondan biri veya tamamý olabilir.
	//abstract classlar new lenemez.
}

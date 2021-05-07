package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla(int tip);  //hesaplay� i�ermek zorunda fakat override edicek. yani her class�n farkl� farkl� olaabilir i�eri�i
	//bu multaka implemente edilir
	
	public final void gameOver() //final oldu�u i�in override edilemiyor oldugu gibi kullan�lacakt�r bu �ekil
	{
		System.out.println("oyun bitti");
	}
	
	//abstract classta illa abstract bir method olmak zorunda de�li. Bu �ekilde kar���k 2 operasyondan biri veya tamam� olabilir.
	//abstract classlar new lenemez.
}

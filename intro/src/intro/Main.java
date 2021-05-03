package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//camelCase
		//DRY = DONT REPEAT YOURSELF
		
		String internetSubeButonu= "internet þubeye gir";
		double dolarDun=8.35;
		double dolarBugun=8.18;
		int vade=36;
		boolean dustuMu=false;
		
		
		if(dolarDun>dolarBugun)
		{
			System.out.println("dolar düþtü resmi");
		}else {
			System.out.println("dolar yükseldi resmi");
		}
		
		String kredi1="hýzlý kredi";
		String kredi2 = "konut kredisi";
		String kredi3="taþýt kredisi";
		String kredi4="emeklilik kredisi";
		
		System.out.println(kredi1);
		
		String[] krediler= {
		
				"hýzlý kredi",
				"taþýt kredisi",
				"emeklilik kredisi"
		};
		
		for(String kredi:krediler)
		{
			System.out.println(kredi);
		}
		System.out.println("----");
		for(int i=0;i<krediler.length;i++)
		{
			System.out.println(krediler[i]);
		}
	
		
		int s1=10;
		int s2=20;
		s1=s2;
		s2=100;
		System.out.println(s1);
		
		
		int sayilar1[]= {1,2,3,4,5};
		int sayilar2[]= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		//ÝSTÝSNAÝ DURUM----> ÇÜNKÜ STRÝNG VERÝ TÝPLERÝ ARKA TARAFTA CHAR ARRAY OLARAK TUTULUR.
		String sehir1="istanbul";
		String sehir2="ankara";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1); // yine ankara yazar
		
		
		
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//V�DEO 5
		System.out.println("hello java");
		
		//V�DEO 6
		int studentNumber=5;
		String message= "students number:";
		System.out.println("student was added! " + studentNumber);
		System.out.println(message + " " + studentNumber);
		
		//V�DEO 7
		double sayi=12.5;
		sayi=-129;
		
		char characters='A';
		boolean isTrue=false;
		
		
		//V�DEO 8
		int number=24;
		
		if(number<20)
		{
			System.out.println("sayi 20 den kucuktur");
		}else if(sayi==20){
			System.out.println("sayi 20 ye e�it");
		}else {
			System.out.println("sayi 20 den buyuk");
		}
		
		
		//V�ODE 9 
		int s1=19;
		int s2=25;
		int s3=99;
		
		int enBuyuk=s2;
		
		if(s1>s2)
		{
			System.out.println(s1 + " " + s2 + "'den b�y�kt�r");
		}else if(s3>s2) {
			System.out.println(s3 + " " + s2 + "'den b�y�kt�r");
		}else {
			System.out.println("en buyuk sayi " + s2);
		}
		
		
		//V�DEO 10
		//switch bloklar�
		
		char grade='B';
		
		switch(grade) {
		
		case 'A':System.out.println("�ok iyi bir oratlama ile ge�tiniz");
		break;
		
		case 'B':System.out.println("iyi bir otalama ile ge�tiniz");
		break;
		
		case 'C':System.out.println("Ortalama bir derece ile ge�tiniz");
		break;
		
		default:System.out.println("Ge�ersiz");
		break;
		
		
		
		
		
		}
		
		
		
		//V�DEO 11
		
		for(int i=0;i<5;i++)
		{
			System.out.println("fdkmk");
		}
		
		System.out.println("d�ng� bitti");
		
		//V�DEO 12
		
		int i=2;
		while(i<10)
		{
			System.out.println("d�ng�deyim");
			i+=1;
		}
		
		System.out.println("d�ng� bitti");
		
		//V�ODEO 13
		int j=0;
		do {
			System.out.println("d�ng� i�i");
			j+=1;
		}while(j<4);
		
		System.out.println("d�ng� bitti kesin");
		
		//V�DEO 14
		
		String[] kelimeler=new String[3];
		kelimeler[0]="eda";
		kelimeler[1]="merhaba";
		kelimeler[2]="pandemi";
		
		
		//V�DEO 15
		int[] myList= {1,2,3,4,5,6};
		
		int total=0;
		
		for(int k:myList)
		{
			total+=k;
		}
		
		System.out.println("total: " + total);
		
		//V�DEO 16
		
		String[][] cities=new String[2][2];
		
		cities[0][0]="malatya";
		cities[0][1]="mu�la";
		cities[1][0]="erzincan";
		cities[1][1]="izmir";
		
		//V�DEO 17,18
		String message2="Merhaba Java";
		
		System.out.println(message2.length());
		System.out.println(message2.charAt(3));
		System.out.println(message2.concat("yaz�l�mc�"));
		System.out.println(message2.endsWith("f"));
		System.out.println(message2.startsWith("merhaba"));
		
		System.out.println(message2.indexOf("merhaba"));
		
		message2=message2.toLowerCase();
		message2=message2.toUpperCase();
		
		message2.split(" ");
		System.out.println(message2.substring(2,6));
		
		
		//V�DEO 19
		
		int number2=-2;
		boolean isPrime=true;
		int remainden=number2%2;
		
		
		if(number2==1)
		{
			System.out.println("say� asal de�ildir");
			
		}
		else if(number2<1){
			System.out.println("ge�ersiz say�");
		}
		
		
		for(int f=2;f<number2;f++)
		{
			if(number2%f==0)
			{
				isPrime=false;
			}
		}
			
		
		if(isPrime)
		{
			System.out.println("say� asald�r");
		}
		
		else
		{
			System.out.println("say� asal de�il");
		}
		
		
		//V�DEO 20
		
		char harf='a';
		
		
		switch(harf)
		{
		case    'a':
		case	'�':
		case	'o':
		case	'u': System.out.println("kal�n �nl�");
					 break;
		case 'e':
		case 'i':
		case '�':
		case '�': System.out.println("ince �nl�");
		break;
		
		
		
		
		}
		
		
		//V�DEO 21
		Scanner scan = new Scanner(System.in);
        int toplam = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi5 = scan.nextInt();
        
        for(int c = 1; c < sayi; c++)
        {
            if(sayi % c == 0) {
                toplam += c;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " M�kemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " M�kemmel bir sayi degildir.");
        }
        
        
        //V�DEO 22
        int birincisayi,ikincisayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Say�y� Giriniz:");

        birincisayi = input.nextInt();

        System.out.println("�kinci Say�y� Giriniz:");

        ikincisayi = input.nextInt();

        System.out.println(birincisayi + "  " + "ile" + "  " + ikincisayi + " " + kontrol(birincisayi,ikincisayi));

    }

    public static String kontrol(int birincisayi,int ikincisayi)

    {

        int birinciTop=0;

        int ikinciTop=0;

        for(int i=1;i<birincisayi;i++){

            if(birincisayi%i==0)

                birinciTop +=i;

            

    }

         for(int i=1;i<ikincisayi;i++){

            if(ikincisayi%i==0)

                ikinciTop +=i;

            

    }

         if(birincisayi==ikinciTop && ikincisayi==birinciTop)

             return "Arkada� Say�lard�r.";

         else

             return "Arkada� Say�lar De�ildir.";
        
        
		
	}

}

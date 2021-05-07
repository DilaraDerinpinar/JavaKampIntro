import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VÝDEO 5
		System.out.println("hello java");
		
		//VÝDEO 6
		int studentNumber=5;
		String message= "students number:";
		System.out.println("student was added! " + studentNumber);
		System.out.println(message + " " + studentNumber);
		
		//VÝDEO 7
		double sayi=12.5;
		sayi=-129;
		
		char characters='A';
		boolean isTrue=false;
		
		
		//VÝDEO 8
		int number=24;
		
		if(number<20)
		{
			System.out.println("sayi 20 den kucuktur");
		}else if(sayi==20){
			System.out.println("sayi 20 ye eþit");
		}else {
			System.out.println("sayi 20 den buyuk");
		}
		
		
		//VÝODE 9 
		int s1=19;
		int s2=25;
		int s3=99;
		
		int enBuyuk=s2;
		
		if(s1>s2)
		{
			System.out.println(s1 + " " + s2 + "'den büyüktür");
		}else if(s3>s2) {
			System.out.println(s3 + " " + s2 + "'den büyüktür");
		}else {
			System.out.println("en buyuk sayi " + s2);
		}
		
		
		//VÝDEO 10
		//switch bloklarý
		
		char grade='B';
		
		switch(grade) {
		
		case 'A':System.out.println("çok iyi bir oratlama ile geçtiniz");
		break;
		
		case 'B':System.out.println("iyi bir otalama ile geçtiniz");
		break;
		
		case 'C':System.out.println("Ortalama bir derece ile geçtiniz");
		break;
		
		default:System.out.println("Geçersiz");
		break;
		
		
		
		
		
		}
		
		
		
		//VÝDEO 11
		
		for(int i=0;i<5;i++)
		{
			System.out.println("fdkmk");
		}
		
		System.out.println("döngü bitti");
		
		//VÝDEO 12
		
		int i=2;
		while(i<10)
		{
			System.out.println("döngüdeyim");
			i+=1;
		}
		
		System.out.println("döngü bitti");
		
		//VÝODEO 13
		int j=0;
		do {
			System.out.println("döngü içi");
			j+=1;
		}while(j<4);
		
		System.out.println("döngü bitti kesin");
		
		//VÝDEO 14
		
		String[] kelimeler=new String[3];
		kelimeler[0]="eda";
		kelimeler[1]="merhaba";
		kelimeler[2]="pandemi";
		
		
		//VÝDEO 15
		int[] myList= {1,2,3,4,5,6};
		
		int total=0;
		
		for(int k:myList)
		{
			total+=k;
		}
		
		System.out.println("total: " + total);
		
		//VÝDEO 16
		
		String[][] cities=new String[2][2];
		
		cities[0][0]="malatya";
		cities[0][1]="muðla";
		cities[1][0]="erzincan";
		cities[1][1]="izmir";
		
		//VÝDEO 17,18
		String message2="Merhaba Java";
		
		System.out.println(message2.length());
		System.out.println(message2.charAt(3));
		System.out.println(message2.concat("yazýlýmcý"));
		System.out.println(message2.endsWith("f"));
		System.out.println(message2.startsWith("merhaba"));
		
		System.out.println(message2.indexOf("merhaba"));
		
		message2=message2.toLowerCase();
		message2=message2.toUpperCase();
		
		message2.split(" ");
		System.out.println(message2.substring(2,6));
		
		
		//VÝDEO 19
		
		int number2=-2;
		boolean isPrime=true;
		int remainden=number2%2;
		
		
		if(number2==1)
		{
			System.out.println("sayý asal deðildir");
			
		}
		else if(number2<1){
			System.out.println("geçersiz sayý");
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
			System.out.println("sayý asaldýr");
		}
		
		else
		{
			System.out.println("sayý asal deðil");
		}
		
		
		//VÝDEO 20
		
		char harf='a';
		
		
		switch(harf)
		{
		case    'a':
		case	'ý':
		case	'o':
		case	'u': System.out.println("kalýn ünlü");
					 break;
		case 'e':
		case 'i':
		case 'ö':
		case 'ü': System.out.println("ince ünlü");
		break;
		
		
		
		
		}
		
		
		//VÝDEO 21
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
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
        
        
        //VÝDEO 22
        int birincisayi,ikincisayi;

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci Sayýyý Giriniz:");

        birincisayi = input.nextInt();

        System.out.println("Ýkinci Sayýyý Giriniz:");

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

             return "Arkadaþ Sayýlardýr.";

         else

             return "Arkadaþ Sayýlar Deðildir.";
        
        
		
	}

}

package inheritance2;

public class LogManager {

	public void Log(int logType)
	{
		if(logType==1)
		{
			System.out.println("veritaban�na logland�");
		}else if(logType==2)
		{
			System.out.println("dosyaya logland�");
		}else
		{
			System.out.println("email e logland�");
		}
	}
	
	
	
		
}

//1-database
//2-file
//3-e mail
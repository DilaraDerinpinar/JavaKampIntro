package inheritance2;

public class LogManager {

	public void Log(int logType)
	{
		if(logType==1)
		{
			System.out.println("veritabanýna loglandý");
		}else if(logType==2)
		{
			System.out.println("dosyaya loglandý");
		}else
		{
			System.out.println("email e loglandý");
		}
	}
	
	
	
		
}

//1-database
//2-file
//3-e mail
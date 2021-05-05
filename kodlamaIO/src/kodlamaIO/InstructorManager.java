package kodlamaIO;

public class InstructorManager {

	
	public void UpdateProgram(Instructor[] instructors)
	{
		
		for(int i=0;i<instructors.length;i++)
		{
			if(instructors[i].department=="kimya")
			{
				System.out.println("kimya hocalarýnýn bugün labaratuvar dersleri olmayacaktýr");
			}
			else if(instructors[i].department=="matematik")
			{
				System.out.println("bugünkü matematik dersi programýnda integrale giriþ yapýlacaktýr");
			}
			else
			{
				System.out.println("programda herhangi bir deðiþiklik yok");
			}
		}
			
			
		
	}
	
	
}

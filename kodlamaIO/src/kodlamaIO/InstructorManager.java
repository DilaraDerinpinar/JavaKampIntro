package kodlamaIO;

public class InstructorManager {

	
	public void UpdateProgram(Instructor[] instructors)
	{
		
		for(int i=0;i<instructors.length;i++)
		{
			if(instructors[i].department=="kimya")
			{
				System.out.println("kimya hocalar�n�n bug�n labaratuvar dersleri olmayacakt�r");
			}
			else if(instructors[i].department=="matematik")
			{
				System.out.println("bug�nk� matematik dersi program�nda integrale giri� yap�lacakt�r");
			}
			else
			{
				System.out.println("programda herhangi bir de�i�iklik yok");
			}
		}
			
			
		
	}
	
	
}

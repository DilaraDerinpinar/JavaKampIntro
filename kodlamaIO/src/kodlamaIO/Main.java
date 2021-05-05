package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3.HAFTA ÖDEVÝ
		
		Instructor instructor1=new Instructor();
		instructor1.setFirstName("berrin");
		instructor1.setLastName("kutlu");
		instructor1.instructorNo="122";
		instructor1.setID(11);
		instructor1.setPassword("32423nd");
		instructor1.department="kimya";
		
		
		Instructor instructor2=new Instructor();
		instructor2.setFirstName("ahmet");
		instructor2.setLastName("candan");
		instructor2.instructorNo="123";
		instructor2.setID(25);
		instructor2.setPassword("dssd");
		instructor2.department="matematik";
		
		
		Instructor[] instructors= {instructor1,instructor2};
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.UpdateProgram(instructors);
		
		System.out.println("**************************************");
		
		Student student1=new Student();
		student1.classNo="2";
		student1.setFirstName("feyza");
		student1.setID(22);
		student1.setLastName("zara");
		student1.studentNo="111";
		student1.setPassword("fdkngjsfd");
		
		StudentManager studentManager=new StudentManager();
		studentManager.deleteStudent(student1);
		
		System.out.println("**************************************");
		
		User user1=new User();
		user1.setFirstName("damla");
		user1.setID(44);
		user1.setLastName("demir");
		user1.setPassword("3945fsd");
		
		UserManager userManager=new UserManager();
		userManager.AddUser(user1);
		
		
		
		
		
		
	}

}

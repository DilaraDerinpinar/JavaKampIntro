
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2.HAFTA �DEV�
		
		
		Course course = new Course();
		course.id =1;
		course.name ="JAVA";
		course.instructorName="Engin Demiro�";
		
		Course course1 = new Course();
		course1.id =2;
		course1.name="C#";
		course1.instructorName="Engin Demiro�";
		
		
		Course[] courses = {course, course1};
		
		for (Course course3 : courses) {
			System.out.println("kurs  " + course3.name + "E�itmen  " + course3.instructorName);
		}
		
		
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(course);
		courseManager.delete(course1);
		
		
		
		
		Student student = new Student(1,"Deniz","Kurt","denizkurt@outlook.com","abcdef");
		
		Student student1 = new Student();
		student1.firstName ="Ahmet";
		student1.lastName ="K�l��";
		student1.email ="ahmetK�l�c@gmail.com";
		student1.password= "123456";
		
	    
		Student [] students = {student,student1};
		for (Student student2 : students) {
			
			System.out.println("��renci: " + student2.firstName +  student2.lastName);
			
		}
		
		
		
		
		Instructor instructor = new Instructor(1,"Engin","Demirog");
		
		System.out.println("Egitmen : " + instructor.firstName + " " + instructor.lastName );
		
		
		
		
		
	}

}

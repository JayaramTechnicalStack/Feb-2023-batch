
public class StudentTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		// set the student object data 
		
		s.setStudentId(100);
		s.setStudentName("Ajay");
		s.setStudentCourse("java");
		s.setStudentMarks(97.5);
		
		System.out.println("Student Id is :" +s.getStudentId());
		System.out.println("Student name is :"+s.getStudentName());
		System.out.println("Student Course name is :"+s.getStudentCourse());
		System.out.println("Student Marks is :"+s.getStudentMarks());
	}

}

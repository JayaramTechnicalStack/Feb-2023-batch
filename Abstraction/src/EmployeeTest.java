
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(123, "Ajay");
		e1.getEmployeeInformation();
		Employee e2 = new Employee(101, "Vijay");
		e2.getEmployeeInformation();
		Employee e3 = new Employee(102, "Ravi");
		e3.getEmployeeInformation();
		
		Employee e4 = new Employee(104, "Jay");
		e4.getEmployeeInformation();
		
		e4.getEmployeeCount();
		/*
		 * System.out.println(e1.getEmpId() + " "+e1.getEmpName() +
		 * " "+e1.getEmployeerName()); System.out.println(e2.getEmpId() +
		 * " "+e2.getEmpName() + " "+e2.getEmployeerName());
		 */
	}

}

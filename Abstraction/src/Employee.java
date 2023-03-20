
public class Employee {

	private int empId;
	private String empName;
	private static String companyName= "TCS"; // 1000 
	private static int employeeCount ;
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Employee(int empId, String empName) {
		
		this.empId = empId;
		this.empName = empName;
		employeeCount++;
		
	}
	
	public void getEmployeeInformation() {
		System.out.println("Employee Object info:" + empId + " "+empName + " "+companyName);
		
	}
	
	public void getEmployeeCount() {
		System.out.println("No Of employee Records created for today :"+employeeCount);
	}
}

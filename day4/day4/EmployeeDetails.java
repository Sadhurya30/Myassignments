package week1.day4;

public class EmployeeDetails {
 
	public void employeeName(String empName, int empId) {
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: " +empId);
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Employee Address: " +empAddress);
	}
	
	public void empSalary(double empSalary) {
		System.out.println("Employee salary: " + empSalary);
	}
	
	public void employeeMobileNumber(long mobNum) {
		System.out.println("Employee mobile number: " +mobNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails chaaru = new EmployeeDetails();
		chaaru.employeeName("Shreya", 12345);
		chaaru.getEmployeeAddress("Bangalore");
		chaaru.empSalary(150000.456);
		chaaru.employeeMobileNumber(9940354630L);
		

	}

}

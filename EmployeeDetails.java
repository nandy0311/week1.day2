package week1.day2;

/*
printEmployeeName(String empName, int empId) -> print the empName & empId
getEmployeeAddress(String empAddress) -> print address (eg: Chennai)
printEmployeeSalary(double empSalary) -> print the empSalary
printEmployeeMobileNumber(long mobNum) -> print the phoneNumber
Call all the methods from main() and execute*/

public class EmployeeDetails {
	
	public void printEmployeeName(String empName, int empId) {
		System.out.println(empName+ " "+ empId);
	}
	String getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
		return empAddress;
	}
	private double printEmployeeSalary(double empSalary) {
		return empSalary;
		
	}
	private long printEmployeeMobileNumber(long mobNum) {
		return mobNum;
	}
	
	public static void main(String[] args) {
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Tom", 123);
		obj.getEmployeeAddress("Chennai");
		double printEmployeeSalary = obj.printEmployeeSalary(60000.99);
		System.out.println(printEmployeeSalary);
		System.out.println(obj.printEmployeeMobileNumber(99887666L));
		
	}

}

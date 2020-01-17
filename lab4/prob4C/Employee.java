package lesson4.prob2;

public abstract class Employee {

	private String empId;
	
	public Employee(String empId) {
		this.empId = empId;
	}
	
	public void print(int month, int year) {
		PayCheck payCheck = calcCompensation(month, year);
		System.out.println("Employee Id:" + empId);
		payCheck.print();
		
	}
	
	
	  public PayCheck calcCompensation(int month, int year) {
		  
		  double grossPay = this.calcGrossPay(month, year);
		  double fica = 0.23;
		  double state = 0.05;
		  double local = 0.01;
		  double medicare = 0.03;
		  double socialSecurity = 0.075;
		  
		  return new PayCheck(grossPay, fica, state, local, medicare, socialSecurity);
	  
	  }
	 
	
	public abstract double calcGrossPay(int month, int year);
	
}

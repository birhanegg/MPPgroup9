package lesson4.prob2;

public class Salaried extends Employee{
	private int salary;

	
	public Salaried(String empId, int salary) {
		super(empId);
		this.salary = salary;
	}


	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return salary;
	}

}

package lesson4.prob2;

import java.util.List;

public class Commissioned extends Employee{
	
	private double commission;
	private double baseSalary;
	private List<Order> order;
	
	
	public Commissioned(String empId, double commission, double baseSalary, List<Order> order) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.order = order;
	}


	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		
		int orderAmount = 0;
		for(Order ord: order) {
			if(ord.getOrderDate().getMonthValue() == month && ord.getOrderDate().getYear() == year)
			orderAmount += ord.getOrderAmount();
		}
		return baseSalary + commission * orderAmount;
	}
	

}

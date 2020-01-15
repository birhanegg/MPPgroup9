package demoPackage;

import prob2B.Order;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new Order(1, 2020, 1, 15,1, 2.3, "Excelent");
		order.addOrderLine(2, 4.2, "Good");
		System.out.println(order);

	}

}

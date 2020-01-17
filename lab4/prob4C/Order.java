package lesson4.prob2;

import java.time.LocalDate;

public class Order {
	
	private String orderNum;
	private LocalDate orderDate;
	private int orderAmount;
	
	public Order(String orderNum, LocalDate orderDate, int orderAmount) {
		this.orderNum = orderNum;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	
	/**
	 * @return the orderNum
	 */
	public String getOrderNum() {
		return orderNum;
	}
	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @return the orderAmount
	 */
	public int getOrderAmount() {
		return orderAmount;
	}

}

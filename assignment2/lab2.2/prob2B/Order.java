package prob2B;

import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {
	private List<OrderLine> orderLines;
	private int orderNum;
	private LocalDate orderDate;

	public Order(int orderNum, int year, int month, int day, int lineNum, double price, String quality) {

		this.orderNum = orderNum;
		orderDate = LocalDate.of(year, month, day);
		orderLines = new LinkedList<OrderLine>();
		OrderLine orderline = new OrderLine(lineNum, price, quality, this);
		orderLines.add(orderline);
	}

	@Override
	public String toString() {

		StringBuffer builder = new StringBuffer();
		for (OrderLine orderLine : orderLines) {
			builder.append(orderLine.toString()+" ");
		}

		return "orderLines=" + "["+ builder.toString()+ "]" + ", orderNum=" + orderNum + ", orderDate=" + orderDate;
	}

	public void addOrderLine(int lineNumber, double price, String quality) {
		OrderLine orderLine = new OrderLine(lineNumber, price, quality, this);
		orderLines.add(orderLine);
	}

	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the orderLines
	 */
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	/**
	 * @return the orderNum
	 */
	public int getOrderNum() {
		return orderNum;
	}

}

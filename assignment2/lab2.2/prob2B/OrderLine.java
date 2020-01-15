package prob2B;

public class OrderLine {
	
	private Order order;
	private int lineNumber;
	private double price;
	private String quality;
	
	//package level
	
	OrderLine(int lineNumber, double price, String quality, Order order){
		this.order=order;
		this.lineNumber = lineNumber;
		this.price = price;
		this.quality = quality;	
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @return the lineNumber
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	@Override
	public String toString() {
		return "lineNumber=" + lineNumber + ", price=" + price + ", quality=" + quality;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the quality
	 */
	public String getQuality() {
		return quality;
	}
}

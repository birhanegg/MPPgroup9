package lab3.prob4.property;

public class House extends Property {

	private double lotSize;

	public House(double lotSize, Address addr) {
		this.lotSize = lotSize;
		this.address = addr;
	}

	public double computeRent() {
		return 0.1 * lotSize;
	}

	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

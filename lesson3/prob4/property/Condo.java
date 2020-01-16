package lesson3.prob4.property;

public class Condo extends Property {
	private int numberOfFloors;

	public Condo(int numberOfFloors, Address addr) {
		this.numberOfFloors = numberOfFloors;
		this.address = addr;

	}

	public double computeRent() {
		return 500 * numberOfFloors;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}

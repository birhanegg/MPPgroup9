package lab3.prob4.property;

abstract public class Property {
	public Address address;

	public abstract double computeRent();

	public Address getAddress() {
		return address;
	}
}

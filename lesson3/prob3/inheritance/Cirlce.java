package lesson3.prob3.inheritance;

public class Cirlce extends Cylinder {
	public Cirlce(double radius) {
		super(radius, 0);
	}

	public double getRadius() {
		return getRadius();
	}

	public double computeArea() {
		return Math.PI * getRadius() * getRadius();
	}
}

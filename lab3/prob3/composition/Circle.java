package lab3.prob3.composition;

public class Circle {
	private double radius;

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double computeArea() {
		return Math.PI * radius * radius;
	}
}

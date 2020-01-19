package lab5.prob2;

final public class Circle implements Figure {
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}

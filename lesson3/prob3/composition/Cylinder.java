package lesson3.prob3.composition;

public class Cylinder {

	private Circle circle;
	private double height;

	public Cylinder(double radius, double height) {
		this.height = height;
		this.circle = new Circle(radius);
	}

	public double getHeight() {
		return height;
	}

	public double computeVolume() {
		return circle.computeArea() * height;
	}

	public static void main(String[] args) {
		Cylinder cy = new Cylinder(10, 10);
		System.out.println("cylinder volume : " + cy.computeVolume());
	}

}

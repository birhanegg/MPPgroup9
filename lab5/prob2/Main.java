package lab5.prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Figure> list = new ArrayList<Figure>();
		list.add(new Circle(2));
		list.add(new Rectangle(3, 4));
		list.add(new Triangle(3, 4));
		double sum = 0;
		for (Figure figure : list) {
			System.out.format(figure.getClass().getSimpleName() + " Area :%.2f \n", figure.computeArea());
			sum += figure.computeArea();
		}
		System.out.println("\n----------------------");
		System.out.format("Sum of Areas = %.2f", sum);
	}
}

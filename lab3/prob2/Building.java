package lab3.prob2;

import java.util.List;

public class Building {

	private List<Apartment> apartment;
	private double maitanceCost;

	public Building(List<Apartment> apartment, double maitanceCost) {
		this.apartment = apartment;
		this.maitanceCost = maitanceCost;
	}

	public double profit() {
		double sum = 0;
		for (Apartment aprt : apartment) {
			sum += aprt.getRent();
		}

		return sum - maitanceCost;
	}
}

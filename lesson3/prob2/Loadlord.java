package lesson3.prob2;

import java.util.List;

public class Loadlord {
	private List<Building> building;

	public Loadlord(List<Building> building) {
		this.building = building;
	}

	public double calculateProfit() {
		double profit = 0;
		for (Building blg : building) {
			profit += blg.profit();
		}
		return profit;
	}
}

package lesson3.prob2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// List of apartments
		Apartment[] apt1 = { new Apartment(1000), new Apartment(1000), new Apartment(1000) };
		Apartment[] apt2 = { new Apartment(2000), new Apartment(2000), new Apartment(2000) };
		Apartment[] apt3 = { new Apartment(3000), new Apartment(3000), new Apartment(3000) };

		// List buildings
		Building[] building = { new Building(Arrays.asList(apt1), 1000), new Building(Arrays.asList(apt2), 2000),
				new Building(Arrays.asList(apt3), 3000) };

		// landlord
		Loadlord landlord = new Loadlord(Arrays.asList(building));

		System.out.println("Landlord's Profit is  : " + landlord.calculateProfit());
	}

}

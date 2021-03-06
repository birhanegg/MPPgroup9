package lab3.prob4;

import lab3.prob4.property.Address;
import lab3.prob4.property.Condo;
import lab3.prob4.property.House;
import lab3.prob4.property.Property;
import lab3.prob4.property.Trailer;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { new House(1000, new Address("1001 Algiro", "Fairfield", "IA", "52556")),
				new Condo(10, new Address("1002 Algiro", "Fairfield", "IA", "52556")),
				new Trailer(new Address("1003 Algiro", "Fairfield", "IA", "52556")) };

		System.out.println("Total Rent : " + Admin.computeTotalRent(objects));

		System.out.println("Property List : \n " + Admin.printProperty(objects));

	}
}

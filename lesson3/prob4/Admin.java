package lesson3.prob4;

import lesson3.prob4.property.Property;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property p : properties) {
			totalRent += p.computeRent();
		}
		return totalRent;
	}

	public static String printProperty(Property[] properties) {
		StringBuffer sb = new StringBuffer();

		for (Property property : properties) {
			sb.append(property.getClass().getSimpleName());
			sb.append(": ");
			sb.append(property.getAddress().getStreet());
			sb.append(", ");
			sb.append(property.getAddress().getCity());
			sb.append(", ");
			sb.append(property.getAddress().getState());
			sb.append(", ");
			sb.append(property.getAddress().getZip());
			sb.append("\n");
		}

		return sb.toString();
	}
}

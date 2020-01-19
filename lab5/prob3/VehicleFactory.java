package lab5.prob3;

public class VehicleFactory {
	private static final VehicleFactory instance = new VehicleFactory();

	public static VehicleFactory getInstance() {
		return instance;
	}

	public Vehicle getVehicle(String type) {
		Vehicle vehicle;
		switch (type) {
		case "Bus":
			vehicle = new Bus();
			break;
		case "Car":
			vehicle = new Car();
			break;
		case "ElectricCar":
			vehicle = new ElectricCar();
			break;
		case "Track":
			vehicle = new Track();
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		return vehicle;
	}

}
package lab5.prob3;

public class App {

	public static void main(String[] args) {

		VehicleFactory factory = new VehicleFactory();
		factory.getVehicle("Bus").startEngine();
		factory.getVehicle("Car").startEngine();
		factory.getVehicle("ElectricCar").startEngine();
		factory.getVehicle("Track").startEngine();
	}
}

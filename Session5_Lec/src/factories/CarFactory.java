package factories;

import main.Car;
import main.Vehicle;

public class CarFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}

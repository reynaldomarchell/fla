package factories;

import main.Truck;
import main.Vehicle;

public class TruckFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicle() {
		return new Truck();
	}
}

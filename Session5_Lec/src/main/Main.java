package main;

import factories.CarFactory;
import factories.TruckFactory;
import factories.VehicleFactory;

public class Main {
	public Main() {
		// Create Car
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.create();  // Output: Car created.

        // Create Truck
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.create();  // Output: Truck created.
	}
	public static void main(String[] args) {
		new Main();

	}

}

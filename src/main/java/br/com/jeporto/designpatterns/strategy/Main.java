package br.com.jeporto.designpatterns.strategy;

public class Main {

	public static void main(String[] args) {

		VehicleContext vehicleContext = new VehicleContext(new CarStrategy());
		vehicleContext.executeVehicleStrategy();

		vehicleContext = new VehicleContext(new TruckStrategy());
		vehicleContext.executeVehicleStrategy();
	}
}
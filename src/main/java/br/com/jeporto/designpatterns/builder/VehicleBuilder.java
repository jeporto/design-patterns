package br.com.jeporto.designpatterns.builder;

public class VehicleBuilder {

	public Vehicle getVehicleFromItaly() {
		Vehicle vehicle = new Vehicle();
		vehicle.addItem(new Ferrari());
		return vehicle;
	}

	public Vehicle getVehicleFromGermany() {
		Vehicle vehicle = new Vehicle();
		vehicle.addItem(new BMW());
		return vehicle;
	}
}
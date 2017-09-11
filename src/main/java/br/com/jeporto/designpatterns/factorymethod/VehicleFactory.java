package br.com.jeporto.designpatterns.factorymethod;

public class VehicleFactory {

	public Vehicle getVehicle(String type) {
		if ("car".equals(type))
			return new Car();
		else if ("truck".equals(type))
			return new Truck();
		
		return null;
	}
}

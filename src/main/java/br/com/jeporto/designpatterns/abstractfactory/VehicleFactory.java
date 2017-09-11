package br.com.jeporto.designpatterns.abstractfactory;

public class VehicleFactory extends AbstractFactory {

	public Vehicle getVehicle(String vehicle) {
		if ("car".equals(vehicle))
			return new Car();
		else if ("truck".equals(vehicle))
			return new Truck();
		
		return null;
	}

	@Override
	Brand getBrand(String brand) {
		return null;
	}
}

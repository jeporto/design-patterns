package br.com.jeporto.designpatterns.factorymethod;

public class Main {

	public static void main(String[] args) {
		VehicleFactory factory = new VehicleFactory();
		
		Vehicle car = factory.getVehicle("car");
		car.start();

		Vehicle truck = factory.getVehicle("truck");
		truck.start();
	}
}

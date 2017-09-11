package br.com.jeporto.designpatterns.abstractfactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory brandFactory = FactoryProducer.getFactory("brand");
		Brand ferrari = brandFactory.getBrand("ferrari");
		ferrari.getCountry();

		AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle");
		Vehicle car = vehicleFactory.getVehicle("car");
		car.start();
	}
}

package br.com.jeporto.designpatterns.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {

		if (type.equalsIgnoreCase("brand")) {
			return new BrandFactory();

		} else if (type.equalsIgnoreCase("vehicle")) {
			return new VehicleFactory();
		}

		return null;
	}
}
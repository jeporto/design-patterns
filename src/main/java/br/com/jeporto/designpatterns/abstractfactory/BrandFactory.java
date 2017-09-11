package br.com.jeporto.designpatterns.abstractfactory;

public class BrandFactory extends AbstractFactory {

	public Brand getBrand(String brand) {
		if ("bmw".equals(brand))
			return new BMW();
		else if ("ferrari".equals(brand))
			return new Ferrari();
		
		return null;
	}

	@Override
	Vehicle getVehicle(String vehicle) {
		return null;
	}
}

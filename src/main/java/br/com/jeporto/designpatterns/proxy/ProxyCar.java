package br.com.jeporto.designpatterns.proxy;

public class ProxyCar implements Car {

	private RealCar realCar;
	private String carName;

	public ProxyCar(String carName) {
		this.carName = carName;
	}

	@Override
	public void display() {
		if (realCar == null) {
			realCar = new RealCar(carName);
		}
		realCar.display();
	}
}
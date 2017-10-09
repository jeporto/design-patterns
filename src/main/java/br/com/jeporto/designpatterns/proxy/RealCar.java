package br.com.jeporto.designpatterns.proxy;

public class RealCar implements Car {

	private String carName;

	public RealCar(String carName) {
		this.carName = carName;
		loadFromDB(carName);
	}

	@Override
	public void display() {
		System.out.println("Displaying " + carName);
	}

	private void loadFromDB(String carName) {
		System.out.println("Loading " + carName + " from DB");
	}
}
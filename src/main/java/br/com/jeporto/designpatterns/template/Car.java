package br.com.jeporto.designpatterns.template;

public abstract class Car {
	abstract void startCar();

	abstract void stopCar();

	public final void drive() {
		startCar();

		stopCar();
	}
}
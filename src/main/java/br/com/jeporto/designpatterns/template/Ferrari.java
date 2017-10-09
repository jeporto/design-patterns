package br.com.jeporto.designpatterns.template;

public class Ferrari extends Car {

	@Override
	void startCar() {
		System.out.println("Ferrari started!");
	}

	@Override
	void stopCar() {
		System.out.println("Ferrari stopped!");
	}
}
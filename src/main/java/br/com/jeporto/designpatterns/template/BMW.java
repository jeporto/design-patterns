package br.com.jeporto.designpatterns.template;

public class BMW extends Car {

	@Override
	void startCar() {
		System.out.println("BMW started!");
	}

	@Override
	void stopCar() {
		System.out.println("BMW stopped!");
	}
}
package br.com.jeporto.designpatterns.factorymethod;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");
	}

}

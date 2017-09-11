package br.com.jeporto.designpatterns.factorymethod;

public class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("Truck started");
	}

}

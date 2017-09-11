package br.com.jeporto.designpatterns.abstractfactory;

public class Truck implements Vehicle {

	@Override
	public void start() {
		System.out.println("Truck started");
	}

}

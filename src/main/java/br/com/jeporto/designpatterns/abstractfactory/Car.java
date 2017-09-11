package br.com.jeporto.designpatterns.abstractfactory;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");
	}

}

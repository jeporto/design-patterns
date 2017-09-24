package br.com.jeporto.designpatterns.strategy;

public class CarStrategy implements VehicleStrategy {

	@Override
	public void start() {
		System.out.println("Car started");
	}
}
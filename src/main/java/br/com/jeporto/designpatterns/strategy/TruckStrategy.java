package br.com.jeporto.designpatterns.strategy;

public class TruckStrategy implements VehicleStrategy {

	@Override
	public void start() {
		System.out.println("Truck started");
	}
}
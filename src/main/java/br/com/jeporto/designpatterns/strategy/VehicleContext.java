package br.com.jeporto.designpatterns.strategy;

public class VehicleContext {

	private VehicleStrategy strategy;

	public VehicleContext(VehicleStrategy strategy) {
		this.strategy = strategy;
	}

	public void executeVehicleStrategy() {
		strategy.start();
	}
}

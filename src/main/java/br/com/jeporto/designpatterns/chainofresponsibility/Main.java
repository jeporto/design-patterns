package br.com.jeporto.designpatterns.chainofresponsibility;

public class Main {
	private static AbstractVehicle getChainOfVehicles() {

		AbstractVehicle truckVehicle = new TruckVehicle(AbstractVehicle.TRUCK);
		AbstractVehicle carVehicle = new CarVehicle(AbstractVehicle.CAR);
		AbstractVehicle bikeVehicle = new BikeVehicle(AbstractVehicle.BIKE);

		truckVehicle.setNextVehicle(carVehicle);
		carVehicle.setNextVehicle(bikeVehicle);

		return truckVehicle;
	}

	public static void main(String[] args) {
		AbstractVehicle vehicleChain = getChainOfVehicles();

		vehicleChain.getLevel(AbstractVehicle.BIKE, "Bike.");
		vehicleChain.getLevel(AbstractVehicle.CAR, "Car.");
		vehicleChain.getLevel(AbstractVehicle.TRUCK, "Truck.");
	}
}

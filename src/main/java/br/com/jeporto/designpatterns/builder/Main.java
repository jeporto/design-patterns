package br.com.jeporto.designpatterns.builder;

public class Main {

	public static void main(String[] args) {
		VehicleBuilder vehicleBuilder = new VehicleBuilder();

		Vehicle italianVehicle = vehicleBuilder.getVehicleFromItaly();
		System.out.println("Italian Vehicle");
		italianVehicle.showItems();
		System.out.println("Total Price: " + italianVehicle.getTotalPrice());

		Vehicle germanVehicle = vehicleBuilder.getVehicleFromGermany();
		System.out.println("\n\nGerman Vehicle");
		germanVehicle.showItems();
		System.out.println("Total Price: " + germanVehicle.getTotalPrice());
	}
}

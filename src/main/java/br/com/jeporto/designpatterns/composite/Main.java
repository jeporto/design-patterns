package br.com.jeporto.designpatterns.composite;

public class Main {

	public static void main(String[] args) {

		Vehicle bigVehicle = new Vehicle("Shockwave", VehicleType.TRUCK);
		Vehicle mediumVehicle = new Vehicle("Ferrari", VehicleType.CAR);
		Vehicle smallVehicle = new Vehicle("Kawasaki", VehicleType.MOTORCYCLE);

		bigVehicle.add(mediumVehicle);
		mediumVehicle.add(smallVehicle);

		System.out.println(bigVehicle);

		for (Vehicle car : bigVehicle.getSubVehicles()) {
			System.out.println(car);

			for (Vehicle motorcycle : car.getSubVehicles()) {
				System.out.println(motorcycle);
			}
		}
	}
}

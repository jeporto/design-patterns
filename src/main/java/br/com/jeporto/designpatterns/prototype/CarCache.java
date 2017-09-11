package br.com.jeporto.designpatterns.prototype;

import java.util.Hashtable;

public class CarCache {

	private static Hashtable<String, Car> carMap = new Hashtable<String, Car>();

	public static Car getCar(String carId) {
		Car cachedCar = carMap.get(carId);
		return (Car) cachedCar.clone();
	}

	public static void loadCache() {
		Ferrari ferrari = new Ferrari();
		ferrari.setId("1");
		carMap.put(ferrari.getId(), ferrari);

		BMW bmw = new BMW();
		bmw.setId("2");
		carMap.put(bmw.getId(), bmw);
	}
}
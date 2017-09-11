package br.com.jeporto.designpatterns.prototype;

public class Main {

	public static void main(String[] args) {
		CarCache.loadCache();

		Car car = (Car) CarCache.getCar("1");
		System.out.println("Car : " + car.getName());

		Car car2 = (Car) CarCache.getCar("2");
		System.out.println("Car : " + car2.getName());
	}
}

package br.com.jeporto.designpatterns.singleton;

public class Main {

	public static void main(String[] args) {
		Car car = Car.getInstance();
		car.start();
	}
}

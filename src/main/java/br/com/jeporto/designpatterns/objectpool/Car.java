package br.com.jeporto.designpatterns.objectpool;

public class Car {

	private String id;

	public Car(String id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Car: " + this.id + ".");
	}

}
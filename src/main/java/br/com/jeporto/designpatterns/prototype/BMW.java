package br.com.jeporto.designpatterns.prototype;

public class BMW extends Car {

	public BMW() {
		name = "BMW";
	}
	
	@Override
	void start() {
		System.out.println("BMW started");
	}
}

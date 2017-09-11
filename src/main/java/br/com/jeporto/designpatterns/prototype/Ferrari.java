package br.com.jeporto.designpatterns.prototype;

public class Ferrari extends Car {

	public Ferrari() {
		name = "Ferrari";
	}
	
	@Override
	void start() {
		System.out.println("Ferrari started");
	}
}

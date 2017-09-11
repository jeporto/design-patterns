package br.com.jeporto.designpatterns.singleton;

public class Car {

	private static Car instance;
	
	private Car(){}
	
	public static Car getInstance() {
		if (null != instance)
			return instance;
		
		instance = new Car();
		
		return instance;
	}
	
	public void start() {
		System.out.println("Car started");
	}
}

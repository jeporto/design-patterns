package br.com.jeporto.designpatterns.observer;

public class Main {

	public static void main(String[] args) {

		VehicleSubject subject = new VehicleSubject();

		new CarObserver(subject);
		new TruckObserver(subject);

		System.out.println("First state change: 1");
		subject.setState(1);
		System.out.println("Second state change: 2");
		subject.setState(2);
	}
}

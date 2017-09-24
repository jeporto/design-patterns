package br.com.jeporto.designpatterns.observer;

public class CarObserver extends VehicleObserver {

	public CarObserver(VehicleSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Car state: " + subject.getState());
	}
}

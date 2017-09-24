package br.com.jeporto.designpatterns.observer;

public class TruckObserver extends VehicleObserver {

	public TruckObserver(VehicleSubject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Truck state: " + subject.getState());
	}
}

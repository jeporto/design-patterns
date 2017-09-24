package br.com.jeporto.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class VehicleSubject {

	private List<VehicleObserver> observers = new ArrayList<VehicleObserver>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}

	public void attach(VehicleObserver observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (VehicleObserver observer : observers) {
			observer.update();
		}
	}
}
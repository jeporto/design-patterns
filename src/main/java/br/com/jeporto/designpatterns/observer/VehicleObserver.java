package br.com.jeporto.designpatterns.observer;

public abstract class VehicleObserver {
	
	protected VehicleSubject subject;
	public abstract void update();
}
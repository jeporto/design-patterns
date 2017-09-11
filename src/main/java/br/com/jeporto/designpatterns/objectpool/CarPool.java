package br.com.jeporto.designpatterns.objectpool;

import java.util.UUID;

public class CarPool extends ObjectPool {

	public CarPool(int size) {
		super(size);
	}
	
	@Override
	public Car createNew() {
		return new Car(UUID.randomUUID().toString());
	}
}
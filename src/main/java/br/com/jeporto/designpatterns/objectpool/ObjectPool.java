package br.com.jeporto.designpatterns.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class ObjectPool implements Pool {

	private int size;

	private boolean shutdown;

	private BlockingQueue<Car> cars;

	public ObjectPool(int size) {
		this.size = size;
		shutdown = false;
		init();
	}

	private void init() {
		cars = new LinkedBlockingQueue<Car>();
		for (int i = 0; i < size; i++) {
			cars.add(createNew());
		}
	}

	@Override
	public Car get() {
		if (!shutdown) {
			Car car = null;
			try {
				car = cars.take();
			} catch (Exception e) {
				throw new RuntimeException("Error to take car");
			}

			return car;
		}

		throw new RuntimeException("Object pool is shutdown.");
	}

	@Override
	public void release(Car car) {
		try {
			cars.offer(car);
		} catch (Exception e) {
			throw new RuntimeException("Error to release car");
		}
	}

	@Override
	public void shutdown() {
		cars.clear();
	}

	public Integer size() {
		return cars.size();
	}

	public abstract Car createNew();
}
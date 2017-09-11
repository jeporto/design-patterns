package br.com.jeporto.designpatterns.objectpool;

public interface Pool {

	Car get();
	void release(Car car);
	void shutdown();
}
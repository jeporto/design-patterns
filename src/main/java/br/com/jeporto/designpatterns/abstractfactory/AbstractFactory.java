package br.com.jeporto.designpatterns.abstractfactory;

public abstract class AbstractFactory {

	abstract Brand getBrand(String brand);
	abstract Vehicle getVehicle(String vehicle) ;
}
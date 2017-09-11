package br.com.jeporto.designpatterns.builder;

public abstract class Car implements Item {

	@Override
	public abstract Float price();

	@Override
	public abstract String name();


}

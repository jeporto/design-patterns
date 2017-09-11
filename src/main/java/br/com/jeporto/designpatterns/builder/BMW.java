package br.com.jeporto.designpatterns.builder;

public class BMW extends Car {

	@Override
	public Float price() {
		return 4.5f;
	}

	@Override
	public String name() {
		return "BMW";
	}
}
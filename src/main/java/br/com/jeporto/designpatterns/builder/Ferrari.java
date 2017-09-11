package br.com.jeporto.designpatterns.builder;

public class Ferrari extends Car {

	@Override
	public Float price() {
		return 5.0f;
	}

	@Override
	public String name() {
		return "Ferrari";
	}
}
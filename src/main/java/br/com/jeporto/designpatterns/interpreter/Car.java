package br.com.jeporto.designpatterns.interpreter;

public class Car implements Expression {

	private String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(String name) {

		if (this.name.equals(name)) {
			return true;
		}
		return false;
	}
}

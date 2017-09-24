package br.com.jeporto.designpatterns.visitor;

public class Car implements CarPart {

	CarPart[] parts;

	public Car() {
		parts = new CarPart[] { new Engine() };
	}

	@Override
	public void accept(CarPartVisitor carPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(carPartVisitor);
		}
		carPartVisitor.visit(this);
	}
}
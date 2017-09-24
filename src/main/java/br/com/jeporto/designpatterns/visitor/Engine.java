package br.com.jeporto.designpatterns.visitor;

public class Engine implements CarPart {

	@Override
	public void accept(CarPartVisitor carPartVisitor) {
		carPartVisitor.visit(this);
	}
}
package br.com.jeporto.designpatterns.visitor;

public class CarPartDisplayVisitor implements CarPartVisitor {

	@Override
	public void visit(Car car) {
		System.out.println("Displaying Car.");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Displaying Engine.");
	}
}
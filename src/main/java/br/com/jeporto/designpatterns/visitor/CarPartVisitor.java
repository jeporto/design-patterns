package br.com.jeporto.designpatterns.visitor;

public interface CarPartVisitor {

	void visit(Car car);
	void visit(Engine engine);
}
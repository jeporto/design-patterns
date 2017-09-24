package br.com.jeporto.designpatterns.visitor;

public interface CarPart {
	
	void accept(CarPartVisitor carPartVisitor);
}
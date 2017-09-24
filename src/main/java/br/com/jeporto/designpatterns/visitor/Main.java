package br.com.jeporto.designpatterns.visitor;

public class Main {

	public static void main(String[] args) {

		CarPart car = new Car();
		car.accept(new CarPartDisplayVisitor());
	}
}
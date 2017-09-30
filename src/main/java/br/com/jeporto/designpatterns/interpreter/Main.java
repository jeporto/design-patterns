package br.com.jeporto.designpatterns.interpreter;

public class Main {

	public static void main(String[] args) {
		Expression ferrari = new Car("Ferrari");
		Expression lamborghini = new Car("Lamborghini");
		Expression isFromItaly = new FromItaly(ferrari, lamborghini);

		System.out.println("Is Lamborghini from Italy? " + isFromItaly.interpret("Lamborghini"));
	}
}
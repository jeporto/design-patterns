package br.com.jeporto.designpatterns.template;

public class Main {

	public static void main(String[] args) {
		Car car = new Ferrari();
		car.drive();
		
		System.out.println();
		
		car = new BMW();
		car.drive();
	}
}

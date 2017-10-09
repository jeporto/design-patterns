package br.com.jeporto.designpatterns.proxy;

public class Main {

	public static void main(String[] args) {
		Car car = new ProxyCar("Ferrari");
		
		car.display();
		System.out.println("");
		car.display();
	}
}

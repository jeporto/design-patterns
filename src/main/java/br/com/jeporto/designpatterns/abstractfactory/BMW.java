package br.com.jeporto.designpatterns.abstractfactory;

public class BMW implements Brand {

	@Override
	public void getCountry() {
		System.out.println("Germany");
	}

}

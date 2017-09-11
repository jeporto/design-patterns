package br.com.jeporto.designpatterns.abstractfactory;

public class Ferrari implements Brand {

	@Override
	public void getCountry() {
		System.out.println("Italy");
	}

}

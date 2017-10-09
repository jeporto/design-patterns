package br.com.jeporto.designpatterns.adapter;

class PlasticToyDuck implements ToyDuck {
	public void squeak() {
		System.out.println("Squeak");
	}
}
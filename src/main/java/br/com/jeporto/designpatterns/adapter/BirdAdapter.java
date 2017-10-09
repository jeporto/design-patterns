package br.com.jeporto.designpatterns.adapter;

class BirdAdapter implements ToyDuck {
	Bird bird;

	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}

	public void squeak() {
		bird.makeSound();
	}
}
package br.com.jeporto.designpatterns.bridge;

public class Square extends Shape {
	private int x, y;

	public Square(int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
	}

	public void draw() {
		drawAPI.drawSquare(x, y);
	}
}
package br.com.jeporto.designpatterns.chainofresponsibility;

public abstract class AbstractVehicle {
	public static int BIKE = 1;
	public static int CAR = 2;
	public static int TRUCK = 3;

	protected int level;

	protected AbstractVehicle nextVehicle;

	public void setNextVehicle(AbstractVehicle nextVehicle) {
		this.nextVehicle = nextVehicle;
	}

	public void getLevel(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextVehicle != null) {
			nextVehicle.getLevel(level, message);
		}
	}

	abstract protected void write(String message);
}

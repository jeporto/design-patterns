package br.com.jeporto.designpatterns.chainofresponsibility;

public class CarVehicle extends AbstractVehicle {
	
	public CarVehicle(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println("The Car level is " + level + " to " + message);
	}
}

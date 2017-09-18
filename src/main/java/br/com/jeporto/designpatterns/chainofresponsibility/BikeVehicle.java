package br.com.jeporto.designpatterns.chainofresponsibility;

public class BikeVehicle extends AbstractVehicle {
	
	public BikeVehicle(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println("The Bike level is " + level + " to " + message);
	}
}

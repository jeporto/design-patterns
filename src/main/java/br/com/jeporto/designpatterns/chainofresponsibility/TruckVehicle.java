package br.com.jeporto.designpatterns.chainofresponsibility;

public class TruckVehicle extends AbstractVehicle {
	
	public TruckVehicle(int level){
	      this.level = level;
	   }

	@Override
	protected void write(String message) {
		System.out.println("The Truck level is " + level + " to " + message);
	}
}

package br.com.jeporto.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	private String name;
	private VehicleType type;
	private List<Vehicle> subVehicles;

	public Vehicle(String name, VehicleType type) {
		this.name = name;
		this.type = type;
		subVehicles = new ArrayList<Vehicle>();
	}

	public void add(Vehicle e) {
		subVehicles.add(e);
	}

	public void remove(Vehicle e) {
		subVehicles.remove(e);
	}

	public List<Vehicle> getSubVehicles() {
		return subVehicles;
	}

	public String toString() {
		return ("Vehicle :[ Name : " + name + ", type : " + type + " ]");
	}
}
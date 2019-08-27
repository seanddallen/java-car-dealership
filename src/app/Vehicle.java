package app;

public class Vehicle {
	
	//String make;
	String model;
	int year;
    double cost;

	private String make;

	public Vehicle(String make, String model, int year, double cost) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.cost = cost;
	}
	public Vehicle(String make, String model, int year ) {
		this.make = make;
		this.model = model;
		this.year = year;
 	}

}

package app;

public class Employee {
	
	/////////////////////////// PROPERTIES/FIELDS \\\\\\\\\\\\\\\\\\\\\\\\\\\\

	String name; 
	String position;
	
	
	/////////////////////////// CONSTRUCTOR \\\\\\\\\\\\\\\\\\\\\\\\\\\\

	
	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	
	/////////////////////////// METHODS \\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
//		double cost = vehicle.cost;
//		double cash = cust.getCashOnHand();
		
		if(!finance) {
			runCreditHistory(cust);
		} else if(vehicle.cost <= cust.getCashOnHand()) {
			processTransaction(cust, cust.getCashOnHand());
		} else {
			System.out.println("Come back with more money");
		}
	}
	
	public void runCreditHistory(Customer cust) {
		int credit = cust.getCreditScore();

		if(credit < 550) {
			System.out.println("Credit not approved");
		} else if(credit > 550 && credit < 750) {
			System.out.println("Credit approved");
		} else if(credit > 750) {
			System.out.println("You Qualify for 0% APR");
		}
	}
	
	public void processTransaction(Customer cust, Double cost) {
		System.out.println("Bought Car");
	}
	
	
	
	/////////////////////////// GETTERS & SETTERS \\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

}

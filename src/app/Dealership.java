package app;

public class Dealership {

	public static void main(String[] args) {
		
		Customer sean = new Customer();
			sean.setName("Sean");
			sean.setAge(36);
			sean.setCreditScore(660);
			sean.setCashOnHand(360000);
		
		Vehicle honda = new Vehicle("Honda", "Accord", 2020, 36000); 
		
		Employee gayle = new Employee("Gayle", "HR");
		
		sean.purchaseCar(honda, gayle, false);
		
		gayle.handleCustomer(sean, true, honda);

	}

}

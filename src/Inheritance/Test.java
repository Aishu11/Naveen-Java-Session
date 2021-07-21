package Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.start(); // overriden method in child class
		b.stop("Aish"); // overriden method in child class
		b.autoparking(); // individual method in child class
		b.refuel(); // Parent class method
		b.vehicletype();
		
		// Top Casting
		Car c = new BMW();
		c.start();
		c.stop("Welldone");
		c.refuel();
		c.horn();
		
		VehicleClass vc = new BMW();
		vc.vehicletype(); // Only vehicle class methods will be accessible using vc
	}
	
	//Conclusion
	//When we do top casting, we could access only parent class methods and not any other 
	//When we do top casting, we cant access child class methods

}

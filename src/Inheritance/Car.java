package Inheritance;

public class Car extends VehicleClass{
	
	public void start(){
		System.out.println("Car Start");
	}
	
	public void stop(String name){
		System.out.println("Car Stop" + name);
	}
	
	public void refuel(){
		System.out.println("Car Refuel");
	}
	
	public void horn(){
		System.out.println("Horn");
	}
}

package Inheritance;

public class BMW extends Car{
	
	@Override	
	public void start(){
		System.out.println("BMW Start");
	}
	
	@Override
	public void stop(String name){
		System.out.println("BMW Stop" + name);
	}
	
	public void autoparking(){
		System.out.println("BMW Autoparking");
	}
}

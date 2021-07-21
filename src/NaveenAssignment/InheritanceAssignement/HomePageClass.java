package NaveenAssignment.InheritanceAssignement;

public class HomePageClass extends PageClass{
	
	public void homePageClass(String homepage){
		System.out.println("Home Page Class -- Individial method" + homepage);
	}
	
	@Override
	public void pagetitle(){
		System.out.println("Home Class--Title");
	}
	
	@Override
	public int pagetimeout(int timeout){
		System.out.println("Home Class-- Timeout" + timeout);
		return timeout;
	}
	
	@Override
	public void pageURL(){
		System.out.println("Home Class -- Page URL");
	}
	

}

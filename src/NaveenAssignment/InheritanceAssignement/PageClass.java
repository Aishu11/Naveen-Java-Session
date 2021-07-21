package NaveenAssignment.InheritanceAssignement;

public class PageClass extends WebAppClass{
	
	public void pagetitle(){
		System.out.println("Page Class--Title");
	}
	
	public int pagetimeout(int timeout){
		System.out.println("Page Class-- Timeout" + timeout);
		return timeout;
	}
	
	public void pageURL(){
		System.out.println("Page Class -- Page URL");
	}
	
	public void pageheader(){
		System.out.println("Page Class --- Page Header individual class");
	}
}

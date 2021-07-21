package NaveenAssignment.InheritanceAssignement;

public class RegistrationPageClass extends PageClass{
	
	public void registrationPageClass(String regpage){
		System.out.println("Reg Page Class -- Individial method" + regpage);
	}
	
	@Override
	public void pagetitle(){
		System.out.println("Reg Class--Title");
	}
	
	@Override
	public int pagetimeout(int timeout){
		System.out.println("Reg Class-- Timeout" + timeout);
		return timeout;
	}
	
	@Override
	public void pageURL(){
		System.out.println("Reg Class -- Page URL");
	}
	

}

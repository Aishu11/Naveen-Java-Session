package NaveenAssignment.InheritanceAssignement;

public class LoginPageClass extends PageClass{
	
	public void loginPageClass(String loginpage){
		System.out.println("LoginPage Class -- Individial method" + loginpage);
	}
	
	@Override
	public void pagetitle(){
		System.out.println("Login Class--Title");
	}
	
	@Override
	public int pagetimeout(int timeout){
		System.out.println("Login Class-- Timeout" + timeout);
		return timeout;
	}
	
	@Override
	public void pageURL(){
		System.out.println("Login Class -- Page URL");
	}
	
	
}

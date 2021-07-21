package NaveenAssignment.InheritanceAssignement;

public class TestPageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPageClass lc = new LoginPageClass();
		lc.pageheader(); // individual class of Page i.e. inherited Class
		int timeout = lc.pagetimeout(1000); // overriden
		System.out.println(timeout);
		lc.pagetitle(); //overriden
		lc.pageURL(); //overriden
		lc.webApp(); //parent class
		lc.loginPageClass("Login Page");
		
		PageClass pc = new RegistrationPageClass();
		pc.pageheader();
		int timeout1 = lc.pagetimeout(300); // overriden
		System.out.println(timeout1);
		pc.pagetimeout(4000);
		pc.pagetitle();
		pc.webApp();
		pc.pageURL();
		

	}

}

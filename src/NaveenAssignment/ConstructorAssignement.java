package NaveenAssignment;

public class ConstructorAssignement {
	
	String firstname;
	String lastname;
	String email;
	long phnum;
	String pwd;
	
	public ConstructorAssignement(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public ConstructorAssignement(String firstname, String email, int phnum) {
		this.firstname = firstname;
		this.email = email;
		this.phnum = phnum;
	}

	public ConstructorAssignement(String firstname, String email, String pwd) {
		this.firstname = firstname;
		this.email = email;
		this.pwd = pwd;
	}

	public ConstructorAssignement(String firstname, String lastname, String email, int phnum, String pwd) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phnum = phnum;
		this.pwd = pwd;
	}
	
	public void test(){
		System.out.println("test123");
	}
	
	
	

}

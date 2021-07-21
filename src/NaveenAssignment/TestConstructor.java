package NaveenAssignment;

public class TestConstructor {

	public static void main(String[] args) {
		
		ConstructorAssignement CA1 = new ConstructorAssignement("Aish", "B");
		System.out.println(CA1.firstname + " " + CA1.lastname);
		
		ConstructorAssignement CA2 = new ConstructorAssignement("Aish", "abc.gmail.com", 979233637);
		System.out.println(CA2.firstname + " " + CA2.lastname);
		
		ConstructorAssignement CA3 = new ConstructorAssignement("Äish","B","äbc.gmail.com",7842123,"xxx");
		System.out.println(CA3.firstname + " " + CA3.lastname);
		
		CA1.test();
		CA2.test();
		
	
	}

}

package NaveenSessionPractiseAish;

public class StaticVsNonStatic {

	String name;
	static final int age = 30;

	public void mail() {
		System.out.println("Send Mail Method");
	}
	
	public static void sendEmail(){
		System.out.println("Send Email Method");
	}
	
	public int test(int i){
		return i+100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To call non static method // Create object
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "Aish";
		obj.mail();
		System.out.println(obj.name);
		int j = obj.test(100);
		System.out.println("Added value is:" + j);
		//obj.age =
		
		// To call static method // Call using Class name
		System.out.println(StaticVsNonStatic.age);
		StaticVsNonStatic.sendEmail();
		
	}

}

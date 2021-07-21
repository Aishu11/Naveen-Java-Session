package NaveenSessionPractiseAish;

public class Functions {
	
	public boolean getBrowserName(String browsername){
		switch (browsername) {
		case "chrome":
			System.out.println("Chrome Browser is launched");
			return true;
		case "firefox":
			System.out.println("firefox Browser is launched");
			return true;
		default:
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions obj = new Functions();
		obj.getBrowserName("chrome");

	}
}

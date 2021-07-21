package Interface;

public class CrossBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":
			System.out.println("Chrome browser will be launched");
			break;
		case "firefox":
			System.out.println("firefox browser will be launched");
			break;

		default:
			System.out.println("Please pass the correct browser");
			break;
		}

	}

}

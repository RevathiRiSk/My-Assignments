package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();

	}

}

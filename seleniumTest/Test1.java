package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		
		driver.close();
		
	}

}

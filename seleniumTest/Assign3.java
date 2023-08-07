package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");

		driver.findElement(By.xpath("//button[@class = 'btn btn-primary']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		
		
	}

}

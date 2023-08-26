package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
			public ChromeDriver driver;
			
			@BeforeMethod
	public void preConditions(){
		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		System.out.println(Thread.currentThread().getId());
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demoSalesManager");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
	}
	
			@AfterMethod
		public void postConditions(){
				driver.close();
			}
}

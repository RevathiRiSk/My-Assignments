package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("revms16@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String createdLeadName = driver.findElement(By.linkText("Revathi")).getText();
		String createdLeadName1 =driver.getTitle();
		
		driver.findElement(By.xpath("//a[text() = 'Revathi']")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.name("submitButton")).click();
		
		String duplicateLeadName = driver.findElement(By.linkText("Revathi")).getText();
		String duplicateLeadName1 = driver.getTitle();
		
		if (createdLeadName1 == duplicateLeadName1) {
			
			System.out.println("Both Lead Accounts are Same");
		}else {
			System.out.println("They both are Different");
		}

		driver.close();
		
	}

}

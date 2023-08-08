package seleniumTest;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElement(By.id("ext-gen248")).sendKeys("Revathi");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Revathi']")).click();
		
		String title_actual = driver.getTitle();
		String title_expected = "View Lead | opentaps CRM";
		
		if (title_actual.equals(title_expected)) {
			System.out.println("Page title verification successful.");
		}
		else {
			System.out.println("Page title verification is unsuccessful.");
		}
	
		
		driver.findElement(By.linkText("Edit")).click();
				
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		String newCompanyName = "Software Testing";
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(newCompanyName);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if(companyName.contains(newCompanyName)) {
			System.out.println("Company name update is successfull");
		}
		else {
			System.out.println("Update is Unsuccessfull");
		}
		
		driver.close();
	}

}

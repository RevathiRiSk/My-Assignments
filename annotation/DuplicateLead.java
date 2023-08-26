package annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{

	@Test
	public void runDuplicate() throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("revms16@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String createdLeadName = driver.findElement(By.xpath("//a[text()='Revathi']")).getText();
		System.out.println("Name of the First Resulting Lead : " +createdLeadName);
		
		driver.findElement(By.xpath("//a[text() = 'Revathi']")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		Thread.sleep(4000);
		
		String leadPage_expected = "Duplicate Lead | opentabs CRM";
		String duplicateLeadPage = driver.getTitle();
		
		
		if (duplicateLeadPage.equals(leadPage_expected)) {
			
			System.out.println("Page title verification successful. ");
		}else {
			System.out.println("Page title verification is unsuccessful.");
		}
		
		driver.findElement(By.name("submitButton")).click();
		
		String nameDuplicate = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if(createdLeadName.equals(nameDuplicate)) {
			System.out.println("Duplicating is successfull");
		}
		else {
			System.out.println("Duplicating is unsuccessfull");
		}
		
		
	}

}

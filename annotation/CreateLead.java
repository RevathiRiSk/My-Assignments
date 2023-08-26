package annotation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {

	@Test
	public void runCreate() {
		
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vengataraman");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Revathi");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I like to purse this course.");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revms16@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
	}

}

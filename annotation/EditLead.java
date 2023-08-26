package annotation;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{

	@Test
	public void runEdit() throws InterruptedException {
		
		
		
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
		
		
	}

}

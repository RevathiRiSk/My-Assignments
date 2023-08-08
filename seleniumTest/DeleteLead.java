package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneAreaCode")).sendKeys("669");
		
		driver.findElement(By.name("phoneNumber")).sendKeys("2167799");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String createdLeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		System.out.println("Name of the First Resulting Lead : " +createdLeadId);
		
		driver.findElement(By.xpath("//a[text() = 'Revathi']")).click();
		
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys(createdLeadId);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String leadIdDelete = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		 
		if (createdLeadId == leadIdDelete)
			System.out.println("Match Found.Deleting is unsuccessfull.");
		else
			System.out.println("No match found. Deleting is successfull.");
		
		

	}

}

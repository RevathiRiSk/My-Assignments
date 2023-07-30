package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafAssign {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vengataraman");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Revathi");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I like to purse this course.");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revms16@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("Testing Assignments");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}

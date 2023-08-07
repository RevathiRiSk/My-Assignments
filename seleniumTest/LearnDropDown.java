package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demoSalesManager");
		
		
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
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("669");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2167799");
		
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDownS = new Select(source);
		dropDownS.selectByIndex(1);
		dropDownS.selectByValue("LEAD_EMPLOYEE");
		dropDownS.selectByVisibleText("Existing Customer");
		
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDownIn = new Select(industry);
		dropDownIn.selectByValue("IND_SOFTWARE");
		
		WebElement ownership  = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDownOwn = new Select(ownership);
		dropDownOwn.selectByVisibleText("Partnership");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}

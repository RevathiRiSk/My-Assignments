package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Revathi");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Mohan");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Revathi");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Mohan");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("For Testing Purpose");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("revms16@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDownState = new Select(state);
		dropDownState.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Need to test this scenario");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}

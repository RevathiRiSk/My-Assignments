package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Revathi");
		
		driver.findElement(By.name("lastname")).sendKeys("Mohan");
		
		driver.findElement(By.name("reg_email__")).sendKeys("abcsde@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Sebdjbdjf");
		
		WebElement date = driver.findElement(By.id("day"));
		Select dropdownD = new Select(date);
		dropdownD.selectByIndex(22);
		
		WebElement month = driver.findElement(By.id("month"));
		Select dropdownM = new Select(month);
		dropdownM.selectByVisibleText("May");
		
		WebElement year = driver.findElement(By.id("year"));
		Select dropdownY = new Select(year);
		dropdownY.selectByValue("1994");
		
		driver.findElement(By.name("sex")).click();
		
		
		
		

	}

}

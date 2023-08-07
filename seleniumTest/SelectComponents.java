package seleniumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectComponents {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select dropDown = new Select(tool);
		List<WebElement> options = dropDown.getOptions();
		
		for(int i=0; i <options.size(); i++) {
			Thread.sleep(2000);
			if(i==2 || i==4) {
			options.get(i).click();
			
		}
		

	}
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		
		driver.findElement(By.xpath("//li[@data-label='USA']")).click();
		
		//driver.findElement(By.xpath("//label[text()='Select City']")).click();
		
		driver.findElement(By.xpath("//button[@role='button']")).click();
		
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
		
		
		
		
		
		
		
	}
}
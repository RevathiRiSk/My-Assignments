package seleniumTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		WebElement triClick = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState' and @class='ui-chkbox ui-widget'] "));
		triClick.click();
		triClick.click();
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		boolean checkBox = driver.findElement(By.xpath("(//div[contains(@class,'selectbooleancheckbox')])[3]//input")).isEnabled();
		
		if(checkBox == false)
			System.out.println("The CheckBox is Disabled");
		else
			System.out.println("The CheckBox is Enabled");

		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//li[contains(@class,'selectcheckboxmenu')]/label[contains (text(),'Miami')]")).click();
		driver.findElement(By.xpath("//li[contains(@class,'selectcheckboxmenu')]/label[contains (text(),'Paris')]")).click();
			
		
	}

		
		
}

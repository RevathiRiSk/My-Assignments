package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputComponent {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Revathi");
		
		driver.findElement(By.xpath("(//div[@class='col-12'])[2]/input")).sendKeys(" - INDIA");
		
		boolean textBox = driver.findElement(By.xpath("(//div[@class='col-12'])[3]/input")).isEnabled();
		if(textBox == false)
			System.out.println("The text box is disabled");
		else
			System.out.println("The text box is enabled");
		
		driver.findElement(By.xpath("(//div[@class='col-12'])[4]/input")).clear();
		
		WebElement retrieveText = driver.findElement(By.xpath("(//div[@class='col-12'])[5]/input"));
		retrieveText.clear();
		retrieveText.sendKeys("Can you clear me,please?");
		
		WebElement email = driver.findElement(By.xpath("(//div[@class='col-12'])[6]/input"));
		email.sendKeys("revms16@gmail.com");
		
		
		
		driver.findElement(By.xpath("(//div[@class='col-12'])[7]/input")).sendKeys("I'm new to SoftwareTesting");
		
		
		
	}

}

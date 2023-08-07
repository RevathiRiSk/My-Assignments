package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		String pageTitle = "Dashboard";
		
		if(title.contains(pageTitle))
			System.out.println("Page Title is Same");
		else
			System.out.println("Page Title is Different");
		
		driver.navigate().back();
		
		boolean button = driver.findElement(By.xpath("(//div[@class='card'])[2]/button")).isEnabled();
		if (button == false)
			System.out.println("The Button is disabled");
		else
			System.out.println("The Button is enabled");
		
		
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		System.out.println("Location : " +location);
		
		String color = driver.findElement(By.xpath("(//div[@class='card'])[4]/button")).getCssValue("background-color");
		System.out.println("Color : " +color);
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Size : " +size);

		driver.findElement(By.xpath("//div[@class='col-6']/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='col-6']/button")).click();
				
		
		String bgColor = driver.findElement(By.xpath("//span[text()='Success']")).getCssValue("background-color");
		System.out.println("BG Color : " +bgColor);
	}

}

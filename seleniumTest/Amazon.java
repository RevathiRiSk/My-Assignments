package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//div[@class='two-pane-results-container']//div[@aria-label='bags for boys']")).click();
			
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span")).getText();
		System.out.println("Total number of results: " +result);
		
		driver.findElement(By.xpath("//li[@aria-label='Skybags']//i[@class='a-icon a-icon-checkbox']")).click();
		
		driver.findElement(By.xpath("//li[@aria-label='Safari']//i[@class='a-icon a-icon-checkbox']")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button-inner']/span")).click();
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(400);
		
		String firstLink = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		System.out.println("The first result: " +firstLink);
		
		String price = driver.findElement(By.xpath("//div[@class='a-row a-size-base a-color-base']")).getText();
		System.out.println("The price result: " +price);
		
		String title = driver.getTitle();
		System.out.println("The title of the page : " +title);
		
		driver.close();
		
	}

}

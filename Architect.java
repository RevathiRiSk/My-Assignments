package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Architect {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//Login with username as
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();

		//Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		//String mainWindow = driver.getWindowHandle();
		Set<String>  window1 = driver.getWindowHandles();
		List<String> redirect = new ArrayList<>(window1);
		driver.switchTo().window(redirect.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		
		//Click  On Learning
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span [text()='Learning']").click();

		//And mouse hover on Learning On Trailhead
		Actions act = new Actions(driver);
		WebElement learning = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(learning).perform();
		
		//Click on Salesforce Certifications
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		//Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		
		//Get the Text(Summary) of Salesforce Architect 
		System.out.println("Summary of Saleforce Architect");
		WebElement summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text')]"));
		System.out.println(summary.getText());
		
		//Get the List of Salesforce Architect Certifications Available
		List<WebElement> certifications = driver.findElements(By.xpath("(//div[@class='credentials-card_title'])/a"));
		for(WebElement list : certifications) {
			System.out.println("List of Salesforce Architect Certifications");
			System.out.println(list.getText());
		}
		
		//Click on Application Architect
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		//Get the List of Certifications available
		List<WebElement> certification2 = driver.findElements(By.xpath("(//div[@class='credentials-card_title'])/a"));
		for(WebElement list2 : certification2) {
			System.out.println("List of Certifications Available are :");
			System.out.println(list2.getText());
			
		}
		
		//Take a Snapshot of Certifications.
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("./snap/pic.jpg"));
		
	}

}

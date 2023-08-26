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


public class Administration {

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
		//Click Learning 
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span [text()='Learning']").click();
		
		//And mouse hover on Learning On Trailhead
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Learning on Trailhead']")));
		Actions act = new Actions(driver);
		WebElement learning = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(learning).perform();
		
		//Clilck on Salesforce Certifications
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Salesforce Certification']")));
		shadow.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		//Click on first resulting Ceritificate
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		
		//verify - Administrator Overview page
		String title = driver.getTitle();
		if(title.contains("Administrator")) {
			System.out.println("Administrator Overview Page title matches");
		}
		else {
			System.out.println("Page title dosn't match");
		}
		
		//Print the Certifications available for Administrator Certifications (List)
		List<WebElement> certifications = driver.findElements(By.xpath("(//div[@class ='trailMix-card-body_title'])/a"));
		System.out.println("List of Administrator Certifications");
		for(WebElement list : certifications) {
			System.out.println("\t"+ list.getText());			
		}
		
		//Take a Snapshot of Certifications
		File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("./snap/pic.jpg"));
	}

}

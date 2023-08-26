package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.sukgu.Shadow;

public class oderingMobile {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev167219.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Mohanrevathi1!");
		driver.findElement(By.id("sysverb_login")).click();
		
		//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		wait.until(ExpectedConditions.elementToBeClickable(shadow.findElementByXPath("//div[text()='All']"))).click();
		shadow.findElementByXPath("//div[text()='All']");
		wait.until(ExpectedConditions.elementToBeClickable(shadow.findElementByXPath("//input[@id='filter']")));
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		wait.until(ExpectedConditions.elementToBeClickable(shadow.findElementByXPath("//mark[text()='Service Catalog']")));
		shadow.findElementByXPath("//mark[text()='Service Catalog']").click();
		
		//Click on  mobiles
		WebElement frameMobile = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameMobile);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Mobiles']")));
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//Select Apple iPhone 13 Pro
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//strong[text()='Apple iPhone 13 pro']/ancestor::a")));
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']/ancestor::a")).click();
		
		
		//Choose yes in lost or broken iphone. And enter original phNo as 99
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Yes']")));
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		driver.findElement(By.xpath("//span[text()='What was the original phone number?']/following::input[2]")).sendKeys("99");
		
		//choose monthly data allowance as unlimited
		WebElement monthlyData = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select data = new Select(monthlyData);
		data.selectByVisibleText("Unlimited [add $4.00]");
		
		//Update color field to Sierra Blue and storage field to 512GB
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
		
		//Click on Order now option
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		//Verify order is placed and copy the request number"
		String order = driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
		if(order.contains("Thank you, your request has been submitted")) {
			System.out.println("Order has been placed - Success");
		}
		else {
			System.out.println("Order is not placed - Failed");
		}
		
		String number = driver.findElement(By.id("requesturl")).getText();
		System.out.println("Request Number: " + number);
		
		//Take a Snapshot of order placed page.
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("./snap/pic.jpg"));
	}

}

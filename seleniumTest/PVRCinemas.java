package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='city-thumbnail']//span[text()='Chennai']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		WebElement dropdown_genre = driver.findElement(By.name("genre"));
		Select genre = new Select(dropdown_genre);
		genre.selectByVisibleText("ANIMATION");
		
		
		Select dropdown_lang = new Select(driver.findElement(By.name("lang")));
		dropdown_lang.selectByIndex(1);
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[contains (@class,'movie-wrapper')])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(4000);
		
		Select dropdown_cinema = new Select(driver.findElement(By.name("cinemaName")));
		dropdown_cinema.selectByValue("PVR Velachery Chennai");
		
		Select dropdown_timing = new Select(driver.findElement(By.name("timings")));
		dropdown_timing.selectByIndex(3);
		
		driver.findElement(By.name("noOfTickets")).sendKeys("4");
		
		driver.findElement(By.name("name")).sendKeys("Revathi");
		
		driver.findElement(By.name("email")).sendKeys("revms16@gmail.com");
		
		Select dropdown_food=new Select(driver.findElement(By.name("food")));
		dropdown_food.selectByVisibleText("No");
		
		driver.findElement(By.name("mobile")).sendKeys("1234567897");
		
		driver.findElement(By.name("comment")).sendKeys("N/A");
		
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='×']")).click();
		
		System.out.println("The title of the page : " +driver.getTitle());
		
		

	}

}

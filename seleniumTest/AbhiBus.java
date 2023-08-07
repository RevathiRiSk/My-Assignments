package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("pills-home-tab")).click();
		
		driver.findElement(By.id("source")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		driver.findElement(By.id("datepicker1")).click();
		
		driver.findElement(By.xpath("//a[text()='5']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		String firstBus = driver.findElement(By.xpath("//div[@class='search-column1']/h2")).getText();
		
		System.out.println("The First Bus Is : " +firstBus);
		
		driver.findElement(By.xpath("//li[@id='bustypeSLEEPER']")).click();
		
		String seat = driver.findElement(By.xpath("//div[@class='search-column2-col1']/p")).getText();
		
		System.out.println("Seat Availability: " + seat);
		
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		
		driver.findElement(By.xpath("(//li[@class='fare_filter_599 sleeper available']/a)[3]")).click();
		
		String seatNo = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println("SeatSelected No : " +seatNo);
		
		String fare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("TotalFare is : " +fare);
		
		driver.findElement(By.id("boardingpoint_id")).click();
		
		driver.findElement(By.xpath("//*[@id=\"boardingpoint_id\"]/option[10]")).click();
		
		driver.findElement(By.id("droppingpoint_id")).click();
		
		driver.findElement(By.xpath("//*[@id=\"droppingpoint_id\"]/option[3]")).click();
		
		String title = driver.getTitle();
		System.out.println("The title of the page: " +title);
		
		driver.close();
	}

}

package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement fromStation = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
//		action.keyDown(fromStation,Keys.SHIFT).sendKeys("Chennai",Keys.TAB).build().perform();
		
		fromStation.sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		Thread.sleep(2000);
		WebElement toStation=driver.findElement(By.xpath("//input[@placeholder='To Station']"));
//		action.keyDown(toStation,Keys.SHIFT).sendKeys("Bangalore",Keys.TAB).build().perform();
		toStation.sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Tomorrow")).click();
		Thread.sleep(2000);
		String firstBus = driver.findElement(By.xpath("(//h5[contains(text(),'Orange Tours')])[1]")).getText();
		System.out.println("The first bus displayed in the list " + firstBus);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		String seatsCount = driver.findElement(By.xpath("(//button[text()='Show Seats']//following::small)[1]")).getText();
		System.out.println("The number of seats available in this bus are "+ seatsCount);
		//click show seats
		driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='U3']")).click();
		//click boarding point
		driver.findElement(By.xpath("(//p[contains(text(),'sholinganallur')])[1]")).click();
		//click destination point
		driver.findElement(By.xpath("(//p[contains(text(),'Hosur')])[1]")).click();
		String selectSeat = driver.findElement(By.xpath("(//div[@id='seating-selected-seat-details']//span)[2]")).getText();
		System.out.println("The selected seat is " + selectSeat);
		String busFare = driver.findElement(By.xpath("(//div[@id='seating-selected-seat-details']//span)[4]")).getText();
		System.out.println("Bus fare is "+busFare);
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the page is "+ titleOfThePage);
		driver.close();
		
		
		
		

	}

}

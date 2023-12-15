package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("search-cities")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//img[@alt='Hyderabad']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(5000);
		WebElement genreSelect = driver.findElement(By.name("genre"));
		Select selGenre = new Select(genreSelect);
		selGenre.selectByVisibleText("ANIMATION");
		WebElement langSelect = driver.findElement(By.name("lang"));
		Select selLang = new Select(langSelect);
		selLang.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='movie-list']//div[contains(text(),'English')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cinemaSelect = driver.findElement(By.id("cinemaName"));
		Select selCinema = new Select(cinemaSelect);
		selCinema.selectByIndex(1);
		driver.findElement(By.xpath("(//input[@class='ng-untouched ng-pristine ng-valid'])[1]")).sendKeys("21-12-2023");
		WebElement timeSelect = driver.findElement(By.name("timings"));
		Select selTime = new Select(timeSelect);
		selTime.selectByIndex(0);
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.name("name")).sendKeys("Sruthi");
		driver.findElement(By.name("email")).sendKeys("Sruthir91@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("8769876789");
		WebElement foodSelect = driver.findElement(By.name("food"));
		Select selFood = new Select(foodSelect);
		selFood.selectByIndex(0);
		driver.findElement(By.name("comment")).sendKeys("na");
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[@class='btn already-member' and text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Page title is " + pageTitle);
		
	}

}

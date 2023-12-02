package Selenium_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// https://www.nykaa.com/-> Search box using (name) attribute
		driver.get("https://www.nykaa.com");
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("beauty");
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.quit();
		//https://www.air.irctc.co.in/->Goto contact as for email write Partial attribute based xpath
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.air.irctc.co.in");
//		WebElement contactUs = driver.findElement(By.id("dropdown10"));
//		Select sel = new Select(contactUs);
//		sel.
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.partialLinkText("@irctc.co.in")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//https://www.swiggy.com/-> Text based (food button)
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("location")).sendKeys("500013");
		driver.findElement(By.xpath("//span[text()='FIND FOOD']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//https://buythevalue.in/-> write xpath for KITCHEN & APPLIANCES Text based (partial)
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://buythevalue.in/");
		driver.findElement(By.xpath("//a//span[contains(text(),'KITCHEN')]")).click();
		driver.quit();
		
		
	}

}

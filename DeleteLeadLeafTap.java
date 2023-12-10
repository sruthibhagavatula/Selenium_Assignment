package Selenium_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadLeafTap {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Find by']//following::label[text()='Phone Number:']//following::input[@name='phoneNumber']")).sendKeys("96427");
		driver.findElement(By.xpath("//span[text()='Find by']//following::label[text()='Phone Number:']//following::input[@name='phoneNumber']//following::button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String firstCellValue = driver.findElement(By.xpath("//span[text()='Lead List']//following::table//..//..//following::tbody//td[1]//a")).getText();
		System.out.println(firstCellValue);
	}
		
}


			   
			
		

	



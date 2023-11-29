package Selenium_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("firstname")).sendKeys("Testfirstname");
		driver.findElement(By.name("lastname")).sendKeys("testlastname");
		driver.findElement(By.name("reg_email__")).sendKeys("testemail@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test@123");
		driver.findElement(By.name("websubmit")).click();

	}

}

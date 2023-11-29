package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafTaps_CreateLead {

	public static void main(String[] args) {
//		EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sruthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("bhagavatula");
		driver.findElement(By.name("submitButton")).click();

		driver.close();
	}

}

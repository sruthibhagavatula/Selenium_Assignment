package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

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
		WebElement source=  driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel = new Select(source);
		sel.selectByIndex(3);
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel1 = new Select(marketing);
		sel1.selectByVisibleText("Automobile");
	
		
		
		driver.findElement(By.name("submitButton")).click();

		System.out.println(driver.getTitle());
		
	}
	

}

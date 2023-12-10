package Selenium_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadLeafTaps {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//span[text()='Company Name']//parent::td//following-sibling::td//input[@name='companyName']")).sendKeys("Testing");
		driver.findElement(By.xpath("//span[text()='First name']//parent::td//following-sibling::td//input[@name='firstName']")).sendKeys("Sruthi");
		driver.findElement(By.xpath("//span[text()='Last name']//parent::td//following-sibling::td//input[@name='lastName']")).sendKeys("bhagavatula");
		driver.findElement(By.xpath("//span[text()='First Name (Local)']//parent::td//following-sibling::td//input[@name='firstNameLocal']")).sendKeys("SruthiLocal");
		driver.findElement(By.name("departmentName")).sendKeys("departmentName");
		driver.findElement(By.xpath("//span[text()='Description']//parent::td//following-sibling::td//textarea[@name='description']")).sendKeys("description");
		driver.findElement(By.xpath("//span[text()='E-Mail Address']//parent::td//following-sibling::td//input[@name='primaryEmail']")).sendKeys("emailid@gmail.com");
		WebElement select = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel = new Select(select);
		sel.selectByVisibleText("Florida");
		driver.findElement(By.name("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//span[text()='Description']//parent::td//following-sibling::td//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//span[text()='Important Note']//parent::td//following-sibling::td//textarea[@name='importantNote']")).sendKeys("important note");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("title of the page is "+ title);
		driver.close();

	}

}

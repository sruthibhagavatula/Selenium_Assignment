package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
	driver.findElement(By.xpath("(//div[@class='s-suggestion-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();
	String resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[contains(text(),'over')]")).getText();
	System.out.println("Total results displayed are " + resultText);
	driver.findElement(By.xpath("(//span[contains(@data-csa-c-content-id,'p_89')])[1]")).click();
	driver.findElement(By.xpath("(//span[contains(@data-csa-c-content-id,'p_89')])[2]")).click();
	WebElement sortSelect = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
	Select selSort = new Select(sortSelect);
	selSort.selectByVisibleText("Newest Arrivals");
	String firstResultName = driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1']//span)[1]")).getText();
	System.out.println("First result bag name is " + firstResultName);
	String discountedPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	System.out.println("The discounted price is " + discountedPrice);
	String pageTitle = driver.getTitle();
	System.out.println("The page title is " + pageTitle);
//	driver.close();

	}

}

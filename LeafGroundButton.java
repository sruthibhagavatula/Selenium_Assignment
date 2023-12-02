package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafGroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm title')]//following::span[text()='Click']")).click();
		String confirmTitle = driver.getTitle();
		System.out.println("Confim title dashboard title is :" + confirmTitle);
		driver.navigate().back();
		boolean confirmDisabled = driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]//following::span[text()='Disabled']")).isEnabled();
		if(confirmDisabled==false)
		{
			System.out.println("Button is disabled " + confirmDisabled);
		}
		else
			System.out.println("Button is enabled ");

		Point locationText = driver.findElement(By.xpath("//h5[contains(text(),'Find the position')]//following::span[text()='Submit']")).getLocation();
		System.out.println("location of the text is " +locationText);
		String cssColor = driver.findElement(By.xpath("//h5[contains(text(),'Find the Save')]//following::span[text()='Save']")).getCssValue("color");
		System.out.println("color of the button is " +cssColor);
		String hex = Color.fromString(cssColor).asHex();
		System.out.println(hex);
		Dimension heightAndWidth = driver.findElement(By.xpath("//h5[contains(text(),'Find the height')]//following::span[text()='Submit']")).getSize();
		System.out.println("height and width of the button " + heightAndWidth);
		driver.close();
	}

}

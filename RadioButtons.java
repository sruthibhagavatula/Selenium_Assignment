package Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();		
		boolean buttonIsSelected = driver.findElement(By.xpath("//label[text()='Chennai']")).isSelected();
		if(buttonIsSelected==true)
		{
			System.out.println("the button is deselected " +buttonIsSelected);
		}
		else
			System.out.println("the button is selected");
		
		boolean chromIsSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Chrome']"))).isSelected();
		boolean firefoxIsSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Firefox']"))).isSelected();
		boolean safariIsSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Safari']"))).isSelected();
		boolean edgeIsSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Edge']"))).isSelected();
		if(chromIsSelected==true)
		{
			System.out.println("By default chrome is selected");
		}
		else if(firefoxIsSelected==true)
		{
			System.out.println("By default firefox is selected");
		}
		else if(safariIsSelected==true)
		{
			System.out.println("By default safari is selected");
		}
		else if(edgeIsSelected==true)
		{
			System.out.println("By default edge is selected");
		}
		
		boolean years1to20 = driver.findElement(By.xpath("//label[text()='1-20 Years']")).isSelected();
		boolean years21to40 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		boolean years41to60 = driver.findElement(By.xpath("//label[text()='41-60 Years']")).isSelected();
		if(years1to20 == true)
		{
			System.out.println("1 - 20 years is already selected");
		}
		else if (years1to20 == false)
		{
			driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
			System.out.println("1 - 20 clicked now");
		}
		if(years21to40==true)
		{
			System.out.println("21 - 40 years is already selected");
		}
		else if(years21to40==false)
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
			System.out.println("21-40 clicked now");
		}
		if(years41to60 == true)
		{
			System.out.println("41 - 60 years is already selected");
		}
		else if(years41to60 == false)
		{
			driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
			System.out.println("41 -60 clicked now");
		}
			
		driver.close();
	}
		

}

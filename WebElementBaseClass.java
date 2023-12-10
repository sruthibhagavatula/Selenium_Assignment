package Selenium_Assignment;

public class WebElementBaseClass {
	
	public void click() {
		System.out.println("This method is used to click");
	}
	
	public String setText(String text)
	{
		System.out.println("this method is used to set the text and it returns the string text" + text);
		return text;
	}

}

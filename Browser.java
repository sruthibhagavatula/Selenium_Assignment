package Selenium_Assignment;

import week1.day1.Chrome;

/*Assignment 1: 

Goal: To understand the class, main method and sysout

a) Create a class by name: Browser
b) Create a main method using shortcut
c) print a statement --> "This is my Browser"
d) run and confirm the printed in console*/

public class Browser {
	public static void main(String[] args) {
		System.out.println("This is my browser");
		
		Chrome chrome = new Chrome();
		chrome.getName();
		chrome.printName();
	}

}

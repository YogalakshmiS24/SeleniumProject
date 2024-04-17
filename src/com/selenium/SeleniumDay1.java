package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://www.google.co.in/");
	System.out.println(driver.getTitle());
	
	
	}

}

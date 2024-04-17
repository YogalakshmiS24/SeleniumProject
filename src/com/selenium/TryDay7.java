package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryDay7 {
public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.jiomart.com/");
	driver.findElement((By.xpath("//input[@class='aa-Input search_input']"))).click();
	//driver.findElement((By.xpath("//a[text()='biscuits'][1]"))).click();
	driver.findElement((By.xpath("//a[@class='jm-btn secondary small jm-body-xs jm-fc-black']"))).click();
	
}
}

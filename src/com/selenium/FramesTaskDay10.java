package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTaskDay10 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/frame");
	driver.switchTo().frame("firstFr");
	//driver.switchTo().frame(0);
	driver.findElement(By.name("fname")).sendKeys("YogaLakshmi");
	

	
	WebElement element = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
	driver.switchTo().frame(element);
	
	driver.findElement(By.name("email")).sendKeys("yogalakshmi@gmail.com");
	
	driver.switchTo().parentFrame();
	driver.findElement(By.name("lname")).sendKeys("Swaminathan");
	
}
}

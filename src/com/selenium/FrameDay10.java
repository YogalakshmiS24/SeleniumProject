package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDay10 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("Yogalakshmi");
		
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_1']")).click();
		
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		driver.findElement(By.xpath("//a[text()='5']")).click();
		
		driver.findElement(By.id("RESULT_RadioButton-3")).click();
		driver.findElement(By.xpath("//option[@value='Radio-0']")).click();
		
		driver.findElement(By.id("FSsubmit")).click();
		
		driver.switchTo().defaultContent();

		driver.findElement(By.id("field2")).sendKeys("Hello");
		
	}
	

}
	
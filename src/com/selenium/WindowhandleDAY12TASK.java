package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandleDAY12TASK {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Realme 12",Keys.ENTER);

		driver.findElement(By.xpath("//div[text()='realme 12 Pro 5G (Navigator Beige, 128 GB)']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> in=new ArrayList<>(windowHandles);
		
		driver.switchTo().window(in.get(1));
		
		Actions s=new Actions(driver);
		

		WebElement a= driver.findElement(By.xpath("//div[@class='_2usHgU']"));
	    s.moveToElement(a).perform();

		
		WebElement element = driver.findElement(By.xpath("//iframe[@class='_1JqCrR']"));
		driver.switchTo().frame(element);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
		driver.switchTo().defaultContent();
	
	}

}

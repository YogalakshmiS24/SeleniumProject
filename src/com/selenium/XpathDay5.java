package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDay5 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		

	   
	    
	    
	driver.get("https://www.myntra.com/");
	driver.findElement((By.xpath("//input[@class='desktop-searchBar']"))).sendKeys("Kurti");
	driver.findElement((By.xpath("//a[@class='desktop-submit']"))).click();
	
   List<WebElement> elements = driver.findElements(By.xpath("//div[@class='search-searchProductsContainer row-base']"));
   for (WebElement webElement : elements) {
	   System.out.println(webElement.getText());
	
}
	
	}
	  
	
}
	


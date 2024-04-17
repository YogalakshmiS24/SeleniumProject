package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDay11 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://testautomationpractice.blogspot.com/");
//		
//		WebElement element = driver.findElement(By.id("male"));
	Actions s=new Actions(driver);
//		s.click(element).perform();
//		WebElement element2 = driver.findElement(By.xpath("//button[text()='Copy Text']"));
//		s.doubleClick(element2).build().perform();
//		WebElement src = driver.findElement(By.id("draggable"));
//		WebElement des = driver.findElement(By.id("droppable"));
//		s.dragAndDrop(src, des).perform();
//		
//		driver.get("https://www.flipkart.com/");
//		WebElement element3 = driver.findElement(By.xpath("//span[text()='Electronics']"));
//		s.moveToElement(element3).perform();
//		Thread.sleep(2000);
//		s.contextClick(element3).perform();
//	
	Robot r= new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//	
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);

		driver.get("https://www.jiomart.com/?gad_source=1&gclid=Cj0KCQjwncWvBhD_ARIsAEb2HW-pFv0mVGQIalU163aeNqNk1wobBaqMOhAbc-cDPwMS6eiSGQlEw-IaAskGEALw_wcB");
		WebElement element4 = driver.findElement(By.id("autocomplete-0-input"));
		//element4.sendKeys("biscuit",Keys.ENTER);
		s.click(element4).perform();
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		r.delay(1000);
		
		
		}

}

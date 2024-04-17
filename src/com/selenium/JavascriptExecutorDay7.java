package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDay7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		driver.get("https://www.confirmtkt.com/");
		Thread.sleep(2000);
		WebElement view=driver.findElement(By.linkText("Investor Relations"));
        js.executeScript("arguments[0].scrollIntoView();",view);
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,0)");
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,1000)");
        Thread.sleep(2000);
        js.executeScript("window.scroll(0,-500)");
        
        driver.get("https://www.confirmtkt.com/rbooking-d/");
      
    	WebElement clicklogin = driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiListItemText-primary jss3 MuiTypography-body1 MuiTypography-displayBlock']"));
    	js.executeScript("arguments[0].click();", clicklogin);
    	Thread.sleep(2000);
    	WebElement enternum = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart']"));
    	js.executeScript("arguments[0].value='9840916827';", enternum);	
    	Thread.sleep(2000);
    	WebElement otp = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
     	js.executeScript("arguments[0].click();", otp);
     	
     	
     	Dimension size = driver.manage().window().getSize();
     	System.out.println(size);
	}

}

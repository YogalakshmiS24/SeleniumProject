package com.selenium;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdrivermethodDay2 {
 public static void main(String[] args) throws InterruptedException {
	 System.getProperty("webdriver.chrome.driver",
      "C:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
	
	    WebDriver driver=new ChromeDriver();	
	
        driver.manage().window().maximize();
        
		driver.get("https://msec.edu.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		 
	    String pageSource = driver.getPageSource();
	    System.out.println(pageSource);
	    
		Thread.sleep(50);
		driver.navigate().to("https://www.iitm.ac.in/");
		
		Thread.sleep(50);
		driver.navigate().back();
		
		Thread.sleep(50);
		driver.navigate().forward();
	
		Thread.sleep(50);
		driver.navigate().refresh();
	
		Thread.sleep(10);
   	 	driver.quit();
   	  	
   	 
}  
}

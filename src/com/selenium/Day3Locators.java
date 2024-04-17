package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Locators {
public static void main(String[] args) throws InterruptedException {
	
	System.getProperty("webdriver.chrome.driver","D:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");

	WebElement element = driver.findElement(By.name("q")); //with name
    element.sendKeys("Samsung 5g");
    
    WebElement e1=driver.findElement(By.linkText("Login"));  //linked Text
    e1.click();
 
    driver.get("https://www.firstcry.com/?ref=SEM_!GSN_Brand_FirstCry_India!&gad_source=1&gclid=CjwKCAiAopuvBhBCEiwAm8jaMSFvJQt88uGR9-KSUR2ihJ9dW6JwSwvXij-IpunMKZ6aWzmGs69dqxoCkasQAvD_BwE");	
   
    WebElement element2 = driver.findElement(By.id("search_box")); //with ID
    element2.click();
    Thread.sleep(200);
    element2.sendKeys("footwear");
    Thread.sleep(200);
   
    WebElement element3 = driver.findElement(By.className("search-button")); //Class name
    element3.click();
    Thread.sleep(200);
    
    driver.get("https://www.jiomart.com/?gad_source=1&gclid=CjwKCAiAxaCvBhBaEiwAvsLmWFbLPYZnfEbgTTNbEpyVXXClWbPqQKI7rP2cfCG6M1zizWzYL2IptRoCEocQAvD_BwE");

    driver.findElement(By.partialLinkText("Fruits")).click();   //partial linked text
    
    driver.findElement(By.tagName("button")).click();  // Tag name





    
    
}
}

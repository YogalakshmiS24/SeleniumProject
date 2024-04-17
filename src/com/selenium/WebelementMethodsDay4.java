package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementMethodsDay4 {
public static void main(String[] args) throws InterruptedException {
	System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=11054773349079838290&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
	
	WebElement text= driver.findElement(By.linkText("Mobiles"));
    System.out.println(text.getText());
    
     WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
    System.out.println(element.getText());
    boolean displayed = element.isDisplayed();
    System.out.println(displayed);
    
    driver.get("https://www.firstcry.com/?ref=SEM_!GSN_Brand_FirstCry_India!&gad_source=1&gclid=CjwKCAiAopuvBhBCEiwAm8jaMSFvJQt88uGR9-KSUR2ihJ9dW6JwSwvXij-IpunMKZ6aWzmGs69dqxoCkasQAvD_BwE");	
    WebElement element2 = driver.findElement(By.id("search_box"));

    element2.click();
 

    element2.sendKeys("footwear");
    Thread.sleep(3000);
    element2.clear();
    
    System.out.println(element2.getAttribute("search_box"));
}
}

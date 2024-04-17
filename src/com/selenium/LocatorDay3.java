package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorDay3 {
public static void main(String[] args) throws InterruptedException {
	System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("Samsung 5g");
    
//   WebElement e14=driver.findElement(By.className("L0Z3Pu"));
//   e14.click();
    
    WebElement e1=driver.findElement(By.linkText("Login"));
    e1.click();

//	driver.get("https://www.youtube.com/");
//	WebElement e = driver.findElement(By.name("search_query"));
//	e.sendKeys("Music");
//	
//	WebElement e2 = driver.findElement(By.id("search-icon-legacy"));
//	e2.click();

	
driver.get("https://www.firstcry.com/?ref=SEM_!GSN_Brand_FirstCry_India!&gad_source=1&gclid=CjwKCAiAopuvBhBCEiwAm8jaMSFvJQt88uGR9-KSUR2ihJ9dW6JwSwvXij-IpunMKZ6aWzmGs69dqxoCkasQAvD_BwE");	
WebElement element2 = driver.findElement(By.id("search_box"));

element2.click();

Thread.sleep(200);

element2.sendKeys("footwear");
System.out.println(element2.getText());

boolean displayed = element2.isDisplayed();
System.out.println(displayed);

boolean enabled = element2.isEnabled();
System.out.println(enabled);

boolean selected = element2.isSelected();
System.out.println(selected); //false

WebElement element3 = driver.findElement(By.className("search-button"));
element3.click();

driver.get("https://formfacade.com/website/google-forms-question-types-checkboxes-multi-select.html");
WebElement element4 = driver.findElement(By.id("entry.1587519277.Motorcycle/Scooter"));

element4.click();

boolean selected2 = element4.isSelected();
System.out.println(selected2);  //true











}
}

package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4WebelementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","D:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAiAxaCvBhBaEiwAvsLmWFrHT8SPqUuamjH-VriImwh-a8ZElXwIMH-bnNTVxTQcuqSxQn_hkxoCHUYQAvD_BwE");
		WebElement element = driver.findElement(By.name("searchVal"));
		element.sendKeys("Sneakers");    //Send keys
		
		System.out.println(element.getAttribute("name"));  //getAttribute   A.name pass = return A-value
          
	    driver.findElement(By.className("ic-search")).click();   //click

		WebElement element2 = driver.findElement(By.linkText("MEN"));
		System.out.println(element2.getText());     // getText
		
		boolean displayed = element2.isDisplayed();   // isDisplayed();
		System.out.println(displayed);

		boolean enabled = element2.isEnabled();        //isEnabled()
		System.out.println(enabled);

		boolean selected = element2.isSelected();      //isSelected
		System.out.println(selected);      //false

		driver.get("https://formfacade.com/website/google-forms-question-types-checkboxes-multi-select.html");
		WebElement element4 = driver.findElement(By.id("entry.1587519277.Motorcycle/Scooter"));
		element4.click();
		boolean selected2 = element4.isSelected();
		System.out.println(selected2);   //true
 
	    driver.get("https://www.firstcry.com/?ref=SEM_!GSN_Brand_FirstCry_India!&gad_source=1&gclid=CjwKCAiAopuvBhBCEiwAm8jaMSFvJQt88uGR9-KSUR2ihJ9dW6JwSwvXij-IpunMKZ6aWzmGs69dqxoCkasQAvD_BwE");	
	    WebElement element5 = driver.findElement(By.id("search_box"));
	    element5.click();
	    element5.sendKeys("footwear");
	    Thread.sleep(3000);
	    element5.clear();

}}

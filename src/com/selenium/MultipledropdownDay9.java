package com.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipledropdownDay9 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement element = driver.findElement(By.id("colors"));
	Select s= new Select(element);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	s.selectByIndex(4);
	Thread.sleep(3000);
	s.selectByValue("green");
	Thread.sleep(3000);
	s.selectByVisibleText("Blue");
	Thread.sleep(3000);
	
	List<WebElement> options = s.getOptions();
	for (WebElement ss : options) {
		System.out.println("OPTIONS---"+ss.getText());
	}
	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (WebElement webElement : allSelectedOptions) {
		System.out.println("SELECTED VALUES---"+webElement.getText());
	}
	WebElement f = s.getFirstSelectedOption();
	System.out.println("1ST SELECTED VALUE---"+f.getText());
	Thread.sleep(3000);
	s.deselectByIndex(2);
	Thread.sleep(3000);
	s.deselectByValue("blue");
	Thread.sleep(3000);
	s.deselectByVisibleText("White");
	
	s.selectByValue("red");
	s.selectByVisibleText("Yellow");
	Thread.sleep(3000);
	s.deselectAll();
	
}}

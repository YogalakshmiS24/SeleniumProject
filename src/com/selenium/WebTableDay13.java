package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDay13 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/table");
	List<WebElement> elements = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
	for (WebElement webElement : elements) {
		System.out.println(webElement.getText());
	}
	System.out.println();
	
	List<WebElement> elements2 = driver.findElements(By.xpath("(//table)[2]/tbody/tr[2]/td"));
	for (WebElement webElement : elements2) {
		System.out.println(webElement.getText());
	}
	
	List<WebElement> elements3 = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[3]"));
	for (WebElement webElement : elements3) {
		System.out.println(webElement.getText());
	}
	WebElement element = driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[2]"));
	System.out.println(element.getText());
	
	List<WebElement> elements4 = driver.findElements(By.xpath("(//thead)[3]"));
	for (WebElement webElement : elements4) {
		System.out.println(webElement.getText());
	}
}
}

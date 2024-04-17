package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtabletaskDay13 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://geographyfieldwork.com/WorldCapitalCities.htm");
		WebElement element = driver.findElement(By.xpath("((//table)[1]//tbody//tr[1]//td[2])[1]"));
		System.out.println(element.getText());
	}
	
}

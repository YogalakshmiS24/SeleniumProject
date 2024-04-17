package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowhandleDAY12 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=12384721151406833744&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles",Keys.ENTER);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.linkText("Redmi 12 5G Jade Black 6GB RAM 128GB ROM")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> in=new ArrayList<>(windowHandles);
			
		
		for (String t :in) {
				String title = driver.switchTo().window(t).getTitle();
				System.out.println(title);
			}
		System.out.println("total=" + in.size());
		
		driver.switchTo().window(in.get(1));
		
		WebElement element = driver.findElement(By.id("add-to-cart-button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		
		
	}

}

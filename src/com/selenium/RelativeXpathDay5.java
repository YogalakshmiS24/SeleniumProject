package com.selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathDay5 {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.name("q"));  //WEBDRIVER METHOD---findElement
	    element.sendKeys("Samsung 5g");
	    
	    WebElement element2 = driver.findElement(By.xpath("//button[@class='_2iLD__']")); //X-path Basic
	    element2.click();
	    
	    
	    driver.get("https://www.meesho.com/");
	    WebElement element3 = driver.findElement(By.xpath("//span[text()='Women Western']")); //X-path with Text
	    element3.click();
	    Thread.sleep(200);
	  
		driver.get("https://www.myntra.com/");
		driver.findElement((By.xpath("//input[@class='desktop-searchBar']"))).sendKeys("Kurti");  
		driver.findElement((By.xpath("//a[@class='desktop-submit']"))).click();
	    WebElement element4 = driver.findElement((By.xpath("//h3[@class='product-brand'][1]"))); //X-path with Index
		System.out.println("1st Kurti Name---"+ element4.getText());
		 
		driver.findElement((By.xpath("//input[@class='desktop-searchBar']"))).sendKeys("Kurti");  
		driver.findElement((By.xpath("//a[@class='desktop-submit']"))).click();
	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='search-searchProductsContainer row-base']"));
	    for (WebElement webElement : elements) {
		   System.out.println(webElement.getText());
		
	}
	    
	    
	   
}
	}



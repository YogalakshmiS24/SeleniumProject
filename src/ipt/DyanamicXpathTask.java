package ipt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DyanamicXpathTask {
	static WebDriver driver;
	static List<Integer> list=new  ArrayList<>();
	static Integer max;
	
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-sports-shoes");
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		for (WebElement webElement : elements) {
			String text = webElement.getText();
			String r = text.replaceAll("Rs. ","");
			int parseInt=Integer.parseInt(r);
			list.add(parseInt);
			
		}
	System.out.println(list);
	
	max=Collections.max(list);
	System.out.println(
max);
		WebElement prod = driver.findElement(By.xpath("//li[@class='product-base']//following::span[text()='"+max+"']//ancestor::div[@class='product-productMetaInfo']"));
		System.out.println("Product Details"+prod.getText());}

	public static void main(String[] args) {
		browserlaunch();
		
	}
}

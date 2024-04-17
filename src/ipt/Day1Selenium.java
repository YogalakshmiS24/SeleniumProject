package ipt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1Selenium {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+15+pro+max&crid=1VNWH7TW04C1Q&sprefix=ip%2Caps%2C298&ref=nb_sb_ss_ts-doa-p_1_2");
		WebElement element = driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//span[@class='a-price-whole']"));
	System.out.println(element.getText()); 
	}

}

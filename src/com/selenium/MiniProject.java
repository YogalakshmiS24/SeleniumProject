package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String text = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")).getText();
		driver.findElement(By.name("username")).sendKeys(text.substring(11));
		String text1= driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]")).getText();
		driver.findElement(By.name("password")).sendKeys(text1.substring(11));
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();	
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input'][1]")).click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		String text2 = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		e1.sendKeys(text2.substring(0,3));
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement element = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		element.click();
		element.sendKeys("Yogalakshmi");
		WebElement elements = driver.findElement(By.xpath("//input[@type='password']"));
		elements.click();
		elements.sendKeys("Yoga123@");
		
		WebElement e= driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
        e.sendKeys("Yoga123@");
        Thread.sleep(2000);
      WebElement save = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
      save.click();
      Thread.sleep(2000);
     // driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")).click();
      WebDriverWait wait =new WebDriverWait(driver,30);                 
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Users']")));
      
   //   driver.findElement(By.xpath("//a[text()='Users']")).click();           
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
      WebElement element2 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
      element2.sendKeys("Yogalakshmi");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash-fill oxd-button-icon']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
	}
}
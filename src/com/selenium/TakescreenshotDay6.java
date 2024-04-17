package com.selenium;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakescreenshotDay6 {
	public static void main(String[] args) throws IOException {
		System.getProperty("webdriver.chrome.driver","C:\\java program eclipse\\SeleniumProject\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bookswagon.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\java program eclipse\\SeleniumProject\\Screenshot\\bookswagon.png");
		FileUtils.copyFile(scr, des);
	}}
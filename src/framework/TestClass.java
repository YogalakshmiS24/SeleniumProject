package framework;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.w3c.dom.Text;
public class TestClass extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		 browserlaunch("chrome");
//		 launchUrl("https://www.jiomart.com/?gad_source=1&gclid=Cj0KCQjw5cOwBhCiARIsAJ5njubjE81Vs6rLC1wY2YO2mP9V6EyCmTxDzeRUUAs4eDGU98yI-iLWFQIaAmzMEALw_wcB");
//		
//		 passinput( driver.findElement(By.id("autocomplete-0-input")),("Biscuits"));
//		
//		robotkeypress(KeyEvent.VK_ENTER);
//		
//		implicitlywait(30, TimeUnit.SECONDS);
//		
//		jsclick(driver.findElement(By.xpath("(//button[@class='jm-btn small secondary full-width jm-body-s-bold addtocartbtn'])[1]")));		 
//		
//		navigateto("https://www.amazon.in/s?k=iphone+15+pro+max&crid=1VNWH7TW04C1Q&sprefix=ip%2Caps%2C298&ref=nb_sb_ss_ts-doa-p_1_2");
//		
//		 click(driver.findElement(By.linkText("Apple iPhone 15 (128 GB) - Black")));
//		 Thread.sleep(3000);
//		
//		 navigateback("");
//		 Thread.sleep(3000);
//		
//		 navigateforward("");
//		 Thread.sleep(3000);
//		 
//		 refresh();
//		 Thread.sleep(3000);
//		 pagesource();
//		 
//		 
//		 getcurrenturl();
//		 
//		 title();
//		 
//		 gettext(driver.findElement(By.linkText("Apple iPhone 15 (128 GB) - Black")));
//		 
//		 launchUrl("https://formfacade.com/website/google-forms-question-types-checkboxes-multi-select.html");
//		 click( driver.findElement(By.id("entry.1587519277.Motorcycle/Scooter")));
//		 isselected(driver.findElement(By.id("entry.1587519277.Motorcycle/Scooter")));
 
		   //driver.get("https://www.ajio.com/?gad_source=1&gclid=CjwKCAiAxaCvBhBaEiwAvsLmWFrHT8SPqUuamjH-VriImwh-a8ZElXwIMH-bnNTVxTQcuqSxQn_hkxoCHUYQAvD_BwE");
//			WebElement element = driver.findElement(By.name("searchVal"));
//			element.sendKeys("Sneakers");    //Send keys       
//		    driver.findElement(By.className("ic-search")).click();   //click
//isdisplayed( driver.findElement(By.linkText("MEN")));
//isenabled( driver.findElement(By.linkText("MEN")));
//	screenshot("D:\\java program eclipse\\SeleniumProject\\Screenshot\\ajjio.png");	
		 
//	scrollby(0, 1000);
//	Thread.sleep(3000);
//	scrollby(0, 0);
//	Thread.sleep(3000);
//	scrollby(0, 1000);
//	Thread.sleep(3000);
//	scrollby(0,-500);
//	Thread.sleep(3000);
		   
//launchUrl("https://www.confirmtkt.com/rbooking-d/");
//Thread.sleep(3000);
//jsclick(driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiListItemText-primary jss3 MuiTypography-body1 MuiTypography-displayBlock']")));
//Thread.sleep(3000);	
//jssend(driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedStart']")),"9840916827" );		 
//Thread.sleep(3000);		 
//
		 
//scrollintoview(driver.findElement(By.linkText("Career")));
//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//explicitlywait(30,By.className("username"));
//driver.findElement(By.name("username")).sendKeys("Admin");
//driver.findElement(By.name("password")).sendKeys("admin123");
//		 launchUrl("https://letcode.in/dropdowns");
//		 Thread.sleep(3000);
//		 selectbyindex(driver.findElement(By.id("fruits")), 1);
//		 Thread.sleep(3000);
//		 selectbyvalue(driver.findElement(By.id("fruits")), "2");
//		 Thread.sleep(3000);
//		 selectbyvisibletext(driver.findElement(By.id("fruits")), "Pine Apple");
//Thread.sleep(3000);
//		 launchUrl("https://testautomationpractice.blogspot.com/");
//		 ismultiple(driver.findElement(By.id("colors")));
//		 Thread.sleep(3000);
//		 selectbyindex(driver.findElement(By.id("colors")), 4);
//		 Thread.sleep(3000);
//		 selectbyvalue(driver.findElement(By.id("colors")), "green");
//		 Thread.sleep(3000);
//		 selectbyvisibletext(driver.findElement(By.id("colors")), "Blue");
//		 Thread.sleep(3000);
////		 deselectbyindex(driver.findElement(By.id("colors")), 2);
//// 		 Thread.sleep(3000);
////		 deselectbyvalue(driver.findElement(By.id("colors")), "blue");
////		 Thread.sleep(3000);
////		 deselectbyvisibletext(driver.findElement(By.id("colors")), "White");
//	
////		 getfirstselectedoption(driver.findElement(By.id("colors")));
////		 Thread.sleep(3000);
////		 deselectall(driver.findElement(By.id("colors")));
////		 Thread.sleep(3000);
//		 getoptions(driver.findElement(By.id("colors")));
//		 getallselectedoption(driver.findElement(By.id("colors")));
		 
		 
//		 driver.get("https://letcode.in/alert");
//		 driver.findElement(By.id("accept")).click();
//			Thread.sleep(2000);
//			alertgettext();
//			Thread.sleep(2000);
//		 alertaccept();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("confirm")).click();
//			Thread.sleep(2000);
//			alertdismiss();
//			driver.findElement(By.id("prompt")).click();
//			Thread.sleep(2000);
//			alertsendkeys("yoga");
//			alertaccept();
//		 Thread.sleep(2000);
//		 driver.get("https://letcode.in/frame");
//framebyindex(0);
//driver.findElement(By.name("fname")).sendKeys("YogaLakshmi");
//
//Thread.sleep(2000);
//
//framebywebelement(driver.findElement(By.xpath("//iframe[@class='has-background-white']")));		 
//driver.findElement(By.name("email")).sendKeys("yogalakshmi@gmail.com");
//Thread.sleep(2000);
//frameparent();
//driver.findElement(By.name("lname")).sendKeys("Swaminathan"); 
//Thread.sleep(2000);
//		 
//		 driver.get("https://testautomationpractice.blogspot.com/");
//			driver.switchTo().frame("frame-one796456169");
//			driver.findElement(By.id("RESULT_TextField-0")).sendKeys("Yogalakshmi");
//			
//			driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-1_1']")).click();
//			
//			driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
//			driver.findElement(By.xpath("//a[text()='5']")).click();
//			
//			driver.findElement(By.id("RESULT_RadioButton-3")).click();
//			driver.findElement(By.xpath("//option[@value='Radio-0']")).click();
//			
//			driver.findElement(By.id("FSsubmit")).click();
//			Thread.sleep(2000);
//			framedefaultcontent();
//
//			driver.findElement(By.id("field2")).sendKeys("Hello");	 
//		 
//			Thread.sleep(2000);
//		 
//		 driver.get("https://testautomationpractice.blogspot.com/");
//		 actionclick(driver.findElement(By.id("male")));
//		 Thread.sleep(2000);
//		 
//		 actiondoubleclick(driver.findElement(By.xpath("//button[text()='Copy Text']")));
//		 
//		 Thread.sleep(2000);
//		 actiondraganddrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")));
//		 Thread.sleep(2000);
		 
//		 driver.get("https://www.flipkart.com/");
//		 actionmovetoelement(driver.findElement(By.xpath("//span[text()='Electronics']")));
//		 Thread.sleep(2000);
//		 actioncontextclick(driver.findElement(By.xpath("//span[text()='Electronics']")));
//		 Thread.sleep(2000);
//		 robotkeypress(KeyEvent.VK_DOWN);
//		 robotkeypress(KeyEvent.VK_DOWN);
//		 robotkeypress(KeyEvent.VK_DOWN);
//		 robotkeypress(KeyEvent.VK_ENTER);
//		 Thread.sleep(2000);
		 
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=12384721151406833744&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung mobiles",Keys.ENTER);
driver.findElement(By.linkText("Redmi 12 5G Jade Black 6GB RAM 128GB ROM")).click();
windowhandles(1);
WebElement element = driver.findElement(By.id("add-to-cart-button"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",element);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		 
		 }

}

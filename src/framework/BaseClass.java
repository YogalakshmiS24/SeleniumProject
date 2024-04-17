package framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi.ECVKO;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	
	public static  WebDriver driver;
	
//1.BrowserLaunch	
	public static WebDriver browserlaunch(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else if (browsername.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver= new OperaDriver();
		}
		driver.manage().window().maximize();
		return driver;	
		
	}
//2.Get URL
		public static WebDriver launchUrl(String url) {
			try {
				driver.get(url);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		    return driver;
		}
//3.Terminate browser
		public static void quit() {
			driver.quit();
		}
//4.close current tab
		public static void close() {
			driver.close();
		}		
//5.Send keys
	public static void passinput(WebElement element,String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//6.click
	public static void click(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//7.navigate to
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
//8.navigate back
		public static void navigateback(String url) {
			driver.navigate().back();
		}	
//9.navigate forward
		public static void navigateforward(String url) {
			driver.navigate().forward();
		}	
//10.Refresh
		public static void refresh() {
			driver.navigate().refresh();
		}
//11.page source	
		public static void pagesource() {
			String pageSource = driver.getPageSource();
		    System.out.println(pageSource);
		}
//12.get current URL	
		public static void getcurrenturl() {
			String url = driver.getCurrentUrl();
		    System.out.println("Url-------"+url);
		}
//13.get title
		public static void title() {
			String title = driver.getTitle();	
			System.out.println("Title-------"+title);
		}
//14.get Text
		public static void gettext(WebElement element) {
			try {
				System.out.println(element.getText());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//15.is Displayed	
		public static void isdisplayed(WebElement element) {
			try {
				boolean displayed = element.isDisplayed();  
				System.out.println(displayed);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//16.is selected	
		public static void isselected(WebElement element) {
			try {
				boolean selected = element.isSelected();      
				System.out.println(selected);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
//17.is enabled
		public static void isenabled(WebElement element) {
			try {
				boolean enabled = element.isEnabled();        
				System.out.println(enabled);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//18.Screenshot
		public static void screenshot(String location) {
			try {
				TakesScreenshot ts=(TakesScreenshot)driver;
				File scr=ts.getScreenshotAs(OutputType.FILE);
				File des= new File(location);
				FileUtils.copyFile(scr, des);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//19.Java script object
		public static JavascriptExecutor javascriptobject() {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			return js;
		}
//20.scroll home page, up and down
		public static void scrollby(int x,int y) {
			try {
				javascriptobject().executeScript("window.scroll("+x+","+y+")");
			} catch (Exception e) {
				
				e.printStackTrace();
			}	
		}
//21.scroll into view
		public static void scrollintoview(WebElement element) {
			try {
				javascriptobject().executeScript("arguments[0].scrollIntoView();",element);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//22.java script click
		public static void jsclick(WebElement element) {
			try {
				javascriptobject().executeScript("arguments[0].click();",element);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}	
//23.java script send value
		public static void jssend(WebElement element,String value) {
			try {
				javascriptobject().executeScript("arguments[0].value='"+value+"';", element);	
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//24.Implicitly wait
		public static void implicitlywait(int num,TimeUnit Timeunit) {
			try {
				driver.manage().timeouts().implicitlyWait(num, Timeunit);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//25.Explicit wait
		public static void explicitlywait(int num,By element) {
			try {
				WebDriverWait wait =new WebDriverWait(driver, num);                 //Explicit wait
				wait.until(ExpectedConditions.visibilityOfElementLocated(element));	
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//26.Select class object
		public static Select selectclassobject(WebElement element) {
			Select s= new Select(element);
			return s;	
	}
//27.Select by index		
		public static void selectbyindex(WebElement element,int index) {
			try {
				selectclassobject(element).selectByIndex(index);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//28.select by visible text
		public static void selectbyvisibletext(WebElement element,String text) {
			try {
				selectclassobject(element).selectByVisibleText(text);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//29.select by value
		 public static void selectbyvalue(WebElement element,String value) {
			try {
				selectclassobject(element).selectByValue(value);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		 }
//30.Deselect by index
			public static void deselectbyindex(WebElement element,int index) {
				try {
					selectclassobject(element).deselectByIndex(index);
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
//31.Deselect by value
		public static void deselectbyvalue(WebElement element,String value) {
			try {
				selectclassobject(element).deselectByValue(value);
				} catch (Exception e) {
				 e.printStackTrace();
		}	
		}
//32.deselect by  visible text
		public static void deselectbyvisibletext(WebElement element,String text) {
			try {
				selectclassobject(element).deselectByVisibleText(text);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//33.Is multiple
		public static void ismultiple(WebElement element) {
			try {
				boolean multiple = selectclassobject(element).isMultiple();
				System.out.println(multiple);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}	
//34.deselect all
		public static void deselectall(WebElement element) {
			try {
				selectclassobject(element).deselectAll();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//35.get first selected option
		public static void getfirstselectedoption(WebElement element) {
			try {
			  System.out.println("1ST SELECTED VALUE---"+selectclassobject(element).getFirstSelectedOption().getText());
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}		
//36.get all selected options
		public static void getallselectedoption(WebElement element) {
			try {
				List<WebElement> allSelectedOptions =selectclassobject(element).getAllSelectedOptions();
				for (WebElement webelement : allSelectedOptions) {
					System.out.println("SELECTED VALUES---"+webelement.getText());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//37.get options
		public static void getoptions(WebElement element) {
			try {
				List<WebElement> options =selectclassobject(element).getOptions();
				for (WebElement ss : options) {
					System.out.println("OPTIONS---"+ss.getText());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//38.get text alert
		public static void alertgettext() {
			try {
				System.out.println(driver.switchTo().alert().getText());
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}	
//39.alert accept 	
		public static void alertaccept() {
			try {
				driver.switchTo().alert().accept();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//40.alert dismiss
		public static void alertdismiss() {
			try {
				driver.switchTo().alert().dismiss();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//41.alert sendkeys
		public static void alertsendkeys(String value) {
			try {
				driver.switchTo().alert().sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//42.Frame id
		public static void framebyid(String value) {
			try {
				driver.switchTo().frame(value);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//43.Frame by webelement		
		public static void framebywebelement(WebElement element) {
			try {
				driver.switchTo().frame(element);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//44.Frame by index		
		
		public static void framebyindex(int index) {
			try {
				driver.switchTo().frame(index);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}	
//45. Frame parent frame
		public static void frameparent() {
			try {
				driver.switchTo().parentFrame();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//46.default content frame
		public static void framedefaultcontent() {
			try {
				driver.switchTo().defaultContent();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		
//47.Actions class object creation
		public static Actions actionsobject() {
			Actions s=new Actions(driver);
			return s;
		}
//48.Action click
		public static void actionclick(WebElement element) {
			try {
				actionsobject().click(element).perform();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//49.Action double click
		public static void actiondoubleclick(WebElement element) {
			try {
				actionsobject().doubleClick(element).build().perform();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
//50.Action Drag and drop 			
			public static void actiondraganddrop(WebElement src,WebElement des) {
				try {
					actionsobject().dragAndDrop(src, des).perform();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
//51.Action Movetoelement		
			public static void actionmovetoelement(WebElement element) {
				try {
					actionsobject().moveToElement(element).perform();
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
//52.Action Contextclick
			public static void actioncontextclick(WebElement element) {
				try {
					actionsobject().contextClick(element).perform();
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
//53.Robot class object			
			public static Robot robotclassobject() throws AWTException {
				Robot r= new Robot();
				return r;
			}	
//54.Robot class key press release
			public static void robotkeypress(int value) {
				try {
					robotclassobject().keyPress(value);
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}		
//55.Window handles
			public static void windowhandles(int index) {
				try {
					Set<String> windowHandles = driver.getWindowHandles();
					List<String> in=new ArrayList<>(windowHandles);
					driver.switchTo().window(in.get(index));
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}	



			
			
}

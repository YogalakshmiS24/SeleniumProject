package ipt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
public static void main(String[] args) throws IOException {
	 
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=5644541633882655249&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9185320&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1                                ");
   	WebElement element = driver.findElement(By.xpath("//a[@class='a-link-normal _fluid-quad-image-label-v2_style_centerImage__30wh- aok-block image-window']"));
	
	 File scr=element.getScreenshotAs(OutputType.FILE);
	 File des=new File("D:\\java program eclipse\\SeleniumProject\\Screenshot\\Flipkart11.png");
	 FileUtils.copyFile(scr, des);
	 
}

}

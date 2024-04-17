package ipt;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotFullpage {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=5644541633882655249&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9185320&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1                                ");
	 
	 
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	   	ImageIO.write(s.getImage(),"PNG", new File(System.getProperty("user.dir")+"\\Screenshot\\Full.png"));
	}

}

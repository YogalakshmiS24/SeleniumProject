package ipt;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;

import framework.BaseClass;

public class Dynamicpractice extends BaseClass {
	public static void main(String[] args) throws InterruptedException  {
		browserlaunch("chrome");
		launchUrl("https://www.jiomart.com/summer-prebuzz?gad_source=1&gclid=Cj0KCQjwn7mwBhCiARIsAGoxjaJUQ87uH8XZiRARI3UsYp19CR5qVvPq8sL1ViId7xUt9D9xpT4yKnUaAg9iEALw_wcB");
		passinput(driver.findElement(By.xpath("//input[@class='aa-Input search_input']")),"biscuits");
		robotkeypress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		gettext(driver.findElement(By.xpath("(//li[@class='ais-InfiniteHits-item jm-col-4 jm-mt-base' ]//following::span[@class='jm-body-xxs jm-fc-primary-grey-60 line-through jm-mb-xxs']//preceding-sibling::span[@class='jm-heading-xxs jm-mb-xxs'])[1]")));
	    
	}
}

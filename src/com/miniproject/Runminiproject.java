package com.miniproject;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import com.poma.Pageobjectmanager;

import framework.BaseClass;

public class Runminiproject extends BaseClass{
	
	public static Pageobjectmanager pom = new Pageobjectmanager();
		
public static void main(String[] args) throws InterruptedException {
	browserlaunch("chrome");
	launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	implicitlywait(30, TimeUnit.SECONDS);
	passinput(pom.getLp().getUsername(),"Admin");
	passinput(pom.getLp().getPassword(),"admin123");
	click(pom.getLp().getLogin());
	 
    click(pom.gethp().getAdmin());
    click(pom.gethp().getAdd());
    click(pom.gethp().getUserrole());
    robotkeypress(KeyEvent.VK_DOWN);
    robotkeypress(KeyEvent.VK_ENTER);
    
    click(pom.gethp().getStatus());
    robotkeypress(KeyEvent.VK_DOWN);
    robotkeypress(KeyEvent.VK_ENTER);
    
    String text = pom.gethp().getGettext().getText();
    
    passinput(pom.gethp().getEmployeename(),text.substring(0, 4));
    Thread.sleep(2000);
    robotkeypress(KeyEvent.VK_DOWN);
    robotkeypress(KeyEvent.VK_ENTER);
    
   passinput(pom.gethp().getUsername(), "AAAaaaa");
   passinput(pom.gethp().getPassword(),"Yoga123@");
    passinput(pom.gethp().getReenterpassword(),"Yoga123@");
    click(pom.gethp().getSave());
    
 }
}

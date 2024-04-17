package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.BaseClass;

public class Homepage {

	public Homepage(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item']")
	private WebElement admin;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement add;
	@FindBy(xpath="//div[@class='oxd-select-text-input'][1]")
	private WebElement userrole;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement status;

	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement gettext;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement employeename;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	private WebElement reenterpassword;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private WebElement save;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getReenterpassword() {
		return reenterpassword;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getStatus() {
		return status;
	}

	public WebElement getGettext() {
		return gettext;
	}

	public WebElement getEmployeename() {
		return employeename;
	}

	public WebElement getAdmin() {
		return admin;
	}

	public WebElement getAdd() {
		return add;
	}
	
	public WebElement getUserrole() {
		return userrole;
	}


	 
	
	

}

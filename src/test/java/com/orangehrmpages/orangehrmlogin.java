package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmlogin {
	WebDriver driver;
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginbutton;
	
	public orangehrmlogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void username(String name) {
		username.sendKeys(name);
				
	}
	
	public void password(String pass) {
		password.sendKeys(pass);
	}
	
	public void login() {
		loginbutton.click();
	}
		
}
	
	
	
	
	



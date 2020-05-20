package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class orangehrmadmin {
	WebDriver driver;
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	@FindBy (id="searchSystemUser_userName")
	WebElement UserName;
	@FindBy (id="searchSystemUser_userName")
	WebElement UserRole;
	@FindBy (id="searchSystemUser_employeeName_empName")
	WebElement EmployeeName;
	@FindBy (id="searchSystemUser_status")
	WebElement Status;
	@FindBy (id="searchBtn")
	WebElement search;
	@FindBy (id="btnAdd")
	WebElement Add;
	@FindBy (id="UserHeading")
	WebElement AddUser;
	@FindBy(id="systemUser_userType")
	WebElement  addrole;
	@FindBy(id="systemUser_employeeName_empName")
	WebElement EmpName;
	@FindBy(id="systemUser_userName")
	WebElement username;
	@FindBy (id="systemUser_status")
	WebElement Status1;
	@FindBy(id="systemUser_password")
	WebElement PassWord;
	@FindBy(id="systemUser_confirmPassword")
	WebElement ConfirmPwd;
	
	



    public orangehrmadmin (WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    public void clickAdmin() {
    	Admin.click();
    }
    public void UserName(String text) {
    	UserName.sendKeys(text);
    }
    public void UserRole(String text) {
    	Select sel=new Select(UserRole);
    	sel.selectByVisibleText(text);
    }
    public void EmployeeName(String text) {
    	EmployeeName.sendKeys(text);
    }
    public void Status(String text) {
    	Select sel=new Select (Status);
    	sel.selectByVisibleText(text);
   }
    public void clicksearch() {
    search.click();
    }
    public void Addclick() {
    	Add.click();
    }
    
    public void addrole(String text) {
    	Select sel= new Select(addrole);
    	sel.selectByVisibleText(text);
    }
    public void EmpName(String text) {
    	EmpName.sendKeys(text);
    }
    public void username( String text) {
    	username.sendKeys(text);
    }
    public void status1(String text) {
    	Select sel=new Select(Status1);
    	sel.selectByVisibleText(text);
    }
    public void PassWord(String text) {
    	PassWord.sendKeys(text);
    	ConfirmPwd.sendKeys(text);
    }
    
} 	
     
    	 
     
    
    	
    
    	
    
    	
    	
    	
    	
    	
	

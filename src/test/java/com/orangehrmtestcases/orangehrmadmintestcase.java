package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.orangehrmpages.orangehrmadmin;
import com.orangehrmpages.orangehrmlogin;

public class orangehrmadmintestcase extends Library {
	@BeforeMethod
	public void launchbrowser() {
		launchApplication ("chrome","https://opensource-demo.orangehrmlive.com/");
		orangehrmlogin lpage= new orangehrmlogin(driver);
		lpage.username("Admin");
		lpage.password("admin123");
		lpage.login();
	}
	@Test(priority=1)
	public void Admin() {
		orangehrmadmin admin=new orangehrmadmin(driver);
		admin.clickAdmin();
		admin.UserName("Madhan");
		admin.UserRole("Admin");
		admin.EmployeeName("kavitha");
		admin.Status("Enabled");
		admin.clicksearch();
		
		
	}
	//@Test(priority=2)
	public void add() {
		orangehrmadmin admin=new orangehrmadmin(driver);
		admin.clickAdmin();
		admin.Addclick();
		admin.addrole("ESS");
		admin.EmpName("Sanjay");
		admin.username("Soundar");
		admin.status1("Enabled");
		admin.PassWord("Sana");
			
		
	}
	@AfterMethod()
	public void close() throws IOException {
		   screenshot("src/test/resources/screenshots/orangehrm.png");
		   quit();
		   }
		}
	
	
	
		
	


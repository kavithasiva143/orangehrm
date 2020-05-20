package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.baseclass.Library;
import com.orangehrmpages.orangehrmlogin;

public class orangehrmlogintestcase extends Library {
	@BeforeMethod
	public void launchbrowser() {
		launchApplication ("chrome","https://opensource-demo.orangehrmlive.com/");
		orangehrmlogin lpage= new orangehrmlogin(driver);
		lpage.username("Admin");
		lpage.password("admin123");
		lpage.login();
	}
	@AfterMethod()
	public void close() throws IOException {
		   screenshot("src/test/resources/screenshots/orangehrm.png");
		   quit();
		   }
	

}

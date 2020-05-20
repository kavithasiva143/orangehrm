package com.orangehrmtestcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Library;
import com.orangehrmpages.orangehrmlogin;
import com.orangehrmpages.orangehrmrecruitment;

public class orangehrmrecruitmenttestcase extends Library {
	
	@BeforeMethod
	public void launchbrowser() {
		launchApplication ("chrome","https://opensource-demo.orangehrmlive.com/");
		orangehrmlogin lpage= new orangehrmlogin(driver);
		lpage.username("Admin");
		lpage.password("admin123");
		lpage.login();
	}
	
@Test

   public void recruitmentpage() {
	   orangehrmrecruitment hrm= new orangehrmrecruitment(driver);
	   hrm.clickrecruitment();
	   hrm.selectjobtitle("CEO");
	   hrm.status("Hired");
	   hrm.candidatename("kavitha");
	   hrm.keywords("testing");
	   hrm.selectmethodofapplication("Manual");
	   hrm.clicksearch();
	
   }
@Test
   public void addbutton() {
	   orangehrmrecruitment hrm=new orangehrmrecruitment(driver);
	   hrm.clickrecruitment();
	   hrm.addclick();
	   
	   hrm.fullnames("kavitha", "siva");
	   hrm.contactinfo("siva_kavitha@hotmail.com", "123456");
	   hrm.resume("C:\\Users\\siva__0kz400j\\Documents\\dummyresume.xlsx");
   }
   
   @AfterMethod
   public void close() throws IOException {
   screenshot("src/test/resources/screenshots/orangehrm.png");
   quit();
   }
}
   

package com.orangehrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class orangehrmrecruitment {
	WebDriver driver;
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	WebElement recruitment;
	@FindBy(id="candidateSearch_jobTitle")
	WebElement jobtitle;
	@FindBy(id="candidateSearch_status")
	WebElement status;
	
	@FindBy(id="candidateSearch_candidateName")
	WebElement candidatename;
	@FindBy(id="candidateSearch_keywords")
	WebElement keywords;
	@FindBy(id="candidateSearch_modeOfApplication")
	WebElement methodofapplication;
	@FindBy(id="btnSrch")
	WebElement search;
	@FindBy(id="btnAdd")
	WebElement add;
	@FindBy(id="addCandidate_firstName")
	WebElement firstname;
	@FindBy(id="addCandidate_lastName")
	WebElement lastname;
	@FindBy(id="addCandidate_email")
	WebElement email;
	@FindBy(id="addCandidate_contactNo")
	WebElement contactno;
	@FindBy(id="addCandidate_resume")
	WebElement resume;
	
	
	


      public  orangehrmrecruitment(WebDriver driver) {
      this.driver=driver;
       		PageFactory.initElements(driver, this);
      }
      public void clickrecruitment() {
	     recruitment.click();
      }
      public void selectjobtitle(String text) {
    	 Select sel=new Select(jobtitle) ;
    	 sel.selectByVisibleText(text);
      }	
      public void status(String text) {
    	  status.sendKeys(text);
      }
      public void candidatename(String text) {
	     candidatename.sendKeys(text);       
      }
    	  
      public void keywords(String text) {
    	  keywords.sendKeys(text);
      }  
      public void selectmethodofapplication(String text) {
    	  Select sel=new Select(methodofapplication);
    	  sel.selectByVisibleText(text);
      }	  
      
      public void clicksearch() {
    	  search.click();
      }
      public void addclick() {
    	  add.click();
      }
      public void fullnames(String fname,String lname) {
    	  firstname.sendKeys("fname");
    	  lastname.sendKeys("lname");
      }
      public void contactinfo(String name,String numb) {
    	  email.sendKeys(name);
    	  contactno.sendKeys(numb);
      }
      public void resume(String path) {
    	  resume.sendKeys(path);
      }
      }
      
      
    

     
package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

import LPDashboard.LegalEntityPage;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//input[@class=\"login_btn\"]")
	WebElement Sign_In;														// User-name
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement Useremail;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement UserPassword;
	
	@FindBy(xpath="//input[@class=\"login_btn\"]")
	WebElement Login_Btn;
	

	
	
	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	
	public LegalEntityPage login(String un, String pwd) throws Exception{
		
		Useremail.sendKeys(un);
		
		Sign_In.click();
		
		UserPassword.sendKeys(pwd);
		Thread.sleep(2000);
		Login_Btn.click();
//		    	JavascriptExecutor js = (JavascriptExecutor)driver;
//		    	js.executeScript("arguments[0].click();", Login_Btn);
		    	
		return new LegalEntityPage();
	}
	
}

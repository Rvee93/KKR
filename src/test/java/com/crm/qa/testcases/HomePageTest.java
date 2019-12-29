package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;

import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import LPDashboard.LegalEntityPage;
import LPDashboard.LegalEntiyPageTest;

public class HomePageTest extends TestBase {
	LoginPage loginPage;

	DashboardPage dashboardPage; 
	TestUtil testUtil;
	LegalEntityPage legalPage;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws Exception{
		initialization();
		testUtil = new TestUtil();
		dashboardPage = new DashboardPage();
		loginPage = new LoginPage();
		legalPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
//	@Test(priority=1)												//Proceed button is clicked
//	public void ProceedToDashboardClickTest(){
//		homePage.ProceedToDashboardclick();
//	}
//	@Test(priority=2)												//Add New Legal Entity is clicked 
//	public void AddNewLegalEntityTest() throws Exception
//	{
//		homePage.ProceedToDashboardclick();
//		homePage.AddNewEntity();
//	}
//	@Test(priority=1)												// initiate old entity named Google Project Part 1
//	public void SubscribeOldEntityTest() throws Exception
//	{
//		homePage.ProceedToDashboardclick();
//		homePage.subscribeClick();
//		homePage.SubscribeOldEntity();
	
	@Test(priority=1)												// initiate old entity named Google Project Part 1
	public void SubscribeOldEntityTest() throws Exception
	{
//		homePage.ProceedToDashboardclick();
		Thread.sleep(2000);
//		homePage.subscribeClick();								// clicks the Subscribe button at dashboard
//		homePage.PendingButtonClick();
//		homePage.editFirstEntityinScreen();
////		homePage.AddNewEntity();
//		Thread.sleep(2000);
//		homePage.LegalEntityProcess();
////		homePage.SubscribeOldEntity();							// Searches the old entity and initiates it 
//		Thread.sleep(5000);
////		homePage.ScrollPageforSavebutton();						// Legal Entity scroll till bottom
////		homePage.SaveNextClick();								// Legal Entity save and next clicked
//		homePage.AMLKYCProcess();								// KYC  & Documentation
	}

//	@Test(priority=1)
//	public void EditEntityTest() throws Exception
//	{
////		homePage.ProceedToDashboardclick();
//		Thread.sleep(2000);
//		homePage.EditEntty();
//	}
//	
	
	
	
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
//	
	

}

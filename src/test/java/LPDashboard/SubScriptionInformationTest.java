package LPDashboard;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;


import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import LPDashboard.AMLKYCandAuthorizedSignatory;

public class SubScriptionInformationTest extends TestBase{
	LoginPage loginPage;
	
	 
	TestUtil testUtil;
	LegalEntityPage legalPage;
	AMLKYCandAuthorizedSignatory amlKycPage;
	SubScriptionInformation subscriptionInformation;
	
	@Test
	public void  OtherLegalEntityInformationTest() throws Exception 
	{
		amlKycPage.KYCProcess();
		Thread.sleep(2000);
		amlKycPage.DocumentationProcess();
		Thread.sleep(2000);
		amlKycPage.amlProcess();
		Thread.sleep(1000);
		amlKycPage.PayToPlay();
		Thread.sleep(2000);
		amlKycPage.AuthorizedSignatory();
		Thread.sleep(2000);
		subscriptionInformation.OtherLegalEntiyInformation();
		Thread.sleep(500);
		subscriptionInformation.SubsctiptionInfo();
		Thread.sleep(5000);
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
	TestBase.initialization();
	testUtil = new TestUtil();

	loginPage = new LoginPage();
	legalPage = new LegalEntityPage();
	legalPage = loginPage.login(TestBase.prop.getProperty("username"), TestBase.prop.getProperty("password"));
	Thread.sleep(2000);
	legalPage.subscribeClick();
	Thread.sleep(1000);
	legalPage.AddNewEntity();
	Thread.sleep(1000);
	legalPage.LegalEntityProcess();
	Thread.sleep(2000);
	amlKycPage = new AMLKYCandAuthorizedSignatory();
	Thread.sleep(2000);
	subscriptionInformation = new SubScriptionInformation();
	Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	


}

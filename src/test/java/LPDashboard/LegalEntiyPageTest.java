package LPDashboard;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;



public class LegalEntiyPageTest extends TestBase {
	LoginPage loginPage;
	
	DashboardPage dashboardPage; 
	TestUtil testUtil;
	LegalEntityPage legalPage;
	
	
	 public LegalEntiyPageTest() {
		// TODO Auto-generated constructor stub
	super();
	}	
	
	@Test
	public void LegalTest() throws Exception
	{
		Thread.sleep(5000);
		legalPage.subscribeClick();
		Thread.sleep(1000);
		legalPage.AddNewEntity();
		Thread.sleep(1000);
		legalPage.LegalEntityProcess();
	}
	 
	
	@BeforeMethod
	public void setUp() throws Exception {
	TestBase.initialization();
	testUtil = new TestUtil();
	dashboardPage = new DashboardPage();
	loginPage = new LoginPage();
	legalPage = loginPage.login(TestBase.prop.getProperty("username"), TestBase.prop.getProperty("password"));
	}
	
	
	
	
	

}

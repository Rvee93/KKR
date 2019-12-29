package LPDashboard;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;

import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import LPDashboard.AMLKYCandAuthorizedSignatory;
import LPDashboard.LegalEntityPage;

public class SignatureTest extends TestBase{
LoginPage loginPage;
	
	DashboardPage dashboardPage; 
	TestUtil testUtil;
	LegalEntityPage legalPage;
	AMLKYCandAuthorizedSignatory amlKycPage;
	SubScriptionInformation subscriptionInformation;
	Wire wire;
	Tax Taxobj;
	Contacts contact;
	Signature sign;
	public SignatureTest() {super();}
	
	@Test
	public void SignatureTesthere() throws Exception
	{
			Thread.sleep(3000);
			//	contact.AddContact();                 // -----------------------------> Adding a new Contact
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
			Thread.sleep(1000);
			subscriptionInformation.SubsctiptionInfo();
			Thread.sleep(1000);
			wire.WireCheck();
			Thread.sleep(1000);
			Taxobj.taxContact();
			Thread.sleep(1000);
			Taxobj.TaxForms();
			Thread.sleep(1000);
			Taxobj.TaxSelfCertForm();
			Thread.sleep(1000);
			Taxobj.TaxSignature();
			Thread.sleep(2000);
			contact.contactSubmit();
			Thread.sleep(3000);
			sign = new Signature();									
			sign.SubmittheEntity("rob.ayre@kkr.com","P@rk008", prop.getProperty("url"));
			Thread.sleep(2000);
			sign.ApproveSubscriptionInformation();
			Thread.sleep(2000);
			
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
		TestBase.initialization();
		testUtil = new TestUtil();
		dashboardPage = new DashboardPage();
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
		wire = new Wire();
		Thread.sleep(2000);
		Taxobj = new Tax();
		Thread.sleep(2000);
		contact = new Contacts();
		Thread.sleep(2000);

	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

	
}

package LPDashboard;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.excelutils;

public class SubScriptionInformation extends TestBase {
	Robot robot;
	SubScriptionInformation subscriptionInformation;
	String ExcelFilePath = "./TestData/TestData.xlsx";
	
	@FindBy(xpath="//a[contains(text(),'Subscription Information')]")
	WebElement SubscriptionInformationSideMenu;
	@FindBy(xpath="//label[@for=\"legal entity_grantor_trust_0_0_0\"]")
	WebElement Additional_information_one_Yes;
	@FindBy(xpath="//label[@for=\"legal entity_grantor_trust_0_0_1\"]")
	WebElement Additional_information_one_No;
	@FindBy(xpath="//label[@for=\"legal entity_been_formed_organized_0_0_0\"]")
	WebElement Additional_information_two_Yes;
	@FindBy(xpath="//label[@for=\"legal entity_been_formed_organized_0_0_1\"]")
	WebElement Additional_information_two_No;
	@FindBy(xpath="//label[@for=\"legal entity_foreign_government_0_0_0\"]")
	WebElement Additional_information_four_Yes;
	@FindBy(xpath="//label[@for=\"legal entity_foreign_government_0_0_1\"]")
	WebElement Additional_information_four_No;
	@FindBy(xpath="//label[@for=\"Direct_Electing_Limited_Partner_0_0_1\"]")
	WebElement Additional_information_five_Direct;
	@FindBy(xpath="//label[@for=\"Direct_Electing_Limited_Partner_0_0_2\"]")
	WebElement Additional_information_five_Electing;
	@FindBy(xpath="//label[@for=\"BHC_limited_partner_0_0_0\"]")
	WebElement Additional_information_six_one;
	@FindBy(xpath="//label[@for=\"BHC_limited_partner_0_0_1\"]")
	WebElement Additional_information_six_two;
	@FindBy(xpath="//label[@for=\"BHC_limited_NotApplicable\"]")
	WebElement Additional_information_six_three;
	@FindBy(xpath="//label[@for=\"IRA_owner_0_0_0\"]")
	WebElement Additional_information_seven_yes;
	@FindBy(xpath="//label[@for=\"IRA_owner_0_0_1\"]")
	WebElement Additional_information_seven_No;
	@FindBy(xpath="//label[@for=\"discretionary_authority_0_0_0\"]")
	WebElement Additional_information_eight_yes;
	@FindBy(xpath="//label[@for=\"discretionary_authority_0_0_1\"]")
	WebElement Additional_information_eight_No;
	@FindBy(xpath="//label[@for=\"FOIA_U_S_state_public_0_0_0\"]")
	WebElement Additional_information_nine_yes;
	@FindBy(xpath="//label[@for=\"FOIA_U_S_state_public_0_0_1\"]")
	WebElement Additional_information_nine_No;
	@FindBy(xpath="//label[@for=\"investment_company_solely_0_0_0\"]")
	WebElement Additional_information_ten_yes;
	@FindBy(xpath="//label[@for=\"investment_company_solely_0_0_1\"]")
	WebElement Additional_information_ten_No;
	@FindBy(xpath="//input[@id=\"fiscal_year_end\"]")
	WebElement Additional_information_eleven_calendar;
	@FindBy(xpath="//label[@for=\"reporting_obligations_0_0_0\"]")
	WebElement Additional_information_twelve_yes;
	@FindBy(xpath="//label[@for=\"reporting_obligations_0_0_2\"]")
	WebElement Additional_information_twelve_no;
	@FindBy(xpath="//label[@for=\"reporting_obligations_0_0_3\"]")
	WebElement Additional_information_twelve_na;
	@FindBy(xpath="//label[@for=\"legal_form_of_entity_0\"]")
	WebElement Additional_information_thirteen_yes;
	@FindBy(xpath="//label[@for=\"legal_form_of_entity_1\"]")
	WebElement Additional_information_thirteen_no;
	@FindBy(xpath="//label[@for=\"regulatory_restrictions_0_0_0\"]")
	WebElement Additional_information_Fourteen_yes;
	@FindBy(xpath="//label[@for=\"regulatory_restrictions_0_0_1\"]")
	WebElement Additional_information_Fourteen_no;
	@FindBy(xpath="//label[@for=\"prospective_investor_in_the_fund_0_0_0\"]")
	WebElement Additional_information_Fifteen_yes;
	@FindBy(xpath="//label[@for=\"prospective_investor_in_the_fund_0_0_1\"]")
	WebElement Additional_information_Fifteen_no;
	@FindBy(xpath="//label[@for=\"the_undersigne_Interest_subscribing_entity_0\"]")
	WebElement Additional_information_Sixteen_yes;
	@FindBy(xpath="//label[@for=\"the_undersigne_Interest_subscribing_entity_1\"]")
	WebElement Additional_information_Sixteen_no;
	@FindBy(xpath="//label[@for=\"beneficial_subscribing_entity_0\"]")
	WebElement Additional_information_Seventeen_yes;
	@FindBy(xpath="//label[@for=\"beneficial_subscribing_entity_1\"]")
	WebElement Additional_information_Seventeen_no;
	@FindBy(xpath="//p[contains(text(),'By checking the box below, the legal entity represents that the legal entity is subject to legal or established policy prohibitions that preclude the legal entity receiving certain notices, consents, waivers, demands or communications pursuant to Section 10.7.2 of the Partnership Agreement via KKR’s password-protected website')]")
	WebElement Additional_information_eighteen;
	@FindBy(xpath="//button[contains(text(),' Add New Form ')]")
	WebElement AdditionalForm;
	
	@FindBy(xpath="//span[@title=\"Please Select Document Type\"]")
	WebElement DocumentType;
	@FindBy(xpath="//label[contains(text(),'Date  Signed')]/following::input[1]")
	WebElement Date_signed;
	@FindBy(xpath="//button[contains(text(),'Submit Document')]")
	WebElement Submit_Document;
	
	@FindBy(xpath="//button[@class=\"ORPsendNextFilesBtn btn-orp-pending sendFilesActionButton ml-2 mb-3 pull-right ng-scope ladda-button\"]")
	WebElement SaveandNextforOtherlegalEntityInformation;
	
	public SubScriptionInformation()  
	{
		PageFactory.initElements(driver, this);
	}
	public static void ScrollPageforSavebutton() throws Exception 
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(2000);
	}
	public static void ScrollPageforradiobutton() throws Exception 
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(2000);
	}
	
	public void OtherLegalEntiyInformation() throws Exception
	{
		SubscriptionInformationSideMenu.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),' Verification of Status as a “professional client” under Annex II to Directive 2014/65/EU ')]")).click();
		Thread.sleep(2000);
		
		robot = new Robot();
		// Simulate key Events
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 1 check 1
        Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 1 check 2
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 1 check 3
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 1 check 4
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 1 check 5
        
        String window = driver.getWindowHandle();
        driver.switchTo().window(window);
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id=\"localAuthorityGeneralprimaryModalOkBtn\"]")).click();
        Thread.sleep(500);
        driver.switchTo().parentFrame();        
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Verification of Status as a \"Well-Informed Investor\" under the Luxembourg law of 23 July 2016 on reserved alternative funds')]")).click();
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 2 check 1
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 2 check 2
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 2 check 3
		Thread.sleep(1000);
		// Section 3 selecting
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 1
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 2
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 3
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Verification of Status as a “Qualified Purchaser” and “Qualified Eligible Person”')]")).click();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 1
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 2
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 3
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				// Section 3 check 4
		Thread.sleep(1000);
		String window1 = driver.getWindowHandle();
        driver.switchTo().window(window1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id=\"localAuthorityGeneralprimaryModalOkBtnQusFour\"]")).click();
        Thread.sleep(500);
        driver.switchTo().parentFrame();        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Additional Information')]")).click();
        Thread.sleep(1000);
        Additional_information_one_No.click();
        Thread.sleep(500);
        Additional_information_two_No.click();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);						// Q3 check 1
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);						// Q3 check 2
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);						// Q3 check 3
        ScrollPageforradiobutton();
        Additional_information_four_No.click();
        Thread.sleep(500);
        Additional_information_five_Direct.click();
        Thread.sleep(500);
        Additional_information_six_one.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//p[contains(text(),'Please indicate whether the legal entity is, or is acting on behalf of (check all that apply):')]")).click();
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);						// Q7 check 1
		driver.findElement(By.xpath("//input[@id=\"ERISA_or_Section_4975_0_0_13_input\"]")).sendKeys("99.99");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q7 check 2
		driver.findElement(By.xpath("//input[@id=\"ERISA_or_Section_4975_0_0_13_input_0_0_3\"]")).sendKeys("99.99");
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q7 check 3
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q7 check 4
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q7 check 5
		Thread.sleep(500);
		Additional_information_seven_No.click();
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q7 check 6
		
		Additional_information_eight_No.click();
		Thread.sleep(500);
		Additional_information_nine_No.click();
		ScrollPageforradiobutton();
		Additional_information_ten_No.click();
		Thread.sleep(500);
		Additional_information_eleven_calendar.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
		Thread.sleep(1000);
		ScrollPageforradiobutton();
		Additional_information_twelve_na.click();
		Thread.sleep(500);
		Additional_information_thirteen_yes.click();
		Thread.sleep(500);
		Additional_information_Fourteen_no.click();
		ScrollPageforradiobutton();
		Additional_information_Fifteen_no.click();
		Thread.sleep(1000);
		Additional_information_Sixteen_no.click();
		Thread.sleep(1000);
		Additional_information_Seventeen_no.click();
		Thread.sleep(1000);
		ScrollPageforradiobutton();
		Additional_information_eighteen.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q18 check 1
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		robot.keyRelease(KeyEvent.VK_SPACE);						// Q19 check 1

		ScrollPageforradiobutton();
		Thread.sleep(500);
		/*---AdditionalForm.click();
		Thread.sleep(500);
//		String window2 = driver.getWindowHandle();
//		driver.switchTo().window(window2);
//		Thread.sleep(500);
	
		---------------------------------------------------------------------Subscription Information Additional Document
		
		File DocumentationFile = new File ("./TestData/LP.pdf");
		driver.findElement(By.xpath("//input[@class=\"form-control addNewFormLegalEntity2ModelPopFile\"]")).sendKeys(DocumentationFile.getAbsolutePath());
		Thread.sleep(1000);
		DocumentType.click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("Suitablity");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		Date_signed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
		Thread.sleep(1000);
		Submit_Document.click();
		Thread.sleep(30000);		----------------------------*/
//		driver.switchTo().parentFrame();
//		Thread.sleep(500);
		ScrollPageforSavebutton();
		SaveandNextforOtherlegalEntityInformation.click();
		Thread.sleep(5000);
	}
	
	public Wire SubsctiptionInfo() throws Exception
	{
		ScrollPageforradiobutton();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"totalcommitment\"]")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"submitSendFilesBtns btn-orp-pending sendFilesActionButton ml-2 mb-3 pull-right ng-scope ladda-button\"]")).click();
		Thread.sleep(3000);
		return new Wire();
	}
	
}

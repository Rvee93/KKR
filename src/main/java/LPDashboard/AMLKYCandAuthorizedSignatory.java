package LPDashboard;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.excelutils;

public class AMLKYCandAuthorizedSignatory extends TestBase {
	
	
	String ExcelFilePath = "./TestData/TestData.xlsx";
	/*-----------------------------------------------------------------RadiobuttonsforLE-KYC---------------------------------------------------------------------------*/	
	@FindBy(xpath="//label[@for=\"kycInformation_01_Radio\"]")
	WebElement FirstRadiobuttonYes;
	
	@FindBy(xpath="//label[@for=\"kycInformation_02_Radio\"]")
	WebElement FirstRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_03_Radio\" and @name=\"kycInformation_02_Radio_name\"]//following::label[@for=\"kycInformation_03_Radio\"]")
	WebElement SecondRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_04_Radio\" and @name=\"kycInformation_02_Radio_name\"]//following::label[@for=\"kycInformation_04_Radio\"]")
	WebElement SecondRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_05_Radio\" and @name=\"kycInformation_03_Radio_name\"]//following::label[@for=\"kycInformation_05_Radio\"]")
	WebElement ThirdRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_06_Radio\" and @name=\"kycInformation_03_Radio_name\"]//following::label[@for=\"kycInformation_06_Radio\"]")
	WebElement ThirdRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_07_Radio\" and @name=\"kycInformation_04_Radio_name\"]//following::label[@for=\"kycInformation_07_Radio\"]")
	WebElement FourthRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_08_Radio\" and @name=\"kycInformation_04_Radio_name\"]//following::label[@for=\"kycInformation_08_Radio\"]")
	WebElement FourthRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_09_Radio\" and @name=\"kycInformation_05_Radio_name\"]//following::label[@for=\"kycInformation_09_Radio\"]")
	WebElement FifthRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_010_Radio\" and @name=\"kycInformation_05_Radio_name\"]//following::label[@for=\"kycInformation_010_Radio\"]")
	WebElement FifthRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_011_Radio\" and @name=\"kycInformation_06_Radio_name\"]//following::label[@for=\"kycInformation_011_Radio\"]")
	WebElement SixthRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_012_Radio\" and @name=\"kycInformation_06_Radio_name\"]//following::label[@for=\"kycInformation_012_Radio\"]")
	WebElement SixthRadiobuttonNo;	
	
	@FindBy(xpath="//input[@id=\"kycInformation_013_Radio\" and @name=\"kycInformation_07_Radio_name\"]//following::label[@for=\"kycInformation_013_Radio\"]")
	WebElement SeventhRadiobuttonYes;	
	@FindBy(xpath="//input[@id=\"kycInformation_014_Radio\" and @name=\"kycInformation_07_Radio_name\"]//following::label[@for=\"kycInformation_014_Radio\"]")
	WebElement SeventhRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_015_Radio\" and @name=\"kycInformation_08_Radio_name\"]//following::label[@for=\"kycInformation_015_Radio\"]")
	WebElement EighthRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_016_Radio\" and @name=\"kycInformation_08_Radio_name\"]//following::label[@for=\"kycInformation_016_Radio\"]")
	WebElement EighthRadiobuttonNo;	
	
	@FindBy(xpath="//input[@id=\"kycInformation_017_Radio\" and @name=\"kycInformation_09_Radio_name\"]//following::label[@for=\"kycInformation_017_Radio\"]")
	WebElement NinethRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_018_Radio\" and @name=\"kycInformation_09_Radio_name\"]//following::label[@for=\"kycInformation_018_Radio\"]")
	WebElement NinethRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_019_Radio\" and @name=\"kycInformation_010_Radio_name\"]//following::label[@for=\"kycInformation_019_Radio\"]")
	WebElement TenthRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_020_Radio\" and @name=\"kycInformation_010_Radio_name\"]//following::label[@for=\"kycInformation_020_Radio\"]")
	WebElement TenthRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_021_Radio\" and @name=\"kycInformation_011_Radio_name\"]//following::label[@for=\"kycInformation_021_Radio\"]")
	WebElement EleventhRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_022_Radio\" and @name=\"kycInformation_011_Radio_name\"]//following::label[@for=\"kycInformation_022_Radio\"]")
	WebElement EleventhRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_023_Radio\" and @name=\"kycInformation_012_Radio_name\"]//following::label[@for=\"kycInformation_023_Radio\"]")
	WebElement TwelthRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_024_Radio\" and @name=\"kycInformation_012_Radio_name\"]//following::label[@for=\"kycInformation_024_Radio\"]")
	WebElement TwelthRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_025_Radio\" and @name=\"kycInformation_013_Radio_name\"]//following::label[@for=\"kycInformation_025_Radio\"]")
	WebElement ThirteenRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_026_Radio\" and @name=\"kycInformation_013_Radio_name\"]//following::label[@for=\"kycInformation_026_Radio\"]")
	WebElement ThirteenRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_027_Radio\" and @name=\"kycInformation_014_Radio_name\"]//following::label[@for=\"kycInformation_027_Radio\"]")
	WebElement FourteenRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_028_Radio\" and @name=\"kycInformation_014_Radio_name\"]//following::label[@for=\"kycInformation_028_Radio\"]")
	WebElement FourteenRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_029_Radio\" and @name=\"kycInformation_015_Radio_name\"]//following::label[@for=\"kycInformation_029_Radio\"]")
	WebElement FifteenRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_030_Radio\" and @name=\"kycInformation_015_Radio_name\"]//following::label[@for=\"kycInformation_030_Radio\"]")
	WebElement FifteenRadiobuttonNo;
	
	@FindBy(xpath="//input[@id=\"kycInformation_031_Radio\" and @name=\"kycInformation_016_Radio_name\"]//following::label[@for=\"kycInformation_031_Radio\"]")
	WebElement SixteenRadiobuttonYes;
	@FindBy(xpath="//input[@id=\"kycInformation_032_Radio\" and @name=\"kycInformation_016_Radio_name\"]//following::label[@for=\"kycInformation_032_Radio\"]")
	WebElement SixteenRadiobuttonNo;
	
	@FindBy(xpath="//label[@for=\"kycInformation_034_Radio\"]")
	WebElement SeventeenRadiobuttonNo;
	@FindBy(xpath="//label[@for=\"kycInformation_033_Radio\"]")
	WebElement SeventeenRadiobuttonYes;
	
	@FindBy(xpath="//label[@for=\"kycInformation_036_Radio\"]")
	WebElement EighteenRadiobuttonNo;
	@FindBy(xpath="//label[@for=\"kycInformation_035_Radio\"]")
	WebElement EighteenRadiobuttonYes;
	
	@FindBy(xpath="//label[@for=\"kycInformation_038_Radio\"]")
	WebElement NineteenRadiobuttonNo;
	@FindBy(xpath="//label[@for=\"kycInformation_037_Radio\"]")
	WebElement NineeenRadiobuttonYes;
	
	@FindBy(xpath="//div[@class=\"col-md-12 form-group ml-3 mb-2\"]//following::button")
	WebElement SaveAndNextforAMLKYC;

/*-----------------------------------------------------------------RadiobuttonsforLE-KYC---------------------------------------------------------------------------*/
	

/*------------------------------------------------Documentation----------------------------------------------------*/
	@FindBy(xpath="//p[contains(text(),'Company List of Current Directors ')]/following::a[1]")
	WebElement CompanyListOfCurrentdirectors;
	@FindBy(xpath="//p[contains(text(),'Incorporation Certificate and Constitutional Documents ')]/following::a[1]")
	WebElement IncorporationCertificateandConstitutionalDocuments ;
	@FindBy(xpath="//p[contains(text(),'Company Registry Extract ')]/following::a[1]")
	WebElement CompanyRegistryExtract ;
	@FindBy(xpath="//p[contains(text(),'Full Ownership Details ')]/following::a[1]")
	WebElement FullOwnershipDetails ;
	@FindBy(xpath="//p[contains(text(),'Identification Documents - Directors or Trustees or Owners ')]/following::a[1]")
	WebElement IdentificationDocumentsDirectorsorTrusteesorOwners ;
	@FindBy(xpath="//p[contains(text(),'Copy of Foreign Bank Certification ')]/following::a[1]")
	WebElement CopyofForeignBankCertification ;
	
	@FindBy(xpath="//button/span[contains(text(),'Add Additional Forms')]")
	WebElement AddAdditionalForms;
	
	@FindBy(id="documentation_document_type_field")
	WebElement Document_Type;
	
	@FindBy(xpath="//input[@class=\"form-control addNewDocumentsForKYCAuthorizedPopORPFile\"]")
	WebElement Addfile;
	@FindBy(xpath="//button[contains(text(),\"Submit Document\")]")
	WebElement SubmitDocument;
	
	@FindBy(xpath="//button[@class=\"ORPsendNextFilesBtn sendFilesActionButton ml-2 mb-3 pull-right ng-scope ladda-button\"]")
	WebElement SaveandNextforDocumentation;
	
	@FindBy(xpath="//button[@id=\"addNewContact1\"]")
	WebElement Submit_Contact;

/*--------------------------------------------Documentation-End---------------------------------------------------*/
	
/*---------------------------------------------AML-----------------------------------------------------------------*/
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement OK;
	
	@FindBy(xpath="//div[@class=\"col-md-12 pl-4\"]//following::button[3]")
	WebElement SaveandNextforAML;
/*-----------------------------------------------AMLEnd-----------------------------------------------------------*/	
	
	
/*------------------------------------------------Pay to Play----------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_01_Radio\"]")
	WebElement PayToPlayOneYes;
	@FindBy(xpath="//div[@class=\"col-md-5 KycPlaytopayplacementplacementTextOne display-block\"]//following::input[1]")
	WebElement OneTextBox;
	
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_02_Radio\"]")
	WebElement PayToPlayOneNo;
	
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_03_Radio\"]")
	WebElement PayToPlaytwoYes;
	
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_04_Radio\"]")
	WebElement PayToPlaytwoNo;
	
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_05_Radio\"]")
	WebElement PayToPlayThreeYes;
	@FindBy(xpath="//div[@class=\"col-md-5 KycPlaytopayplacementplacementTextTwo display-block\"]//following::input[1]")
	WebElement ThreeBox;
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_06_Radio\"]")
	WebElement PayToPlayThreeNo;
	
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_07_Radio\"]")
	WebElement PayToPlayFourYes;
	@FindBy(xpath="//div[@class=\"col-md-5 KycPlaytopayplacementplacementTextThree display-block\"]//following::input[1]")
	WebElement FourBox;
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_08_Radio\"]")
	WebElement PayToPlayFourNo;
	
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_09_Radio\"]")
	WebElement PayToPlayFiveYes;
	@FindBy(xpath="//label[@for=\"paytoPlayInformation_10_Radio\"]")
	WebElement PayToPlayFiveNo;
	
	@FindBy(xpath="//div[@class=\"custom-checkbox pb-5 pl-4\"]//following::button[1]")
	WebElement SaveandNextforPayToPlay;
	
/*-------------------------------------------------Pay To Play End-----------------------------------------------------------------------------------------------------*/	
	
/*-------------------------------------------------AuthorizedSignatory Contacts-----------------------------------------------------------------------------------------------------*/	
	@FindBy(xpath="//input[@type=\"number\"]")
	WebElement RequiredSignatory;
	
	@FindBy(xpath="//label[@for=\"signatureTypeDocuSignORp_one\"]")
	WebElement Docusign;
	
	@FindBy(xpath="//label[@for=\"signatureTypePhysicalorp_one\"]")
	WebElement Physicalsign;
	
	@FindBy(xpath="//button[contains(text(),' Create New Contact ')]")
	WebElement CreateNewContact;
	
	@FindBy(xpath="//input[@id=\"firstname\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@id=\"lastname\"]")
	WebElement Lastname;
	@FindBy(xpath="//input[@id=\"title\"]")
	WebElement JobTitle;
	@FindBy(xpath="//input[@id=\"companyContacts\"]")
	WebElement Company;
	
	@FindBy(xpath="//input[@id=\"middlename\"]")
	WebElement Middlename;
	@FindBy(xpath="//input[@id=\"cellPhoneContacts\"]")
	WebElement cellphonecontacts;
	@FindBy(xpath="//input[@id=\"workPhone\"]")
	WebElement workPhonecontacts;
	@FindBy(xpath="//input[@id=\"directEmail\"]")
	WebElement directEmailcontacts;
	@FindBy(xpath="//input[@id=\"addressLineOneContacts\"]")
	WebElement addressLineOneContacts;
	
	@FindBy(xpath="//input[@id=\"cityContacts\"]")
	WebElement cityContacts;
	@FindBy(xpath="//input[@id=\"zipCodeContacts\"]")
	WebElement zipCodeContacts;

	@FindBy(xpath="//input[@name=\"evidence_319\"]")
	WebElement AuthorizationEvidence;
	@FindBy(xpath="//input[@name=\"evidence_320\"]")
	WebElement IdentificationEvidence;
	
	@FindBy(xpath="//div[@class=\"form-group col-md-3 datapicker-com-parent\"]//following::input[1]")
	WebElement Expiry_date;
	
	@FindBy(xpath="//div[@class=\"col-12 pl-0\"]//following::button[1]")
	WebElement SubmitForAuthorizedSignatory;
	
/*-------------------------------------------------AuthorizedSignatory Contacts End-----------------------------------------------------------------------------------------------------*/	
	File DocumentationFile = new File ("./TestData/LP.pdf");
	
	
	
	AMLKYCandAuthorizedSignatory amlKycPage;
	
	public AMLKYCandAuthorizedSignatory() 
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

	public void KYCProcess() throws Exception 					// KYC , Documentation, AML, Pay To Play, Authoriized Signatory
	{
		excelutils.setExcelFile(ExcelFilePath, "Sheet2");
		Thread.sleep(2000);
		int rownumber = excelutils.CountRow(ExcelFilePath, "Sheet2");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id=\"aml_kyc_and_authorized_signatories_subsection\"]//following::li[@id=\"kyc_selector\"]")).click();
		Thread.sleep(2000);
			
		if (FirstRadiobuttonNo.isSelected()) 
			{
				ScrollPageforradiobutton();
				ScrollPageforSavebutton();
				SaveAndNextforAMLKYC.click();
			}
			else 
			{
				for (int rowcount=1;rowcount<=rownumber;rowcount++) {
				
					String FirstRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println("First Radio button value is : "+ FirstRadioValue);
					if(FirstRadioValue.equals("No")) 
					{
						FirstRadiobuttonNo.click();
						System.out.println("clicking No");
					}
					else 
					{
						FirstRadiobuttonYes.click();
						System.out.println("click yes");
					}
					
					String SecondRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(SecondRadioValue.equals("No")) 
					{
						SecondRadiobuttonNo.click();
					}
					else 
					{
						SecondRadiobuttonYes.click();
					}
					ScrollPageforradiobutton();
					String ThirdRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(ThirdRadioValue.equals("No")) 
					{
						ThirdRadiobuttonNo.click();
					}
					else 
					{
						ThirdRadiobuttonYes.click();
					}
					String FourthRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(FourthRadioValue.equals("No")) 
					{
						FourthRadiobuttonNo.click();
					}
					else 
					{
						FourthRadiobuttonYes.click();
					}
					String FifthRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(FifthRadioValue.equals("No")) 
					{
						FifthRadiobuttonNo.click();
					}
					else 
					{
						FifthRadiobuttonYes.click();
					}
					ScrollPageforradiobutton();
					String SixthRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(SixthRadioValue.equals("No")) 
					{
						SixthRadiobuttonNo.click();
					}
					else 
					{
						SixthRadiobuttonYes.click();
					}
					String SeventhRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(SeventhRadioValue.equals("No")) 
					{
						SeventhRadiobuttonNo.click();
					}
					else 
					{
						SeventhRadiobuttonYes.click();
					}
					String EighthRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(EighthRadioValue.equals("No")) 
					{
						EighthRadiobuttonNo.click();
					}
					else 
					{
						EighthRadiobuttonYes.click();
					}
					ScrollPageforradiobutton();
					String NinethRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(NinethRadioValue.equals("No")) 
					{
						NinethRadiobuttonNo.click();
					}
					else 
					{
						NinethRadiobuttonYes.click();
					}
					String TenthRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(TenthRadioValue.equals("No")) 
					{
						TenthRadiobuttonNo.click();
					}
					else 
					{
						TenthRadiobuttonYes.click();
					}
					
					ScrollPageforradiobutton();
					String EleventhRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					if(EleventhRadioValue.equals("No")) 
					{
						EleventhRadiobuttonNo.click();
					}
					else 
					{
						EleventhRadiobuttonYes.click();
					}
					
					String TwelthRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(TwelthRadioValue);
					if(TwelthRadioValue.equals("No")) 
					{
						TwelthRadiobuttonNo.click();
						Thread.sleep(2000);
						driver.findElement(By.id("wiringBankExaplanation")).sendKeys("Twelth Question is No");
					}
					else 
					{
						TwelthRadiobuttonYes.click();
					}
					String ThirteenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(ThirteenRadioValue);
					if(ThirteenRadioValue.equals("No")) 
					{
						ThirteenRadiobuttonNo.click();
					}
					else 
					{
						ThirteenRadiobuttonYes.click();
					}
					
					ScrollPageforradiobutton();
					String FourteenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(FourteenRadioValue);
					if(FourteenRadioValue.equals("No")) 
					{
						FourteenRadiobuttonNo.click();
					}
					else 
					{
						FourteenRadiobuttonYes.click();
					}
					String FifteenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(FifteenRadioValue);
					if(FifteenRadioValue.equals("No")) 
					{
						FifteenRadiobuttonNo.click();
					}
					else 
					{
						FifteenRadiobuttonYes.click();
					}
					String SixteenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(SixteenRadioValue);
					if(SixteenRadioValue.equals("No")) 
					{
						SixteenRadiobuttonNo.click();
					}
					else 
					{
						SixteenRadiobuttonYes.click();
					}
					ScrollPageforradiobutton();
					String SeventeenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(SeventeenRadioValue);
					if(SeventeenRadioValue.equals("No")) 
					{
						SeventeenRadiobuttonNo.click();
					}
					else 
					{
						SeventeenRadiobuttonYes.click();
					}
					
					String EighteenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(EighteenRadioValue);
					if(EighteenRadioValue.equals("No")) 
					{
						EighteenRadiobuttonNo.click();
					}
					else 
					{
						EighteenRadiobuttonYes.click();
					}
					String NineteenRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 1);
					System.out.println(NineteenRadioValue);
					if(NineteenRadioValue.equals("No")) 
					{
						NineteenRadiobuttonNo.click();
					}
					else 
					{
						NineeenRadiobuttonYes.click();
					}
	
					ScrollPageforradiobutton();
					ScrollPageforSavebutton();
					SaveAndNextforAMLKYC.click();
				}
			}
		}
	
	public void DocumentationProcess() throws Exception
	{
		
		CompanyListOfCurrentdirectors.click();
		String Window = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		
		IncorporationCertificateandConstitutionalDocuments.click();
		String Window1 = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		
		CompanyRegistryExtract.click();
		String Window2 = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		
		FullOwnershipDetails.click();
		String Window3 = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		
		IdentificationDocumentsDirectorsorTrusteesorOwners.click();
		String Window4 = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		
//		WebElement datewidget = driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]//following::tbody"));
//		datewidget.click();
		driver.findElement(By.xpath("//input[@id=\"dateSignedlegalFormOfWirey\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("expiryDatelegalFormOfWirey")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		ScrollPageforradiobutton();
		ScrollPageforradiobutton();
		CopyofForeignBankCertification.click();
		String Window5 = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		
		AddAdditionalForms.click();
		String Window6 = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Addfile.sendKeys(DocumentationFile.getAbsolutePath());
		Document_Type.sendKeys("Additional Document");
		
		SubmitDocument.click();
		Thread.sleep(20000);
		driver.switchTo().parentFrame();
		ScrollPageforSavebutton();
		SaveandNextforDocumentation.click();
		}
	
		public void amlProcess() throws Exception
		{
			
			String window = driver.getWindowHandle();
			driver.switchTo().window(window);
			OK.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//p[@class=\"text-large\"]")).click();
			Thread.sleep(2000);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE); 					// Question 1 radio button
			
	        robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE); 					// Question 2 Check-box button
			
	       
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE); 					// Question 3 radio button
	        
	       	robot.keyPress(KeyEvent.VK_TAB);
	    	robot.keyRelease(KeyEvent.VK_TAB);
	    	robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	    	robot.keyRelease(KeyEvent.VK_SPACE); 					// Question 4 Check-box button
	        
	    	
	    	robot.keyPress(KeyEvent.VK_TAB);
	    	robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE);					// Question 5 Check-box button
	        
	        
	        robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE);					// Question 6 Check-box button
	        
	        
	        robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE);					// Question 7 Check-box button
	        
	        Thread.sleep(2000);
	        SaveandNextforAML.click();
		}
		
		public void PayToPlay() throws Exception 
		{
			excelutils.setExcelFile(ExcelFilePath, "Sheet2");
			Thread.sleep(2000);
			int rownumber = excelutils.CountRow(ExcelFilePath, "Sheet2");
			for (int rowcount=1;rowcount<=rownumber;rowcount++) 
			{
				
				String PaytoPlayFirstRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 2);
				 if(PaytoPlayFirstRadioValue.equals("Yes")) 
				 {
					 PayToPlayOneYes.click();
					 Thread.sleep(1000);
					 OneTextBox.sendKeys("Pay To Play Question 1 is selected as Yes");
				 }
				 else 
				 {
					 PayToPlayOneNo.click();
				 }
					Thread.sleep(2000);
				 String PaytoPlaySecondRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 2);
				 if(PaytoPlaySecondRadioValue.equals("Yes")) 
				 {
					 PayToPlaytwoYes.click();
				 }
				 else 
				 {
					 PayToPlaytwoNo.click();
				 }
					Thread.sleep(2000);
					String PaytoPlayThreeRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 2);
					 if(PaytoPlayThreeRadioValue.equals("Yes")) 
					 {
						 PayToPlayThreeYes.click();
						 Thread.sleep(1000);
						 ThreeBox.sendKeys("Pay To Play Question 3 is selected as Yes");
					 }
					 else 
					 {
						 PayToPlayThreeNo.click();
					 }
						Thread.sleep(2000);
					 String PaytoPlayFourRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 2);
					 if(PaytoPlayFourRadioValue.equals("Yes")) 
						 {
							 PayToPlayFourYes.click();
							 Thread.sleep(1000);
							 FourBox.sendKeys("Pay To Play Question 4 is selected as Yes");
						 }
					 else 
						 {
							 PayToPlayFourNo.click();
						 }
						Thread.sleep(2000);
					 String PaytoPlayFiveRadioValue = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 2);
					 if(PaytoPlayFiveRadioValue.equals("Yes")) 
						 {
							 PayToPlayFiveYes.click();
						 }
					 else 
						 {
							 PayToPlayFiveNo.click();
						 }
					  
			}
			Thread.sleep(2000);
			SaveandNextforPayToPlay.click();
			
		}
		
		public SubScriptionInformation AuthorizedSignatory() throws Exception
		{
			RequiredSignatory.sendKeys("1");
			Thread.sleep(1000);
			Physicalsign.click();
			ScrollPageforSavebutton();
			CreateNewContact.click();
			String Window = driver.getWindowHandle();
			driver.switchTo().window(Window);
			
			excelutils.setExcelFile(ExcelFilePath, "Sheet2");
			Thread.sleep(2000);
			int rownumber = excelutils.CountRow(ExcelFilePath, "Sheet2");
			
			
			for (int rowcount=1;rowcount<=rownumber;rowcount++) 
			{
				String Firstnamestring = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 3);
				String MiddlleNamestring = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 4);
				String Lastnamestring = excelutils.cellData(ExcelFilePath, "Sheet2", rowcount, 5);
				String Jobtitle = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 6);
				String WorkPhonecontacts = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 7);
				String CellPhonecontacts = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 8);
				String DirectEmail = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 9);
				String AddressLine1 = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 10);
//				String AddressLine2 = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 10);			
//				String State = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber,11);
//				String Country = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber,12);
				String Province = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 11);
				String PostalCode = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 12);
				String Window1 = driver.getWindowHandle();
				driver.switchTo().window(Window1);	
				Thread.sleep(2000);
				Firstname.sendKeys(Firstnamestring);
				Thread.sleep(1000);
				Middlename.sendKeys(MiddlleNamestring);
				Thread.sleep(1000);
				Lastname.sendKeys(Lastnamestring);
				Thread.sleep(1000);
				JobTitle.sendKeys(Jobtitle);
				Thread.sleep(1000);
				
				WebElement mySelector = driver.findElement(By.xpath("//label[contains(text(),'Cell Phone')]//following::div[2]"));
				List<WebElement> myElements = driver.findElements(By.tagName("li"));
				for(WebElement e : myElements) {
				  
					String searchText = "India";
					if (e.getText().contains(searchText))
				    {
				        e.click(); // click the desired option
				        break;
				    }
				  
				}
				cellphonecontacts.sendKeys(CellPhonecontacts);
				Thread.sleep(1000);
				workPhonecontacts.sendKeys(WorkPhonecontacts);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id=\"companyContacts\"]")).sendKeys("Company is selected here");
				Thread.sleep(1000);
				Random rand = new Random();
		        // Generate random integers in range 0 to 999 
		        int rand_int1 = rand.nextInt(1000);
				directEmailcontacts.sendKeys(DirectEmail + rand_int1 + "@yopmail.com");
				Thread.sleep(2000);
				addressLineOneContacts.sendKeys(AddressLine1);
				Thread.sleep(2000);
				ScrollPageforSavebutton();
				Thread.sleep(2000);
				Select seelctCountry = new Select(driver.findElement(By.id("countryContacts")));
				Thread.sleep(2000);
				seelctCountry.selectByVisibleText("India");
				Thread.sleep(2000);
				Select seelctState = new Select(driver.findElement(By.id("stateContacts")));
				Thread.sleep(2000);
				seelctState.selectByVisibleText("Karnataka");
				Thread.sleep(2000);
				
				String Window2 = driver.getWindowHandle();
				driver.switchTo().window(Window2);	
				Thread.sleep(2000);
				ScrollPageforSavebutton();
				
				Thread.sleep(2000);
				cityContacts.sendKeys(Province);
				Thread.sleep(2000);
				zipCodeContacts.sendKeys(PostalCode);
				Thread.sleep(2000);	
				AuthorizationEvidence.sendKeys(DocumentationFile.getAbsolutePath());
				Thread.sleep(2000);
				IdentificationEvidence.sendKeys(DocumentationFile.getAbsolutePath());
				Thread.sleep(2000);
				Expiry_date.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
				Thread.sleep(2000);
				Submit_Contact.click();
				Thread.sleep(50000);				
				driver.switchTo().parentFrame();
				driver.findElement(By.xpath("//button[@class=\"btn btn-orp-search border-radius-0\"]")).click();
				
				Robot robot = new Robot();
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
				robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
		        robot.keyRelease(KeyEvent.VK_SPACE);
		        Thread.sleep(1000);
		        SubmitForAuthorizedSignatory.click();
		        Thread.sleep(1000);
			}
			return new SubScriptionInformation();
			
		}

	
	
}
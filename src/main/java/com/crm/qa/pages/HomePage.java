//package com.crm.qa.pages;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.crm.qa.util.TestUtil;
//import com.crm.qa.util.excelutils;
//import com.crm.qa.base.TestBase;
//
//public class HomePage extends TestBase {
//	TestUtil testUtil;
//	public static Robot robot;
//	
//	/*------------------------------------------------------Proceed To Dashboard Start --------------------------------------------------*/
//
//	@FindBy(xpath="//div[@class=\"col-sm-6 text-right\"]//following::button")
//	WebElement ProceedToDahbaoard_button;
//
//	/*------------------------------------------------------Dashboard buttons Start --------------------------------------------------*/
//
//	@FindBy(xpath="//button[@class=\"btn btn-orp-pending width-33 ng-binding ng-scope\"]")
//	WebElement Pending_button;
//	
//	@FindBy(xpath="//button[@class=\"btn btn-orp-subscribe width-33\"]")
//	WebElement Subscribe_button;
//	
//	@FindBy(xpath="//td[@class=\"ng-binding\" and contains(text(),\"594\")] //following::i[1]")
//	WebElement EditFirstEntity_button;
//	
//	@FindBy(xpath="//div[@class=\"text-center pb-5 pt-4\"]//following::button[contains(text(),\"Add New Legal Entity\")]")
//	WebElement AddNewEntity_button;
//
//	
//	@FindBy(id="select2-entityListsSubscribeSelect-container")
//	WebElement DropdownforSubscribe;
//	
//	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
//	WebElement searchkeys;
//	
//	@FindBy(xpath="//div[@class=\"text-center pb-5 pt-4\"]//following::button[contains(text(),\"Initiate\")]")
//	WebElement Intiate_button;
//	/*-----------------------------------------------------------------SaveAndNextf7orLE-KYC---------------------------------------------------------------------------*/
//	@FindBy(xpath="//span[contains(text(),\"Save & Next\")]")
//	WebElement SaveAndNextforLE;
//	
//	@FindBy(xpath="//div[@class=\"col-md-12 form-group ml-3 mb-2\"]//following::button")
//	WebElement SaveAndNextforAMLKYC;
//	
//	@FindBy(xpath="//button[@class=\"ORPsendNextFilesBtn sendFilesActionButton ml-2 mb-3 pull-right ng-scope ladda-button\"]//following::span")
//	WebElement SaveAndNextforDocumentation;
//	/*-----------------------------------------------------------------SaveAndNextf7orLE-KYC---------------------------------------------------------------------------*/
//
//		
//	/*--------------------------------------------------------RadiobuttonsforLE-KYC-Documentation---------------------------------------------------------------------------*/
//	
//	@FindBy(xpath="//p[contains(text(),'Incorporation Certificate and constitutional documents ')]//following::u")
//	WebElement IncorporationCertificateandconstitutionaldocuments;
//
//	@FindBy(xpath="//p[contains(text(),'Company Registry Extract ')]//following::u")
//	WebElement CompanyRegistryExtract;
//	
//	@FindBy(xpath="//p[contains(text(),'Company current list of Directors ')]//following::u")
//	WebElement CompanycurrentlistofDirectors;
//	
//	@FindBy(xpath="//p[contains(text(),'Full Ownership Details ')]//following::u")
//	WebElement FullOwnershipDetails;
//	
//	@FindBy(xpath="//p[contains(text(),'Evidence of Authority ')]//following::u")
//	WebElement EvidenceofAuthority;
//	
//	@FindBy(xpath="//p[contains(text(),'Identification documents - Directors or Trustees or Owners')]//following::u")
//	WebElement IdentificationDocuments;
//	
//	/*-----------------------------------------------------------Question11-19logic------------------------------------------------------------------------*/
//	@FindBy(xpath="//p[contains(text(),'Identification Documents - Signatory ')]//following::u")
//	WebElement IdentificationDocumentsSignatory;
//	
//	@FindBy(xpath="//p[contains(text(),'Copy of Foreign Bank Certification ')]//following::u")
//	WebElement CopyofForeignBankCertification;
//	
//	/*-----------------------------------------------------------Question11-19logic------------------------------------------------------------------------*/	
//	/*-----------------------------------------------------------DateofSigningandExpity------------------------------------------------------------------------*/	
//	@FindBy(xpath="//input[@class=\"form-control addNewDocumentsForKYCAuthorizedPopORPFile\"]")
//	WebElement Addfile;
//	@FindBy(xpath="//button[contains(text(),\"Submit Document\")]")
//	WebElement SubmitDocument;
//	/*-----------------------------------------------------------DateofSigningandExpity------------------------------------------------------------------------*/	
//	
//	@FindBy(xpath="//div[@class=\"pt-2 pb-1\"]//following::button[@class=\"btn btn-orp-pending width-33 ng-binding ng-scope\"]")
//	WebElement Pending;
//	
//	
//	
//	@FindBy(xpath="//button[contains(text(),\"Ok\")]")
//	WebElement Okbutton;
//	
//	@FindBy(xpath="//label[@class=\"custom-control-label pb-2\"]//preceding-sibling::input[@id=\"kycRepresentations_01_Radio\"]")
//	WebElement Radiobutton1;
//	
//	
//	/*------------------------------------------------------------------------------------------------------------------------------------------------------------*/
//	
//	
//	@FindBy(xpath="//a[contains(text(),\"Contacts\")]")
//	WebElement Contacts;
//	
//	@FindBy(xpath="//div[@class=\"col-md-6 text-right\"]//following::button[contains(text(),' Create New Contact ')]")
//	WebElement CreatenewContacts;
//	
//	@FindBy(xpath="//input[@id=\"firstname\"]")
//	WebElement Firstname;
//	
//	@FindBy(xpath="//input[@id=\"lastname\"]")
//	WebElement Lastname;
//	@FindBy(xpath="//input[@id=\"title\"]")
//	WebElement JobTitle;
//	@FindBy(xpath="//input[@id=\"companyContacts\"]")
//	WebElement Company;
//	
//	@FindBy(xpath="//input[@id=\"middlename\"]")
//	WebElement Middlename;
//	@FindBy(xpath="//input[@id=\"cellPhoneContacts\"]")
//	WebElement cellphonecontacts;
//	@FindBy(xpath="//input[@id=\"workPhone\"]")
//	WebElement workPhonecontacts;
//	@FindBy(xpath="//input[@id=\"directEmail\"]")
//	WebElement directEmailcontacts;
//	@FindBy(xpath="//input[@id=\"addressLineOneContacts\"]")
//	WebElement addressLineOneContacts;
//	
//	@FindBy(xpath="//input[@id=\"cityContacts\"]")
//	WebElement cityContacts;
//	@FindBy(xpath="//input[@id=\"zipCodeContacts\"]")
//	WebElement zipCodeContacts;
//	
//	String ExcelFilePath = "C://Users/hp/Desktop/Book.xlsx";
//	
////	Select CountryContacts = new Select(driver.findElement(By.id("countryContacts")));
////	Select StateContacts = new Select(driver.findElement(By.id("stateContacts")));
//	
//
//		
//	
//	
//	
//	// Initializing the Page Objects:
//	public HomePage() {
//		PageFactory.initElements(driver, this);
//	}
//	public static void ScrollPageforSavebutton() throws Exception 
//	{
//		JavascriptExecutor jsx = (JavascriptExecutor)driver;
//		jsx.executeScript("window.scrollBy(0,450)", "");
//		Thread.sleep(2000);
//	}
//	public static void ScrollPageforradiobutton() throws Exception 
//	{
//		JavascriptExecutor jsx = (JavascriptExecutor)driver;
//		jsx.executeScript("window.scrollBy(0,100)", "");
//		Thread.sleep(2000);
//	}
//	public DashboardPage ProceedToDashboardclick() 
//	{
//		ProceedToDahbaoard_button.click();
//		return new DashboardPage();
//	}	
//	public void AddNewEntity() 
//	{
//		AddNewEntity_button.click();	
//	}
//	public void subscribeClick() throws Exception 
//	{
//		Subscribe_button.click();
//		String window = driver.getWindowHandle();
//		driver.switchTo().window(window);
//		Thread.sleep(1000);
//	}
//	public void PendingButtonClick() throws Exception 
//	{
//		Thread.sleep(5000);
//		Pending_button.click();
//		String window = driver.getWindowHandle();
//		driver.switchTo().window(window);
//		Thread.sleep(1000);
//	}
//	public void SubscribeOldEntity() throws Exception
//	{
//		DropdownforSubscribe.click();
//		searchkeys.sendKeys("google");
//		searchkeys.sendKeys(Keys.RETURN);
//		Intiate_button.click();
//		Thread.sleep(2000);
//		String Window1 = driver.getWindowHandle();
//		driver.switchTo().window(Window1);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
//		Thread.sleep(4000);
//	}
//	public String verifyHomePageTitle(){
//		return driver.getTitle();
//	}
//	public void SaveNextClick() throws Exception
//	{
//		Thread.sleep(2000);
//		SaveAndNextforLE.click();
//		Thread.sleep(3000);
//	}
//	public void editFirstEntityinScreen() throws Exception
//	{
//		Thread.sleep(3000);
//		String Window = driver.getWindowHandle();
//		driver.switchTo().window(Window);	
//		Thread.sleep(2000);
//		EditFirstEntity_button.click();
//		Thread.sleep(10000);
//	}
//public void LegalEntityProcess() throws Exception
//	{
//		if(driver.findElement(By.xpath("//a[@id=\"orpDashboLegalEntityInformationLists\"]//following::span[@title=\"Section has been submitted to KKR\"]")).isDisplayed()) 
//		{
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@id=\"orpDashboLegalEntityInformationLists\"]//following::span[@title=\"Section has been submitted to KKR\"]")).click();
//			ScrollPageforradiobutton();
//			Thread.sleep(2000);
//			ScrollPageforSavebutton();
//			driver.findElement(By.xpath("//div[@class=\"text-right pt-3\"]//following::button[2]")).click();
//		}
//		else 
//		{
//			driver.findElement(By.id("investorLegalName")).sendKeys("Jatt Di Automation");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[contains(text(),'Legal form of entity')]//following::span[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.className("select2-search__field")).sendKeys("General");
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[@for=\"domicileOfTheEntityWhichGenerally\"]//following::span[1]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.className("select2-search__field")).sendKeys("Canada");
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[@for=\"juricdictionEntityorganized \"]//following::span[1]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.className("select2-search__field")).sendKeys("Canada");
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
//			Thread.sleep(2000);
//			ScrollPageforradiobutton();
//			driver.findElement(By.id("adressStreetAptParmentsLineOne")).sendKeys("Address Line One");
//			Thread.sleep(2000);
//			driver.findElement(By.id("adressStreetAptParmentsLineTwo")).sendKeys("Address Line Two");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[@for=\"adressParamentsCountry\"]//following::span[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys("Canada");
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//label[@for=\"adressParamentsStateOrProvince\"]//following::span[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys("Ontario");
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
//			Thread.sleep(2000);
//			driver.findElement(By.id("adressParamentsCityOrTown")).sendKeys("Ontario ki city");
//			Thread.sleep(2000);
//			driver.findElement(By.id("adressParamentsPostalcode")).sendKeys("2500002");
//			Thread.sleep(2000);
//			ScrollPageforradiobutton();
////			driver.findElement(By.xpath("//label[@for=\"adressParamentsStateOrProvince\"]")).click();
//			Thread.sleep(2000);
//			robot = new Robot();
//			// Simulate key Events
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//			
//			driver.findElement(By.xpath("//label[contains(text(),'Classification of the Entity')]//following::span[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys("Private Fund");
//			Thread.sleep(2000);
//			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
//			
//			driver.findElement(By.xpath("//div[@class=\"text-right pt-3\"]//following::button[2]")).click();
//			
//		}
//	
//	}				//LE process
//public void AMLKYCProcess() throws Exception 					// KYC , Documentation, AML, Pay To Play, Authoriized Signatory
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//ul[@id=\"aml_kyc_and_authorized_signatories_subsection\"]//following::li[@id=\"kyc_selector\"]")).click();
//		Thread.sleep(1000);
//			
//		if (FirstRadiobuttonNo.isEnabled()) 
//			{
//				ScrollPageforradiobutton();
//				ScrollPageforSavebutton();
//				SaveAndNextforAMLKYC.click();
//			}
//			else 
//			{
//				FirstRadiobuttonNo.click();
//				SecondRadiobuttonNo.click();
//				ScrollPageforradiobutton();
//				ThirdRadiobuttonNo.click();
//				FourthRadiobuttonNo.click();
//				FifthRadiobuttonNo.click();
//				ScrollPageforradiobutton();
//				SixthRadiobuttonNo.click();
//				SeventhRadiobuttonNo.click();
//				EighthRadiobuttonNo.click();
//				ScrollPageforradiobutton();
//				NinethRadiobuttonNo.click();
//				TenthRadiobuttonYes.click();
//				ScrollPageforradiobutton();
//				ScrollPageforSavebutton();
//				SaveAndNextforAMLKYC.click();
//			}
//			
//			// KYC to Documentation
//			
////			driver.findElement(By.partialLinkText(".pdf")).isDisplayed()
//		int abc = driver.findElements(By.xpath("//p[contains(text(),'Company List of Current Directors ')]//following::td[1]")).size();
//		System.out.println("abc is : " + abc);
//		
//			if(driver.findElements(By.xpath("//p[contains(text(),'Company List of Current Directors ')]//following::td[1]")).size() < 0) 
//			{
//				 ScrollPageforSavebutton();						// Scroll till bottom
//				 SaveAndNextforDocumentation.click();			// Save and Next clicked 
//				 Thread.sleep(4000);	
//			}
//			
//			else {
//			ScrollPageforSavebutton();
//			ScrollPageforSavebutton();
//			if(driver.findElement(By.xpath("//button[contains(text(),' Add Previously Uploaded Documents')]")).isDisplayed())
//			{
//				driver.findElement(By.xpath("//p[contains(text(),' Previously Uploaded Documents ')]//following::p[contains(text(),'Company List of Current Directors')]//following::label[1]")).click();
//			}
//			else {
//			driver.findElement(By.xpath("//p[contains(text(),'Copy of Foreign Bank Certification ')]//following::a[1]")).click();
//			String Window = driver.getWindowHandle();
//			driver.switchTo().window(Window);
//			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
//			SubmitDocument.click();
//			Thread.sleep(20000);
//			driver.switchTo().parentFrame();
//			
//			driver.findElement(By.xpath("//p[contains(text(),'Full Ownership Details ')]//following::a[1]")).click();
//			driver.switchTo().window(Window);
//			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
//			SubmitDocument.click();
//			Thread.sleep(20000);
//			driver.switchTo().parentFrame();
//
//			driver.findElement(By.xpath("//p[contains(text(),'Company Registry Extract ')]//following::a[1]")).click();
//			driver.switchTo().window(Window);
//			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
//			SubmitDocument.click();
//			Thread.sleep(20000);
//			driver.switchTo().parentFrame();
//			
//			driver.findElement(By.xpath("//p[contains(text(),'Incorporation Certificate and constitutional documents ')]//following::a[1]")).click();
//			driver.switchTo().window(Window);
//			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
//			SubmitDocument.click();
//			Thread.sleep(20000);
//			driver.switchTo().parentFrame();
//			
//			ScrollPageforradiobutton();
//			driver.findElement(By.xpath("//p[contains(text(),'Company List of Current Directors ')]//following::a[1]")).click();
//			driver.switchTo().window(Window);
//			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
//			SubmitDocument.click();
//			Thread.sleep(20000);
//			driver.switchTo().parentFrame();
//			
//			}
//			driver.findElement(By.xpath("//p[@class=\"text-large mb-2 font-weight-700\"]")).click();
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//	        robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//	        robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//	        robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//	        
//	        robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//
//	        robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//			
//	        robot.keyPress(KeyEvent.VK_TAB);
//	        robot.keyRelease(KeyEvent.VK_TAB);
//	        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//	        
//	        robot.keyPress(KeyEvent.VK_TAB);
//	        robot.keyRelease(KeyEvent.VK_TAB);
//	        robot.keyPress(KeyEvent.VK_TAB);
//	        robot.keyRelease(KeyEvent.VK_TAB);
//
//	        robot.keyPress(KeyEvent.VK_TAB);
//	        robot.keyRelease(KeyEvent.VK_TAB);
//	        robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
//	        robot.keyRelease(KeyEvent.VK_SPACE);
//			
////			EvidenceofAuthority.click();							//field deleted as its present in the Authorized Signatory Contact
////			driver.switchTo().window(Window);
////			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
////			SubmitDocument.click();
////			Thread.sleep(20000);
////			driver.switchTo().parentFrame();
//			
////			IdentificationDocuments.click();						// have to add expiry date mandation
////			driver.switchTo().window(Window);
////			Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
////			SubmitDocument.click();
////			Thread.sleep(20000);
////			driver.switchTo().parentFrame();
////			 
////			 ScrollPageforradiobutton();							// field deleted as its present in the Authorized Signatory Contact
////			 IdentificationDocumentsSignatory.click();
////			 driver.switchTo().window(Window);
////			 Addfile.sendKeys("C:\\Users\\hp\\Desktop\\LP.pdf");
////			 SubmitDocument.click();
////			 Thread.sleep(20000);
////			 driver.switchTo().parentFrame();
////			 
////			 ScrollPageforSavebutton();
////			 SaveAndNextforDocumentation.click();
////			 Thread.sleep(4000); 											// Done with documentation
////			 
////			 String Window1 = driver.getWindowHandle();
////			 driver.switchTo().window(Window1);
////			 driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
////			 driver.switchTo().parentFrame();
////			 
//			 
//			 
//			 
//			 
//			}			
//		}	 
//	
//	public void EditEntty() throws Exception 
//	{
//		
//		Contacts.click();
//		Thread.sleep(5000);
//		ScrollPageforSavebutton();
//		CreatenewContacts.click();
//		Thread.sleep(1000);
//	
//
////		JobTitle.sendKeys(prop.getProperty("JobTitle1"));
////		Company.sendKeys(prop.getProperty("Company"));
////		cellphonecontacts.sendKeys(prop.getProperty("CellPhone"));
////		workPhonecontacts.sendKeys(prop.getProperty("WorkPhone"));
////		directEmailcontacts.sendKeys(prop.getProperty("DirectEmail"));
////		addressLineOneContacts.sendKeys(prop.getProperty("AddressLineOne"));
////		Select Country = new Select(driver.findElement(By.id("countryContacts")));
////		Country.selectByVisibleText("Saint Barthélemy");
////		Thread.sleep(50000);
//		
//		excelutils.setExcelFile(ExcelFilePath, "Sheet1");
//		Thread.sleep(2000);
//		int rownumber = excelutils.CountRow(ExcelFilePath, "Sheet1");
//		
//		
//		for (int rowcount=1;rowcount<=rownumber;rowcount++) 
//		{
//			String Firstnamestring = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 0);
//			String MiddlleNamestring = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 1);
//			String Lastnamestring = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 2);
//			String Jobtitle = excelutils.cellData(ExcelFilePath, "Sheet 1", rownumber, 3);
//			String WorkPhonecontacts = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 4);
//			String CellPhonecontacts = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 5);
//			String DirectEmail = excelutils.cellData(ExcelFilePath, "Seet1", rownumber, 13);
//			String AddressLine1 = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 6);
//			String AddressLine2 = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 7);			
//			String State = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 8);
//			String Country = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 9);
//			String Province = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 10);
//			String PostalCode = excelutils.cellData(ExcelFilePath, "Sheet1", rownumber, 11);
//			String Window1 = driver.getWindowHandle();
//			driver.switchTo().window(Window1);	
//			Thread.sleep(2000);
//			
//			Thread.sleep(3000);
//			Firstname.sendKeys(Firstnamestring);
//			Thread.sleep(2000);
//			Middlename.sendKeys(MiddlleNamestring);
//			Thread.sleep(2000);
//			Lastname.sendKeys(Lastnamestring);
//			Thread.sleep(2000);
//			JobTitle.sendKeys(Jobtitle);
//			Thread.sleep(2000);
//			workPhonecontacts.sendKeys(WorkPhonecontacts);
//			Thread.sleep(2000);
//			cellphonecontacts.sendKeys(CellPhonecontacts);
//			Thread.sleep(2000);
//			directEmailcontacts.sendKeys(DirectEmail);
//			Thread.sleep(2000);
//			addressLineOneContacts.sendKeys(AddressLine1);
//			Thread.sleep(2000);
//			ScrollPageforSavebutton();
//			Thread.sleep(2000);
//			Select seelctCountry = new Select(driver.findElement(By.xpath("//select[@class=\"form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched\"]")));
//			Thread.sleep(2000);
//			seelctCountry.selectByVisibleText("India");
//			Thread.sleep(2000);
//			Select seelctState = new Select(driver.findElement(By.xpath("//select[@class=\"form-control ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required\" and @id=\"stateContacts\"]")));
//			Thread.sleep(2000);
//			seelctCountry.selectByVisibleText("Karnataka");
//			Thread.sleep(2000);
//			ScrollPageforSavebutton();
//			Thread.sleep(2000);
//			cityContacts.sendKeys(Province);
//			Thread.sleep(2000);
//			zipCodeContacts.sendKeys(PostalCode);
//			Thread.sleep(2000);
//			
//			
//			
//			
//				
//		}
//		
//
//	}
//
//}

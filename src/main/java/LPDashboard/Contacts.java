package LPDashboard;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Contacts extends TestBase {
	Contacts contact;
	String ExcelFilePath = "./TestData/TestData.xlsx";
	@FindBy(xpath="//div[@class='col-md-8 text-right']//button[@class='btn btn-orp-pending width-150px ml-2 createContactORpDashPages ng-scope'][contains(text(),'Create New Contact')]")
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
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement ContactSideMenu;
	
	@FindBy(xpath="//button[@id=\"addNewContact1\"]")
	WebElement Submit_Contact;
	public Contacts() 
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
	public void AddContact() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
		ScrollPageforradiobutton();
		ScrollPageforSavebutton();
		Thread.sleep(35000);
		
		try {
			CreateNewContact.click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
//			String AddressLine2 = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 10);			
//			String State = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber,11);
//			String Country = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber,12);
			String Province = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 11);
			String PostalCode = excelutils.cellData(ExcelFilePath, "Sheet2", rownumber, 12);
			String Window1 = driver.getWindowHandle();
			driver.switchTo().window(Window1);	
			Thread.sleep(2000);
			
			Thread.sleep(3000);
			Firstname.sendKeys(Firstnamestring);
			Thread.sleep(2000);
			Middlename.sendKeys(MiddlleNamestring);
			Thread.sleep(2000);
			Lastname.sendKeys(Lastnamestring);
			Thread.sleep(2000);
			JobTitle.sendKeys(Jobtitle);
			Thread.sleep(2000);
			
//			WebElement mySelector = driver.findElement(By.xpath("//label[contains(text(),'Cell Phone')]//following::div[2]"));
//		
//			List<WebElement> myElements = driver.findElements(By.tagName("li"));
//			for(WebElement e : myElements) {
//			  
//				String searchText = "India";
//				if (e.getText().contains(searchText))
//			    {
//			        e.click(); // click the desired option
//			        break;
//			    }
//			  
//			}
			driver.findElement(By.xpath("//input[@id=\"companyContacts\"]")).sendKeys("Company is selected here");
			workPhonecontacts.sendKeys(WorkPhonecontacts);
			Thread.sleep(2000);
			cellphonecontacts.sendKeys(CellPhonecontacts);
			Thread.sleep(2000);
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
//			AuthorizationEvidence.sendKeys("C://Users/hp/Desktop/LP.pdf");
//			Thread.sleep(2000);
//			IdentificationEvidence.sendKeys("C://Users/hp/Desktop/LP.pdf");
//			Thread.sleep(1000);
//			driver.switchTo().parentFrame();
//			
//			Expiry_date.click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//td[@class=\"day\" and contains(text(),'25')]")).click();
//			Thread.sleep(1000);
			
			Submit_Contact.click();
			Thread.sleep(1000);
		}
	

	}
	public Signature contactSubmit() throws Exception 
	{
		ScrollPageforradiobutton();
		ScrollPageforradiobutton();
		driver.findElement(By.xpath("//td[contains(text(),' Investment  Decision Maker ')]")).click();
		
		for (int i = 0;i<=13;i++) {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		}
		ScrollPageforradiobutton();
		ScrollPageforSavebutton();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-orp-pending width-125px ml-2 mb-3 pull-right ng-scope ladda-button\"]")).click();
		
		return new Signature();
	}

}

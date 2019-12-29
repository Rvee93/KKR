package LPDashboard;

import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
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
public class Wire extends TestBase {

	@FindBy(xpath="//a[contains(text(),'Wire')]")
	WebElement WireSideMenu;
	@FindBy(xpath="//button[@title=\"Add New  Wire \"]")
	WebElement AddNewWirebutton;
	@FindBy(xpath="//input[@id=\"wiringBank\"]")
	WebElement WireBank;
	@FindBy(xpath="//input[@id=\"accountName\"]")
	WebElement WireAccountName;
	@FindBy(xpath="//input[@id=\"accountNumber\"]")
	WebElement WireAccountNumber;
	@FindBy(xpath="//input[@id=\"aBANumber\"]")
	WebElement WireFEDAbaNumber;
	@FindBy(xpath="//input[@id=\"swiftNumber\"]")
	WebElement WireSwiftNumber;
	@FindBy(xpath="//input[@id=\"orpRWireAttention\"]")
	WebElement WireAttantion;
	@FindBy(xpath="//input[@id=\"oRPRwireIBAN\"]")
	WebElement Wire_IBAN;
	@FindBy(xpath="//input[@id=\"forFurtherCreditAccountName\"]")
	WebElement WireCorrespondentAccountName;
	@FindBy(xpath="//input[@id=\"forFurtherCreditAccountNumber\"]")
	WebElement WireCorrespondentAccountNumber;
	@FindBy(xpath="//input[@id=\"uSCorrespondentBankName\"]")
	WebElement WireCorrespondentBankName;
	@FindBy(xpath="//input[@id=\"uSCorrespondentBankRoutingNumber\"]")
	WebElement WireCorrespondentBankRoutingNumber;
	
	@FindBy(xpath="//input[@id=\"additionalWireInformation\"]")
	WebElement Wire_AdditionalInformation;
	Robot robot;
	SubScriptionInformation subscriptionInformation;
	String ExcelFilePath = "./TestData/TestData.xlsx";
	
	public Wire()  
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
	
	public Tax WireCheck() throws Exception
	{
		WireSideMenu.click();
		Thread.sleep(2000);
		ScrollPageforSavebutton();
		Thread.sleep(1000);
		AddNewWirebutton.click();
		Thread.sleep(1000);
		String Window = driver.getWindowHandle();
		driver.switchTo().window(Window);
		Thread.sleep(1000);
		excelutils.setExcelFile(ExcelFilePath, "Sheet3");
		Thread.sleep(2000);
		int rownumber = excelutils.CountRow(ExcelFilePath, "Sheet3");
		
		
		for (int rowcount=1;rowcount<=rownumber;rowcount++) 
		{
			String WireBankName = excelutils.cellData(ExcelFilePath, "Sheet3", rowcount, 0);
			String AccountName = excelutils.cellData(ExcelFilePath, "Sheet3", rowcount, 1);
			String AccountNumber = excelutils.cellData(ExcelFilePath, "Sheet3", rowcount, 2);			
		
		Thread.sleep(1000);
		WireBank.sendKeys(WireBankName);
		Thread.sleep(1000);
		WireAccountName.sendKeys(AccountName);
		Thread.sleep(1000);
		WireAccountNumber.sendKeys(AccountNumber);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"form-control margin-three-left ng-pristine ng-untouched ng-valid ng-empty\"]")).sendKeys("Rishu Singh Gill");
		Thread.sleep(200);
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
        robot.keyRelease(KeyEvent.VK_SPACE);				//-------------Select first contaaact after search
		Thread.sleep(1000);
		ScrollPageforSavebutton();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-orp-pending width-100px ml-2 scrollToErrorTopCommonClass ladda-button\"]")).click();
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		ScrollPageforSavebutton();
		driver.findElement(By.xpath("//button[@class=\"btn btn-orp-pending width-125px ml-2 mb-3 pull-right mt-3 ng-scope ladda-button\"]")).click();
		Thread.sleep(20000);
		}
		
		
		return new Tax();
	}
	
}

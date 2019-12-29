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


public class Tax extends TestBase {
	
	/*--------------------------------- Tax Contact Page--------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="//button[@class=\"ORPsendNextFilesBtn sendFilesActionButton ml-2 mb-3 pull-right ng-scope\"]")
	WebElement SaveandNextbuttonforTaxContact;
	/*----------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	/*----------------------------------------------------------------------Tax Form Page-----------------------------------------------------------------*/
	@FindBy(xpath="//span[@class=\"select2-selection select2-selection--single\"]/following::span[contains(text(),'Select IRS Form')]")
	WebElement TaxFormSelect;
	@FindBy(xpath="//button[@class=\"btn btn-orp-pending width-100px uploadSeletedISRforMFiles\"]")
	WebElement UploadButton;
	@FindBy(xpath="//div[@class=\"col-md-6 form-group mb-5\"]//following::button[1]")
	WebElement SaveandNextforTaxForms;
/*	------------------------------------------------------------------------------------------------------------------------------------------------------*/
	@FindBy(xpath="//b[contains(text(),'Note that: ')]//following::button[1]")
	WebElement OK_button;
	
	Robot robot;
	
	public Tax()  
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
	
	public void taxContact() throws  Exception
	{
	ScrollPageforradiobutton();
	ScrollPageforSavebutton();
	Thread.sleep(1000);
	SaveandNextbuttonforTaxContact.click();
	Thread.sleep(3000);
	}
	
	public void TaxForms() throws Exception 
	{
		ScrollPageforradiobutton();
		ScrollPageforSavebutton();
//		Thread.sleep(1000);
//		TaxFormSelect.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("W-8BEN");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys(Keys.RETURN);
//		Thread.sleep(2000);
//		UploadButton.click();
//		
//		String window = driver.getWindowHandle();
//		driver.switchTo().window(window);
//		Thread.sleep(1000);
//		File DocumentationFile = new File ("./TestData/LP.pdf");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@class=\"form-control addNewDocumentsForKYCAuthorizedPopORPFile\"]")).sendKeys(DocumentationFile.getAbsolutePath());
//		Thread.sleep(1000);
//		driver.findElement(By.id("dateSignedlegalFormOfWirey")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("expiryDatelegalFormOfWirey")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//td[@class=\"today day\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@class=\"btn btn-orp-pending width-125px ml-2 addNewDocumentsForKYCAuthorizedPopOrpSubmitBtn\"]")).click();
//		Thread.sleep(1000);
//		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		ScrollPageforSavebutton();
		Thread.sleep(1000);
		SaveandNextforTaxForms.click();
		Thread.sleep(3000);
	}
	
	public void TaxSelfCertForm() throws Exception 
	{
		Thread.sleep(1000);
		String Window1 = driver.getWindowHandle();
		driver.switchTo().window(Window1);
		Thread.sleep(2000);
		OK_button.click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for=\"country_Incorporation_Organization\"]//following::span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("United Arab Emirates");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		ScrollPageforradiobutton();
		ScrollPageforradiobutton();
		ScrollPageforradiobutton();
		ScrollPageforradiobutton();
		
		driver.findElement(By.xpath("//label[@for=\"jurisdiction\"]//following::span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys("United Arab Emirates");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"select2-search__field\"]")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		driver.findElement(By.id("tax_reference_number_type")).sendKeys("UAETRNT1");
		Thread.sleep(1000);
		driver.findElement(By.id("tax_Identification_Number")).sendKeys("UAETIN1");
		Thread.sleep(1000);
		
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		
		Thread.sleep(1000);
		driver.findElement(By.id("specify_the_reason_for_non-availability_of_TIN")).sendKeys("NATIN1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for=\"confirmation_of_sole_residency_0\"]")).click();
		Thread.sleep(1000);
		
		ScrollPageforradiobutton();
		driver.findElement(By.xpath("//label[@for=\"taxKKR_09_Radio\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for=\"activeNonfinancialEntityGovernmentalEntity_Radio\"]")).click();
		Thread.sleep(1000);
		ScrollPageforradiobutton();
		ScrollPageforSavebutton();
		driver.findElement(By.xpath("//label[@for=\"Power_of_attorney_checkBox\"]//following::button[1]")).click();
		Thread.sleep(3000);
	}
	
	public Contacts TaxSignature() throws Exception 
	{
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary checkTaxDoc GenerateSubDoc pl-2 pr-2 mr-2 minWidth150px\"]")).click();
		Thread.sleep(150000);
		driver.findElement(By.xpath("//a[@class=\"formDownloadLink btn btn-primary text-white width-100px\"]")).click();
		
		Thread.sleep(1000);
		ScrollPageforradiobutton();
		File Document = new File("./TestData/Tax.pdf");
		driver.findElement(By.xpath("//input[@class=\"form-control pb-2\"]")).sendKeys(Document.getAbsolutePath());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"submitSendFilesBtns sendFilesActionButton ml-2 mb-3 pull-right ng-scope ladda-button\"]")).click();
		Thread.sleep(30000);
		return new Contacts();
	}
	
	
	
}

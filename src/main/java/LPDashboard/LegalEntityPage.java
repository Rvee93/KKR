package LPDashboard;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;

import com.crm.qa.util.excelutils;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LegalEntityPage extends TestBase {
	
	public static Robot robot;
	String ExcelFilePath = "./TestData/TestData.xlsx";
	/*------------------------------------------------------Proceed To Dashboard Start --------------------------------------------------*/

	@FindBy(xpath="//div[@class=\"col-sm-6 text-right\"]//following::button")
	WebElement ProceedToDahbaoard_button;

	/*------------------------------------------------------Dashboard buttons Start --------------------------------------------------*/

	@FindBy(xpath="//button[@class=\"btn btn-orp-pending width-33 ng-binding ng-scope\"]")
	WebElement Pending_button;
	
	@FindBy(xpath="//button[@class=\"btn btn-orp-subscribe width-33\"]")
	WebElement Subscribe_button;
	
	@FindBy(xpath="//td[@class=\"ng-binding\" and contains(text(),\"594\")] //following::i[1]")
	WebElement EditFirstEntity_button;
	
	@FindBy(xpath="//div[@class=\"text-center pb-5 pt-4\"]//following::button[contains(text(),\"Add New Legal Entity\")]")
	WebElement AddNewEntity_button;

	
	@FindBy(id="select2-entityListsSubscribeSelect-container")
	WebElement DropdownforSubscribe;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	WebElement searchkeys;
	
	@FindBy(xpath="//div[@class=\"text-center pb-5 pt-4\"]//following::button[contains(text(),\"Initiate\")]")
	WebElement Intiate_button;
	/*---------------------------------------------------Dashboard------------------------------------------------------------*/
	
	/*-----------------------------------------------------------------SaveAndNextf7orLE-KYC---------------------------------------------------------------------------*/
	@FindBy(xpath="//span[contains(text(),\"Save & Next\")]")
	WebElement SaveAndNextforLE;
	/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	public LegalEntityPage()
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
	
	public DashboardPage ProceedToDashboardclick() 
	{
		ProceedToDahbaoard_button.click();
		return new DashboardPage();
	}	

	public void subscribeClick() throws Exception 
	{
		Thread.sleep(5000);
		Subscribe_button.click();
		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		Thread.sleep(1000);
	}
	public void AddNewEntity() 
	{
		AddNewEntity_button.click();	
	}
	public void PendingButtonClick() throws Exception 
	{
		Thread.sleep(5000);
		Pending_button.click();
		String window = driver.getWindowHandle();
		driver.switchTo().window(window);
		Thread.sleep(1000);
	}
	public void SubscribeOldEntity() throws Exception
	{
		DropdownforSubscribe.click();
		searchkeys.sendKeys("google");
		searchkeys.sendKeys(Keys.RETURN);
		Intiate_button.click();
		Thread.sleep(2000);
		String Window1 = driver.getWindowHandle();
		driver.switchTo().window(Window1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(4000);
	}
	public void SaveNextClick() throws Exception
	{
		Thread.sleep(2000);
		SaveAndNextforLE.click();
		Thread.sleep(3000);
	}
	public void editFirstEntityinScreen() throws Exception
	{
		Thread.sleep(3000);
		String Window = driver.getWindowHandle();
		driver.switchTo().window(Window);	
		Thread.sleep(2000);
		EditFirstEntity_button.click();
		Thread.sleep(10000);
	}
public AMLKYCandAuthorizedSignatory LegalEntityProcess() throws Exception
	{
	
	excelutils.setExcelFile(ExcelFilePath, "Sheet1");
	Thread.sleep(2000);
	int rownumber = excelutils.CountRow(ExcelFilePath, "Sheet1");
	
		driver.findElement(By.xpath("//a[contains(text(),'Legal Entity Selection')]")).click();
		Thread.sleep(3000);
		if(1==2) 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Legal Entity Selection')]")).click();
			ScrollPageforradiobutton();
			Thread.sleep(2000);
			ScrollPageforSavebutton();
			driver.findElement(By.xpath("//div[@class=\"text-right pt-3\"]//following::button[2]")).click();
		}
		else 
		{
			for (int rowcount=1;rowcount<=rownumber;rowcount	 ++) {
			String NameofLegalEntity = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 0);
			Thread.sleep(1000);
//			int a = (int) Math.random();
			
			Random rand = new Random();
	        // Generate random integers in range 0 to 999 
	        int rand_int1 = rand.nextInt(1000);
			
			System.out.println("The value if a is : " +rand_int1);
			driver.findElement(By.id("investorLegalName")).sendKeys(NameofLegalEntity+" - "+rand_int1);
			Thread.sleep(2000);
			
			String LegalFormofentity = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 1);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[contains(text(),'Legal form of entity')]//following::span[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(LegalFormofentity);
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			
			String Other = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 2);
			 Thread.sleep(1000);
			
			String Trust = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 3);
			Thread.sleep(1000);
			
			String Domicile = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 4);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@for=\"domicileOfTheEntityWhichGenerally\"]//following::span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Domicile);
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			
			String Jurisdiction = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 5);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@for=\"juricdictionEntityorganized \"]//following::span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Jurisdiction);
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			ScrollPageforradiobutton();
			
			String RegistereedOfficeAddressline1 = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 6);
			Thread.sleep(1000);
			driver.findElement(By.id("adressStreetAptParmentsLineOne")).sendKeys(RegistereedOfficeAddressline1);
			Thread.sleep(1000);
			
			String RegistereedOfficeAddressline2 = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 7);
			Thread.sleep(1000);
			driver.findElement(By.id("adressStreetAptParmentsLineTwo")).sendKeys(RegistereedOfficeAddressline2);
			Thread.sleep(1000);
			
			String RegisteredOfficeCountry = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 8);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@for=\"adressParamentsCountry\"]//following::span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(RegisteredOfficeCountry);
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			
			String RegisteredOfficeStateorProvince = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 9);
			Thread.sleep(1000);
			Select RegisteredStateorProvince = new Select(driver.findElement(By.xpath("//select[@id=\"adressParamentsStateOrProvince\"]")));
			Thread.sleep(1000);
			RegisteredStateorProvince.selectByVisibleText(RegisteredOfficeStateorProvince);
			Thread.sleep(1000);
			
			String RegisteredOfficeCityorTown = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 10);
			Thread.sleep(1000);
			driver.findElement(By.id("adressParamentsCityOrTown")).sendKeys(RegisteredOfficeCityorTown);
			Thread.sleep(1000);
			
			
			String RegisteredOfficePostalCode = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 11);
			Thread.sleep(1000);
			driver.findElement(By.id("adressParamentsPostalcode")).sendKeys(RegisteredOfficePostalCode);
			Thread.sleep(1000);
			ScrollPageforradiobutton();
			
			String AddressOfPrincipalPlaceofBusinessAddressLine1 = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount,12);
			Thread.sleep(1000);
			
			String AddressOfPrincipalPlaceofBusinessAddressLine2 = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 13);
			Thread.sleep(1000);
			
			String AddressOfPrincipalPlaceofBusinessCountry = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 14);
			Thread.sleep(1000);
			
			String AddressOfPrincipalPlaceofBusinessStateorProvince = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 15);
			Thread.sleep(1000);
			
			String AddressOfPrincipalPlaceofBusinessCityortown = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 16);
			Thread.sleep(1000);
			
			String AddressOfPrincipalPlaceofBusinessPostalCode = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 17);
			
			
			Thread.sleep(2000);
			robot = new Robot();
			// Simulate key Events
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_SPACE); //fire spacebar event
	        robot.keyRelease(KeyEvent.VK_SPACE);
			
			String ClassificationofEntity = excelutils.cellData(ExcelFilePath, "Sheet1", rowcount, 18);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[contains(text(),'Classification of the Entity')]//following::span[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(ClassificationofEntity);
			Thread.sleep(1000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.RETURN);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class=\"btn btn-orp-pending width-125px ml-2 mb-3 scrollToErrorTopCommonClass ng-scope ladda-button\"]")).click();
			Thread.sleep(3000);
			
			Boolean SameEntity = driver.findElement(By.xpath("//button[@class=\"btn btn-primary width-125px ml-2 mb-3 mt-2\" and contains(text(),'Yes')]")).isDisplayed();
			if(SameEntity.equals("true")) 
			{
				String window = driver.getWindowHandle();
				 driver.switchTo().window(window);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class=\"btn btn-primary width-125px ml-2 mb-3 mt-2\" and contains(text(),'Yes')]")).click();
				driver.switchTo().parentFrame();
				Thread.sleep(1000);
				ScrollPageforradiobutton();
				ScrollPageforSavebutton();
				driver.findElement(By.xpath("//button[@class=\"btn btn-orp-pending width-125px ml-2 mb-3 scrollToErrorTopCommonClass ng-scope ladda-button\"]")).click();
				Thread.sleep(3000);
			}
			
			else 
			{
				break;
			}
			
			}
			
		}
		return new AMLKYCandAuthorizedSignatory();
	
	}					
}

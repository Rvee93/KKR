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
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import com.crm.qa.util.excelutils;
public class Signature extends TestBase {
	//Page Factory - OR:
		@FindBy(xpath="//input[@class=\"login_btn\"]")
		WebElement Sign_In;														// User-name
		
		@FindBy(xpath="//input[@name=\"email\"]")
		WebElement Useremail;
		
		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement UserPassword;
		
		@FindBy(xpath="//input[@class=\"login_btn\"]")
		WebElement Login_Btn;
	public Signature() 
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
	public static void VerticalScrollPageforEditbutton() throws Exception 
	{
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("", "window.scrollBy(300,0)");
		Thread.sleep(2000);
	}
	

	public void SubmittheEntity(String CounselUsernameHere, String CounselPasswordHere,String url) throws Exception 
	{
		
		driver.navigate().to("https://login.onepaperlane.com/users/logout");
		Thread.sleep(5000);
		driver.get(url);
		Thread.sleep(1000);
		Useremail.sendKeys(CounselUsernameHere);
		
		Sign_In.click();
		
		UserPassword.sendKeys(CounselPasswordHere);
		Thread.sleep(2000);
		Login_Btn.click();
		Thread.sleep(30000);
	}
	
	public void ApproveSubscriptionInformation() throws Exception 
	{
		driver.findElement(By.xpath("//th[contains(text(),'Legal Entity Selection')]")).click();
		Thread.sleep(1000);
		VerticalScrollPageforEditbutton();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[contains(text(),'Subscription Information')]")).click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		
		Thread.sleep(1000);
		String ActionPopUp = driver.getWindowHandle();
		driver.switchTo().window(ActionPopUp);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[contains(text(),'Action Required')]//following::button[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		for(int i=0;i<4;i++) 
				{		
				ScrollPageforSavebutton();
				}
		driver.findElement(By.xpath("//button[contains(text(),'Add New Form')]//following::button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"col-md-12 pt-3\"]//following::button[1]")).click();
//		driver.findElement(By.xpath("//div[@class=\"col-md-12 pt-3\"]//following::button[2]")).click();			// rework click
		Thread.sleep(2000);
		String ConfirmationPopup = driver.getWindowHandle();
		driver.switchTo().window(ConfirmationPopup);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Are you sure you want to approve this section?')]//following::button[1]")).click(); 	// yes click
//		driver.findElement(By.xpath("//p[contains(text(),'Are you sure you want to approve this section?')]//following::button[2]")).click(); 	// yes click
		Thread.sleep(5000);
		driver.get(prop.getProperty("DashboardLink"));
		Thread.sleep(10000);
		VerticalScrollPageforEditbutton();
		VerticalScrollPageforEditbutton();
		Select closedate = new Select(driver.findElement(By.xpath("//select[@class=\"form-control ng-pristine ng-valid ng-empty ng-touched\"]")));
		closedate.selectByValue("09/30/2019");
		Thread.sleep(5000);
		VerticalScrollPageforEditbutton();
		VerticalScrollPageforEditbutton();
		VerticalScrollPageforEditbutton();
		VerticalScrollPageforEditbutton();
		driver.findElement(By.xpath("//th[contains(text(),'Submit for ')]//following::button[1]")).click();
		Thread.sleep(3000);
	}
	
	public void ReworkSubscriptionInformation() throws Exception 
	{
		driver.findElement(By.xpath("//th[contains(text(),'Legal Entity Selection')]")).click();
		Thread.sleep(1000);
		VerticalScrollPageforEditbutton();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[contains(text(),'Subscription Information')]")).click();
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		
		Thread.sleep(1000);
		String ActionPopUp = driver.getWindowHandle();
		driver.switchTo().window(ActionPopUp);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[contains(text(),'Action Required')]//following::button[2]")).click();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		for(int i=0;i<4;i++) 
				{		
				ScrollPageforSavebutton();
				}
		driver.findElement(By.xpath("//button[contains(text(),'Add New Form')]//following::button[1]")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class=\"col-md-12 pt-3\"]//following::button[1]")).click();
		driver.findElement(By.xpath("//div[@class=\"col-md-12 pt-3\"]//following::button[2]")).click();			// rework click
		Thread.sleep(2000);
		String ConfirmationPopup = driver.getWindowHandle();
		driver.switchTo().window(ConfirmationPopup);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Are you sure you want to approve this section?')]//following::button[1]")).click(); 	// yes click
//		driver.findElement(By.xpath("//p[contains(text(),'Are you sure you want to approve this section?')]//following::button[2]")).click(); 	// yes click
		Thread.sleep(5000);
		driver.get(prop.getProperty("DashboardLink"));
		Thread.sleep(10000);
	}	
	
}

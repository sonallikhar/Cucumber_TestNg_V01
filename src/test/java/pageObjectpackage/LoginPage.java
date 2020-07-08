package pageObjectpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitypackage.TestBase;
import utilitypackage.TestUtil;

public class LoginPage extends TestBase{
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="createAccountSubmit")
	WebElement createaccount;
	@FindBy(id="ap_email")
	WebElement userid;
	@FindBy(id="continue")
	WebElement Continue;
	@FindBy(id="ap_password")
	WebElement pass;
	@FindBy(id="signInSubmit")
	WebElement login;
	
	@FindBy(xpath="//*[@id='auth-email-missing-alert']/div/div")
	WebElement errormsguid;
	@FindBy(xpath="//*[@id='auth-password-missing-alert']/div/div")
	WebElement errormsgpass;
	@FindBy(xpath="//*[@class='a-alert-content']/ul/li")
	WebElement errormsg;
	@FindBy(xpath="//span[normalize-space(text())='Your password is incorrect']")
	WebElement errorpass;
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public void enterUserid(String id)
	{
		userid.clear();
		userid.sendKeys(id);
	}
	public void clickcontinue()
	{
		Continue.click();
	}
	public void enterPassword(String password)
	{
		pass.clear();
		pass.sendKeys(password);
	}
	public void clickLogin()
	{
		login.click();
	}
	public void clickcreateaccount()
	{
		createaccount.click();
	}
	public String ErrormsgUserid()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String x=errormsguid.getText();
		return x;
		
	}
	public String ErrormsgPass()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String x=errormsgpass.getText();
		return x;	
	}
	public String Errormsg()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String x=errormsg.getText();
		return x;
	}
	public String ErrorPassword()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String x=errorpass.getText();
		return x;
	}

}

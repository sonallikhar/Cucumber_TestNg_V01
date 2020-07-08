package pageObjectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilitypackage.TestBase;

public class CreateAccountPage extends TestBase{
	public CreateAccountPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber;
	@FindBy(id="ap_customer_name")
	WebElement custname;
	@FindBy(id="ap_email")
	WebElement email;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="continue")
	WebElement continuee;
	
	public void clickcontinue()
	{
		continuee.click();
	}
	public void enterpassword(String pass)
	{
		password.clear();
		password.sendKeys(pass);
	}
	public void enteremail(String emailid)
	{
		email.clear();
		email.sendKeys(emailid);
	}
	public void entermonum(String number)
	{
		mobilenumber.clear();
		mobilenumber.sendKeys(number);
		
	}
	public void entercustname(String name)
	{
		custname.clear();
		custname.sendKeys(name);
	}
	
}

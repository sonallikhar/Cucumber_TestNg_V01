package pageObjectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitypackage.TestBase;

public class ProfilePage extends TestBase {

	public ProfilePage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id='a-page']/div[2]/div/div[2]/div[2]/child::*")
	WebElement loginsecurity;
	
	@FindBy(id="auth-cnep-edit-name-button")
	WebElement editname;
	
	@FindBy(id="ap_customer_name")
	WebElement customername;
	@FindBy(id="cnep_1C_submit_button")
	WebElement savechange;
	@FindBy(xpath="//*[text()='Success']")
	WebElement sucessmsg;
	public String successmsg()
	{
		String x= sucessmsg.getText();
		return x;
		
	}
	public void clicksavechanges()
	{
		savechange.click();
	}
	public void editcustname(String name)
	{
		customername.clear();
		customername.sendKeys(name);	
	}
	public void clickeditname()
	{
		editname.click();
	}
	public void clickonloginsecurity()
	{
		loginsecurity.click();
	}
	
}

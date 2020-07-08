package pageObjectpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitypackage.TestBase;
import utilitypackage.TestUtil;

public class HomePage extends TestBase {
	public HomePage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(id="nav-cart")
	WebElement cart;
	@FindBy(id="nav-link-accountList")
	WebElement signin;
	@FindBy(id="nav-item-signout")
	WebElement logout;
	@FindBy(xpath="//*[text()='Hello, Sonal']")
	WebElement usernamelable;
	
	@FindBy(xpath="(//*[text()='Mobiles'])[1]")
	WebElement mobilelink;
	@FindBy(xpath="//*[@class='a-size-small a-color-base s-ref-text-link s-ref-link-cursor'and text()='Samsung']")
	WebElement samsungmobile;
	@FindBy(xpath="//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[5]")
	WebElement textsamsung;
	
	@FindBy(xpath="//*[@id='p_36/1318503031']/span/a/span")
	WebElement priceunder;
	@FindBy(xpath="//*[@id='search']/span/div/span/h1/div/div[1]/div/div/span[6]")
	WebElement pricegettext;
	
	@FindBy(xpath="//*[@id='p_36/1318504031']/span/a/span")
	WebElement pricethtofiveth;
	
	@FindBy(xpath="//*[@id='p_36/1318505031']/span/a/span")
	WebElement pricefivethtotenth;
	
	@FindBy(xpath="//*[@id='p_36/1318507031']/span/a/span")
	WebElement priceabovetwentyth;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	@FindBy(xpath="//*[@type='submit']")
	WebElement searchbutton;
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	WebElement youraccount;
	public void clickoncart()
	{
		cart.click();	
	}
	public void clickyouraccount()
	{
		youraccount.click();
	}
	public void clickonsearch()
	{
		searchbutton.click();
	}
	public void sendtexttosearch(String text)
	{
		searchbox.clear();
		searchbox.sendKeys(text);
		
	}
	public boolean verifyusername()
	{
		return usernamelable.isDisplayed();
	}
	public String verifyHomePageTitle()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		String x=driver.getTitle();
		return x;
	}
	public void clickSignin()
	{
		signin.click();
	}
	public void clicklogout()
	{
		Actions a= new Actions(driver);
		a.moveToElement(signin).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", logout);
		//logout.click();
	}
	
	public void clickonmobilelink()
	{
		mobilelink.click();
	}
	public void clickonsamsung()
	{
		samsungmobile.click();
	}
	public String gettextsamsung()
	{
		return textsamsung.getText();
	}
	public void priceunder1000()
	{
		priceunder.click();
	}
	public void priceabovetwentyth()
	{
		priceabovetwentyth.click();
	}
	public void pricefivethtotenth()
	{
		pricefivethtotenth.click();
	}
	public void pricethtofiveth()
	{
		pricethtofiveth.click();
	}
	public String pricegettext()
	{
		String x=pricegettext.getText();
		return x;
	}

}

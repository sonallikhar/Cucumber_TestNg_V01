package pageObjectpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilitypackage.TestBase;
import utilitypackage.TestUtil;

public class CartPage extends TestBase {
	public CartPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="a-autoid-0-announce")
	WebElement firstcartselection;
	@FindBy(id="a-autoid-2-announce")
	WebElement secoundcartselection;
	@FindBy(id="dropdown2_2")
	WebElement select2;
	@FindBy(id="dropdown1_2")
	WebElement select1;
	@FindBy(id="//*[@type='submit']")
	WebElement delete;
	
	public void quantityfirst()
	{
		firstcartselection.click();
		select1.click();
		driver.navigate().refresh();
	}
	public void quantitysecound()
	{
		secoundcartselection.click();
		select2.click();
	}
	public void deleteeight()
	{
	for(int i=10;i>=3;i--)
	{
		try {
			WebElement we=driver.findElement(By.xpath("(//*[@type='submit' and @value='Delete'])["+i+"]"));
			TestBase.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='submit' and @value='Delete'])["+i+"]")));
			we.click();
			driver.navigate().refresh();
		} catch (Exception e) {
			System.out.println("======"+e);
		}
		
	}
	}

}

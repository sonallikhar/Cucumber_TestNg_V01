package pageObjectpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilitypackage.TestBase;

public class MobilePage extends TestBase {

	public int j;
	public MobilePage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[text()='Samsung Galaxy A31 (Prism Crush Blue, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']")
	WebElement m31mobile;
	
	@FindBy(id="buy-now-button")
	WebElement buynow;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;
	@FindBy(id="WLHUC_viewlist")
	WebElement viewwishlist;
	@FindBy(xpath="(//a[normalize-space(text())='Add to Cart'])[1]")
	WebElement addtocart;
	@FindBy(xpath="//*[text()='Added to Cart']")
	WebElement addtocartmsg;
	@FindBy(xpath="//*[@id='sc-item-Cfeb6b508-bea7-4a5c-98cf-cfa2a74c85b3']/div[4]/div/div[1]/div/div/div[2]/div/div/div[2]/ul/li[1]/span/a/span[1]")
	WebElement itemtocart;
	public String itemtocart()
	{
		String x=itemtocart.getText();
		return x;
	}
	public String addtocartmsg()
	{
		String x=addtocartmsg.getText();
		return x;
	}
	public void clickaddtocart() throws InterruptedException
	{
		Thread.sleep(2000);
		addtocart.click();
	}
	
	public void clickviewwishlist()
	{
		viewwishlist.click();
	}
	public void clickwishlist()
	{
		wishlist.click();
	}
	public void mobilephonedetails()
	{
		try{
	File f=new File("MobileDetails.csv");
	if(!f.exists()){
		f.createNewFile();
	FileWriter fw= new FileWriter(f,true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("Mobile Name,Price,Display size,Storage,RAM,Brand"+"\n");
	bw.close();
	}
	List<WebElement> welist=driver.findElements(By.xpath("//*[text()='4.2 out of 5 stars']"));
	
	for(int i=1;i<=welist.size();i++)
	{
	//int j=i;
	FileWriter fw= new FileWriter(f,true);
	BufferedWriter bw=new BufferedWriter(fw);
	String MobileName=driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])["+i+"]")).getText();
	String price=driver.findElement(By.xpath("(//*[@class='a-price-whole'])["+i+"]")).getText();
	String Displaysize=driver.findElement(By.xpath("(//*[@class='sg-col-0-of-12 sg-col-4-of-16 sg-col-2-of-36 sg-col-2-of-28 sg-col sg-col-2-of-32 sg-col-2-of-24 sg-col-2-of-20'])["+i+"]")).getText();
	j=i+1;
	String Storage=driver.findElement(By.xpath("(//*[@class='sg-col-0-of-12 sg-col-4-of-16 sg-col-2-of-36 sg-col-2-of-28 sg-col sg-col-2-of-32 sg-col-2-of-24 sg-col-2-of-20'])["+j+"]")).getText();
	j=i+2;
	String Ram=driver.findElement(By.xpath("(//*[@class='sg-col-0-of-12 sg-col-4-of-16 sg-col-2-of-36 sg-col-2-of-28 sg-col sg-col-2-of-32 sg-col-2-of-24 sg-col-2-of-20'])["+j+"]")).getText();
	j=i+3;
	String Brand=driver.findElement(By.xpath("(//*[@class='sg-col-0-of-12 sg-col-4-of-16 sg-col-2-of-36 sg-col-2-of-28 sg-col sg-col-2-of-32 sg-col-2-of-24 sg-col-2-of-20'])["+j+"]")).getText();
	bw.write(MobileName.replace(",", "")+","+price.replace(",", "")+","+Displaysize.replace(",", "")+","+Storage.replace(",", "")+","+Ram.replace(",", "")+","+Brand.replace(",", "")+"\n");
	j=i+3;
	bw.close();
	}
	
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
	public void clickonm31mobile()
	{
		m31mobile.click();
	}
	
	public void addtocarttenmobile() throws InterruptedException
	{
		String wins=driver.getWindowHandle();
		for(int i=2;i<=11;i++)
		{
			driver.navigate().refresh();
			WebElement e=driver.findElement(By.xpath("(//*[contains(text(),'Samsung Galaxy')])["+i+"]"));
			TestBase.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Samsung Galaxy')])["+i+"]")));
			/*JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", e);*/
			e.click();
			Thread.sleep(2000);
			switchwindow();
			driver.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(2000);
			/*if(driver.findElement(By.id("attach-close_sideSheet-link")).isDisplayed())
			{
				driver.findElement(By.id("attach-close_sideSheet-link")).click();
			}*/
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(wins);
			driver.navigate().refresh();
			Thread.sleep(2000);
		}
	}
	public void switchwindow() throws InterruptedException
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
		driver.switchTo().window(handle);
		 }
		 Thread.sleep(2000);
	}
	public String switchwindowtobuy() throws InterruptedException
	{
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
		driver.switchTo().window(handle);
		 }
		 Thread.sleep(2000);
		 String x=driver.getTitle();
		return x;	 	 
	}
	public void clickbuynow()
	{
		buynow.click();
	}
}

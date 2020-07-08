package utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

public class TestBase {

	//public static RemoteWebDriver driver;
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger=TestBase.getLogger(TestBase.class);
	public static WebDriverWait wait;
	public TestBase(){
		try{
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//config.properties");
			prop.load(fis);
		}catch(Exception e){
			e.getMessage();
		}
	}
	public static void initialization() throws MalformedURLException
	{
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browsername.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}else if(browsername.equals("IE"))
		{
			DesiredCapabilities caps =DesiredCapabilities.internetExplorer();
			caps.setCapability("nativeEvents", false);    
			caps.setCapability("unexpectedAlertBehaviour", "accept");
			caps.setCapability("ignoreProtectedModeSettings", true);
			caps.setCapability("disable-popup-blocking", true);
			caps.setCapability("enablePersistentHover", true);
			caps.setCapability("ie.ensureCleanSession", true);
			//ieCapabilities.setCapability("ie.ensureCleanSession", true);
			/*caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			caps.setCapability("nativeEvents", false);
			caps.setCapability("ignoreProtectedModeSettings", true);
			caps.setCapability("enablePersistentHover", true);
			caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			caps.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, UnexpectedAlertBehaviour.IGNORE);
			caps.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE);
			*/System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers/IEDriverServer.exe");
		
	
			driver = new InternetExplorerDriver(caps);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	public static void failed(String Actual,String expected)
	{
		
		if(expected.equalsIgnoreCase(Actual)){
		try{
			logger.info("******Pass:Validate actual and expected *******");
		String fileName = new SimpleDateFormat("MM_dd_yyyy_hhmmss").format(new Date());
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"/Screenshots/Pass/Pass"+fileName+".png");
		FileUtils.copyFile(srcfile, dest);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}else
		{
			try{
				logger.info("******Fail:Validate actual and expected *******");
			String fileName = new SimpleDateFormat("MM_dd_yyyy_hhmmss").format(new Date());
			File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File(System.getProperty("user.dir")+"/Screenshots/Fail/Fail"+fileName+".png");
			FileUtils.copyFile(srcfile, dest);
			driver.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static boolean root=false;
	public static Logger getLogger(Class cls)
	{
		if(root)
		{
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root=true;
		return Logger.getLogger(cls);
	}
}

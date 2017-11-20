package TestCases;
import Utilities.base;
import Utilities.commonOps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.xml.sax.SAXException;
import com.relevantcodes.extentreports.LogStatus;

import POF.Login;
import POF.counting;
import POF.counts;
import POF.homePage;
import POF.inventory;
import POF.newOrder;
import POF.sideMenu;
import Utilities.base;

public class sanity extends base
{
	

	

	@BeforeClass
	public static void openSession() throws ParserConfigurationException, SAXException, IOException
	{
		initBrowser(getData("BrowserType"));
		instanceReport();
		hp = PageFactory.initElements(driver, homePage.class);
		LogP = PageFactory.initElements(driver, Login.class);
		neOr = PageFactory.initElements(driver, newOrder.class);
		siMe = PageFactory.initElements(driver, sideMenu.class);
		inv = PageFactory.initElements(driver, inventory.class);
		counts = PageFactory.initElements(driver, counts.class);
		counting = PageFactory.initElements(driver, counting.class);
	}
	

	public static void initBrowser(String BrowserType) throws ParserConfigurationException, SAXException, IOException
	{
		switch (BrowserType.toLowerCase())
		{
		case "firefox":
			driver = initFFDriver();
			break;
		case "ie":
			driver = initIEDriver();
			break;
		case "chrome":
			driver = initChromeDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.get(getData("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		screen = new Screen();
	}
	
	public static WebDriver initFFDriver() throws ParserConfigurationException, SAXException, IOException
	{
		System.setProperty("webdriver.gecko.driver", getData("FFDriverPath"));
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver initIEDriver() throws ParserConfigurationException, SAXException, IOException
	{
		System.setProperty("webdriver.ie.driver", getData("IEDriverPath"));
		WebDriver driver = new InternetExplorerDriver();
		return driver;
	}
	
	public static WebDriver initChromeDriver() throws ParserConfigurationException, SAXException, IOException
	{
		System.setProperty("webdriver.chrome.driver", getData("ChromeDriverPath"));
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	
	
	
	
	
	@Test
	public void loginTest() throws IOException, ParserConfigurationException, SAXException
	{
		initReportTest("Test1", "Login");
		LogP.LoginSO();
	}
	
	@Test
	public void failedTest() throws IOException, ParserConfigurationException, SAXException
	{
		initReportTest("Test2-failedTest", "Login");
		LogP.FindElemton();
		commonOps.verifyElementExists(neOr.gogogo_Supplier);
	}
	
	
	@Test
	public void countTest_3698() throws IOException, ParserConfigurationException, SAXException
	{
		initReportTest("countTest_3698", "Edit count, change counting mode for TP is throw \"500 (Internal Server Error)\"");
		counting.newCount();
		counting.countTP();
		counting.editLastCountTP();
	}


	@Test
	public void Test3() throws IOException, ParserConfigurationException, SAXException
	{
		initReportTest("Test3", "xxx");
		commonOps.verifyImageExists("logo2.png");
		
	}
	
	
	
	@After
	public void doAfterTest()
	{
		finalizeReportTest();
	}
	
	
	@AfterClass
	public static void CloseSession()
	{
		finalizeExtentReport();
		driver.quit();
	}
	
	

}

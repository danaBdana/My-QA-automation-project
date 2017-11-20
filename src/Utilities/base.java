package Utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Screen;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import POF.Login;
import POF.counting;
import POF.counts;
import POF.homePage;
import POF.inventory;
import POF.newOrder;
import POF.sideMenu;

public class base 
{
	public static WebElement element;
	public static WebDriver driver;
	public static homePage hp;
	public static Login LogP;
	public static newOrder neOr;
	public static sideMenu siMe;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static inventory inv;
	public static counts counts;
	public static counting counting;
	public static Screen screen;
	public static String timeStamp = new SimpleDateFormat("yyy-MM-dd-HH-mm-ss").format(Calendar.getInstance().getTime());
	
	public static String getData (String nodeName) throws ParserConfigurationException, SAXException, IOException
	{
		File fXmlFile = new File("C:\\Users\\user\\Desktop\\Automation\\TestFiles\\myTestFile.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile); 
		doc.getDocumentElement().normalize();
		return doc.getElementsByTagName(nodeName).item(0).getTextContent();
	}

	
	
	
	
	
	
	public static void  instanceReport() throws ParserConfigurationException, SAXException, IOException
	{
		
		extent = new ExtentReports (getData("ReportFilePath") + getData("ReportFileName") + timeStamp + ".html", true);  
		
	}

	public static void initReportTest(String testName, String testDescription)
	{
		test = extent.startTest(testName, testDescription);		

	}

	public static void finalizeReportTest()
	{
		extent.endTest(test);	

	}
	
	public static void finalizeExtentReport()
	{
		extent.flush();	
		extent.close();

	}
	

	
	public static String takeSS() throws IOException, ParserConfigurationException, SAXException
	{
		String SSPath = getData("SSPath") + "screenshot_" + getRandomNumber() +".png";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\user\\Desktop\\Automation\\ExtentReports\\TakesScreenshot\\screenshot.png"));
		return SSPath;
	}

	
	public static int getRandomNumber()
	{
		Random rand = new Random();
		return rand.nextInt(1000) + 1000;
		
	}
	
}








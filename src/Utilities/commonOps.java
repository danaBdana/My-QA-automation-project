package Utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import Utilities.base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class commonOps extends base
{
	static String value1; 
	
	
	
	public static void verifyElementExists(WebElement elem) throws IOException, ParserConfigurationException, SAXException
	{
		
		try 
		{
			elem.isDisplayed();
			System.out.println("Element Exists!");
			test.log(LogStatus.PASS, "Element Exists!");
		} 
		catch (Exception e) 
		{
			System.out.println("Element NOT Exists!");
			fail("Element NOT Exists!");  
			test.log(LogStatus.FAIL, "Element NOT Exists! See screen shot: " + test.addScreenCapture(takeSS()));
		}
	}
		
		
		public static void verifyImageExists(String imageName) throws IOException, ParserConfigurationException, SAXException
		{
			
			try 
			{
				screen.find(getData("imagePath") + imageName);
				System.out.println("Element Exis ts!");
				test.log(LogStatus.PASS, "Element Exists!");
			} 
			catch (Exception e) 
			{
				System.out.println("Element NOT Exists!");
				fail("Element NOT Exists!");  
				test.log(LogStatus.FAIL, "Element NOT Exists! See screen shot: " + test.addScreenCapture(takeSS()));
			}
		
//		public void selectDropDown(WebElement elem)
//		{
//			try 
//			{
//				Select myValue = new Select(elem);
//				myValue.selectByValue(value1);
//				System.out.println("Element Exists!");
//			} 
//			catch (Exception e) 
//			{
//				System.out.println("Element NOT Exists!");
//				fail("Element NOT Exists!");  
//			}
//		}

		
		
	}
	
	
}

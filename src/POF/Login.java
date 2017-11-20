package POF;
import static org.junit.Assert.*;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.base;

public class Login extends base
{

	public WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"form-entry\"]/input[2]")
	public WebElement txtBox_Email;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"form-entry\"]/input[3]")
	public WebElement txtBox_Password;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"form-entry\"]/footer/input")
	public WebElement btn_Login;
	
	
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void LoginSO() throws IOException, ParserConfigurationException, SAXException
	{
		try 
		{
			txtBox_Email.sendKeys(getData("Email"));
			txtBox_Password.sendKeys(getData("password"));
			btn_Login.click();
			test.log(LogStatus.PASS, "LoginSO is pass");
		} 
		catch (Exception e) 
		{		
			System.out.println(e);
			test.log(LogStatus.FAIL, "LoginSO is fail " + test.addScreenCapture(takeSS()));
			fail("Test failed!");  
		}
		
	}
		
		
		public void FindElemton() throws IOException, ParserConfigurationException, SAXException
		{
		try 
		{
			test.log(LogStatus.PASS, "LoginSO2 is pass");
			driver.findElement(By.xpath("//*[@id=\"client_row_33028\"]/td[6]/div"));
		}
		catch (Exception e) 
		{
			System.out.println(e);
			test.log(LogStatus.FAIL, "LoginSO2 is fail " + test.addScreenCapture(takeSS()));
			fail("Test failed!");  
		}
		
		}
	}


package POF;

import static org.junit.Assert.fail;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import Utilities.base;

public class counting extends base
{

	public WebDriver driver;

	public counting(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/section[1]/div[2]/button")
	public WebElement btn_StartCounting;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/section[1]/ul/li[3]/div/div[1]")
	public WebElement btn_OtherItemsList;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/section[2]/div/div/div[2]/div[1]/div/div/div[9]/div/div[3]/button")
	public WebElement product_TP1;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[3]/div/div/div[1]/input")
	public WebElement product_TP1_500lb;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/div[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]/div/div/div[1]/input")
	public WebElement product_TP1_2kg;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/section[1]/div[2]/button[1]")
	public WebElement btn_Submit;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/div[2]/div/header/div[2]/i")
	public WebElement btn_closingTPwindow;

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/div[2]/div/footer/button[1]")
	public WebElement btn_OKsetCountDate;

	public  void newCount() throws IOException, ParserConfigurationException, SAXException 
	{	try 
	{
		test.log(LogStatus.PASS, "open new count is pass");
		siMe.inventory_SideMenu.click();
		inv.btn_Counts.click();
		counts.btn_NewCount.click();
	} 
	catch (Exception e) 
	{
		test.log(LogStatus.FAIL, "open new count is fail " + test.addScreenCapture(takeSS()));
		fail("open new count is fail");  
	}

	}

	public  void countTP() throws IOException, ParserConfigurationException, SAXException 
	{	try 
	{
		test.log(LogStatus.PASS, "count TP is pass");
		counting.btn_StartCounting.click();
		counting.btn_OtherItemsList.click();
		counting.product_TP1.click();
		counting.product_TP1_2kg.sendKeys("15");
		counting.product_TP1_500lb.sendKeys("1");
		counting.btn_closingTPwindow.click();
		counting.btn_Submit.click();
		counting.btn_OKsetCountDate.click();

	} 
	catch (Exception e) 
	{
		test.log(LogStatus.FAIL, "count TP is fail " + test.addScreenCapture(takeSS()));
		fail("count TP is fail ");  
	}

	}




	public  void editLastCountTP() throws IOException, ParserConfigurationException, SAXException 
	{	try 
	{
		test.log(LogStatus.PASS, "Edit count is pass");
		inv.btn_Counts.click();
		counts.lastCount.click();
		counting.btn_OtherItemsList.click();
		counting.product_TP1.click();
		counting.product_TP1_2kg.sendKeys("2");
		counting.product_TP1_500lb.sendKeys("3");
		counting.btn_Submit.click();
		counting.btn_OKsetCountDate.click();

	} 
	catch (Exception e) 
	{
		test.log(LogStatus.FAIL, "Edit count is fail " + test.addScreenCapture(takeSS()));
		fail("Test failed!");  
	}

	}






}

package POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.base;

public class newOrder extends base
{
public WebDriver driver;
	
	public newOrder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"supplier_35919\"]/div")
	public WebElement gogogo_Supplier;

	@FindBy(how = How.XPATH, using = "//*[@id=\"product_35919_2329902\"]/div[2]/div[2]/div[2]/button[2]")
	public WebElement btn_Plus;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"total_value\"]")
	public WebElement totalValue;
	
	
	public void OrderingFromGogogo()
	{
		
		siMe.newOrder_SideMenu.click();
		gogogo_Supplier.click();
		btn_Plus.click();
//		verifyElementExists(totalValue);
//		AssertEquals("10", totalValue);
		
		
		
		
	}


	
	
	
	
	
	
}

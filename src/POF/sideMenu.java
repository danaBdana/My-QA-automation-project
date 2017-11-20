package POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.base;

public class sideMenu extends base 
{
	public WebDriver driver;
	
	public sideMenu(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[1]/a/i")
	public WebElement dashboard_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[2]/a/i")
	public WebElement newOrder_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[3]/a/i")
	public WebElement purchasedOrder_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[4]/a/i")
	public WebElement inventory_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[5]/a/i")
	public WebElement supplier_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[6]/a/i")
	public WebElement sales_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[7]/a/i")
	public WebElement menu_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[8]/a/i")
	public WebElement reports_SideMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"left-section\"]/main/ul/li[9]/a/i")
	public WebElement helpCenter_SideMenu;
	

	
	
	
	
	
}

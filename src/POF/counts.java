package POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.base;

public class counts extends base
{

	public WebDriver driver;

	public counts(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/header/div[3]/a/button")
	public WebElement btn_NewCount;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/main/div/div[2]/div/div/a[1]")
	public WebElement lastCount;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/header/div[2]/a/button")
	public WebElement btn_EditCount;
	
	
	
	
	
	
	
	
	
	
	
}

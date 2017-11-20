package POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Utilities.base;

public class inventory extends base
{

	public WebDriver driver;

	public inventory(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"main\"]/div/header/div[2]/div[2]/button[1]")
	public WebElement btn_Counts;








}

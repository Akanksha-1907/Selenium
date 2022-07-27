package POM_DDF_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_loginpage 
{
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement user;
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pass;
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")private WebElement loginclick;
	
	public flipkart_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void mobileno(String mobile)
	{
		user.sendKeys(mobile);
	}
	public void password(String passw)
	{
		pass.sendKeys(passw);
	}
	public void click()
	{
		loginclick.click();
	}


}

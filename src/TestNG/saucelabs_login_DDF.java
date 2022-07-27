package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelabs_login_DDF
{
	@FindBy(xpath="//input[@id=\"user-name\"]")private WebElement user;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement pass;
	@FindBy(xpath="//input[@id=\"login-button\"]")private WebElement click;
	
	public saucelabs_login_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String usern)
	{
		user.sendKeys(usern);
	}
	public void password(String passw)
	{
		pass.sendKeys(passw);
	}
	public void loginc()
	{
		click.click();
	}

}

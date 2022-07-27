package testNG_data_provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Data_provider 
{
	@FindBy(xpath="//input[@placeholder=\"Username\"]")private WebElement username;
	@FindBy(xpath="//input[@placeholder=\"Password\"]")private WebElement password;
	@FindBy(id="login-button")private WebElement login_button;
	
	public login_Data_provider(WebDriver driver) 
	{
		
		PageFactory.initElements(driver,this);
	}
	public void unn(String uur) 
	{
		username.sendKeys(uur);
		
	}
	public void pss(String prr) 
	{
		
		password.sendKeys(prr);
	}
	public void lgg() 
	{
		
		login_button.click();
	}

}

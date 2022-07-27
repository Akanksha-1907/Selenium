package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelabs_yourcart_DDF
{
	@FindBy(xpath="//button[@id=\"checkout\"]")private WebElement checkout;
	@FindBy(xpath="//input[@id=\"first-name\"]")private WebElement fname;
	@FindBy(xpath="//input[@id=\"last-name\"]")private WebElement lname;
	@FindBy(xpath="//input[@id=\"postal-code\"]")private WebElement zipcode;
	@FindBy(xpath="//input[@id=\"continue\"]")private WebElement cont;
	@FindBy(xpath="//button[@id=\"finish\"]")private WebElement finish;
	
	public saucelabs_yourcart_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkoclick()
	{
		checkout.click();
	}
	public void firstn(String name)
	{
		fname.sendKeys(name);
	}
	public void lastn(String surname)
	{
		lname.sendKeys(surname);
	}
	public void zip(String zipc)
	{
		zipcode.sendKeys(zipc);
	}
	public void conti()
	{
		cont.click();
	}
	public void fin()
	{
		finish.click();
	}
	
	

}

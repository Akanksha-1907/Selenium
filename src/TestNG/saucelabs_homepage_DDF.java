package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class saucelabs_homepage_DDF 
{
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")private WebElement add;
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")private WebElement cartclick;
	
	public saucelabs_homepage_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addcart()
	{
		add.click();
	}
	public void clickcart()
	{
		cartclick.click();
	}
	

}

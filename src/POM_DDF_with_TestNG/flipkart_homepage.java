package POM_DDF_with_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_homepage
{
	 @FindBy(xpath="//div[text()=\"Pooja\"]")private WebElement username;
	 @FindBy(xpath="//div[text()=\"Pooja\"]")private WebElement logout;
	@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement lclick;
		
		
	    public flipkart_homepage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	 
	    public void act(WebDriver driver)
		{
			Actions act=new Actions(driver);
			act.moveToElement(logout).perform();
			lclick.click();	
			
		}
	    public String validateusername() throws InterruptedException      
	    {
	    	Thread.sleep(2000);
	    	String actu=username.getText();
	    	return actu;
	    	
	    }
	    

}

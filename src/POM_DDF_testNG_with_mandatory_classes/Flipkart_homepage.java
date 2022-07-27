package POM_DDF_testNG_with_mandatory_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_homepage
{
	 @FindBy(xpath="//div[text()=\"Akanksha\"]")private WebElement username;
	 @FindBy(xpath="//div[text()=\"Akanksha\"]")private WebElement logout;
	@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement lclick;
		
		
	    public Flipkart_homepage(WebDriver driver)
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

package POM_using_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_homepage_POM 
{
	//Step1:Data member should be declared globally with access level private using @findBy Annotation.
	
	@FindBy(xpath="//div[text()=\"Pooja\"]")private WebElement username;
	
	//Step2:. Initialize within a constructor with access level public using pagefactory class.
	
	public flipkart_homepage_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Step3:Utilize within a method with access level public.
	public void validateusername()
	{
		String actualuser=username.getText();
		String Expecteduser="Pooja";
		if(actualuser.equalsIgnoreCase(Expecteduser))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Tsr Case is Failed");
		}
	}

}

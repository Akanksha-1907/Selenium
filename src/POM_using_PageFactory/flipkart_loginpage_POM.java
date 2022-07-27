package POM_using_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_loginpage_POM 
{
	//Step1: Declare variable globally with private access specifier using @FindBy annotation.
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement user;
	//private WebElement user=driver.findElement(By.xpath(""))----->expanded form
	
	//Enter password
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pass;
	//Click on login
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")private WebElement loginclick;
	
	//Step2: create constructor with public
	public flipkart_loginpage_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step3:Utilize within a method with access level public.
	public void mobileno()
	{
		user.sendKeys("8482809373");
	}
	public void password()
	{
			pass.sendKeys("Hello@1234");
	}
	public void click()
	{
		loginclick.click();
	}
	}



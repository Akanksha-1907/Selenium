package POM_pagefactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_loginpage_DDF
{
	//Step1: Declare variable globally with private access specifier using @FindBy annotation.
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement user;
	//private WebElement user=driver.findElement(By.xpath(""))----->expanded form
	
	//Enter password
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement pass;
	//Click on login
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")private WebElement loginclick;
	
	public flipkart_loginpage_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step3:Utilize within a method with access level public.
	
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

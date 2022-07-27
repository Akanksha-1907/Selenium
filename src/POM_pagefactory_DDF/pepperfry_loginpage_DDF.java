package POM_pagefactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pepperfry_loginpage_DDF
{
	//Click on signup
	@FindBy(xpath="//a[text()=' Sign Up']")private WebElement clicksignup;
	//Click on Existinguser/login
	@FindBy(xpath="//a[text()='Existing User? Log In']")private WebElement existing;
	//Username
	@FindBy(xpath="//input[@name=\"user[new]\"]")private WebElement user;
	//password
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement pass;
	//Click on log in
	@FindBy(xpath="//input[@name=\"usernameLogin\"]")private WebElement loginclick;
	@FindBy(xpath="(//a[@class=\"popup-close\"])[6]")private WebElement cross;
	//Forgot password
	@FindBy(xpath="//a[text()='Forgot Password']")private WebElement forgotp;
	
	public pepperfry_loginpage_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void signup() 
	{
		clicksignup.click();
	}
	public void exist()
	{
		existing.click();
	}
	public void username(String email)
	{
		user.sendKeys(email);
	}
	public void password(String passw)
	{
		pass.sendKeys(passw);
	}
	public void loginc()
	{
		loginclick.click();
	}
	public void cros()
	{
		cross.click();
	}
	public void forgotpass()
	{
		forgotp.click();
	}
	
}

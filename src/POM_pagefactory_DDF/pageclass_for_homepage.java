package POM_pagefactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class pageclass_for_homepage
{
	@FindBy(xpath="//div[text()=\"Pooja\"]")private WebElement username;
	@FindBy(xpath="//div[text()=\"Pooja\"]")private WebElement logout;
	@FindBy(xpath="//div[text()=\"Logout\"]")private WebElement lclick;
	public pageclass_for_homepage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	public void act1(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(logout).perform();
		lclick.click();	
		
	}
    
    public void validateusername()       {
    	String actu=username.getText();
    	String expected="Pooja";       
    	Assert.assertEquals(actu, expected);
  
}
}

package POM_pagefactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart_homepage_DDF
{
	//Step1:Data member should be declared globally with access level private using @findBy Annotation.
	
    @FindBy(xpath="//div[text()=\"Pooja\"]")private WebElement username;
	
	//Step2:. Initialize within a constructor with access level public using PageFactory class.
    
    public flipkart_homepage_DDF(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
  //Step3:Utilize within a method with access level public.
    
    public void validateusername()       //public void validateusername(String exp)
    {
    	String actu=username.getText();
    	String expected="Pooja";       //-->it should comment out
    	if(actu.equalsIgnoreCase(expected))      //if(actu.equalsIgnoreCase(exp))  
    	{
    		System.out.println("Test Case is Passed");
    	}
    	else
    	{
    		System.out.println("Test Case is Failed");
    	}
    }
    



}

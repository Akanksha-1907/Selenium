package POM_pagefactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pepperfry_homepage_DDF
{
	//Search Box
	@FindBy(xpath="//input[@id=\"search\"]")private WebElement search;
	//search Button
	@FindBy(xpath="(//input[@type=\"button\"])[1]")private WebElement sbutton;
	
	public pepperfry_homepage_DDF(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchbox(String src)
	{
		search.sendKeys(src);
	}
	public void searchbutton()
	{
		sbutton.click();
	}

}

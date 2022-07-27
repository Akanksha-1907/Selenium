package POM_pagefactory_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass_for_opening_browser_flipkart
{
	WebDriver driver;
	@BeforeMethod()
	public void m2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	}

}

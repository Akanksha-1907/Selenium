package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_pagefactory_DDF.flipkart_homepage_DDF;
import POM_pagefactory_DDF.flipkart_loginpage_DDF;

public class testNG_anno_with_DDF_ex {

	WebDriver driver;

	@BeforeSuite
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Launch the browser", true);
	}

	@BeforeTest
	public void max()
	{
		driver.manage().window().maximize();
		Reporter.log("Maximizing the browser", true);
	}

	@BeforeClass
	public void openapp()
	{
		driver.get("https://www.flipkart.com/");
		Reporter.log("Open the flipkart application", true);
	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Reporter.log("Test Case 1 executed and verification is done", true);
		FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\Framework_BDD.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sh=book.getSheet("Sheet2");
		
		String username1=sh.getRow(0).getCell(0).getStringCellValue();
		String password1=sh.getRow(0).getCell(1).getStringCellValue();
		
		flipkart_loginpage_DDF lp=new flipkart_loginpage_DDF(driver);
		lp.mobileno(username1);
		lp.password(password1);
		lp.click();
		Thread.sleep(2000);
	}
	
	@Test
	public void verfication() throws InterruptedException 
	{
		Reporter.log("Test Case 1 executed and verification is done", true);
		flipkart_homepage_DDF hp=new flipkart_homepage_DDF(driver);
		hp.validateusername();  
	}
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//div[text()='Pooja']"));
		act.moveToElement(user).perform();
		driver.findElement(By.xpath("//div[text()=\"Logout\"]")).click();
		Reporter.log("Logout the application", true);
	}
	
	@AfterClass
	public void closeapp()
	{
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
package POM_pagefactory_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_testclass_DDF 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\Framework_BDD.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sh=book.getSheet("Sheet2");
	
	String username1=sh.getRow(0).getCell(0).getStringCellValue();
	String password1=sh.getRow(0).getCell(1).getStringCellValue();
	//String validateuser=sh.getRow(0).getCell(2).getStringCellValue();
	
	flipkart_loginpage_DDF lp=new flipkart_loginpage_DDF(driver);
	lp.mobileno(username1);
	lp.password(password1);
	lp.click();
	Thread.sleep(2000);
	
	flipkart_homepage_DDF hp=new flipkart_homepage_DDF(driver);
	hp.validateusername();      //hp.validateusername();

}
}

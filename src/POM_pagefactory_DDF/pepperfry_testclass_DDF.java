package POM_pagefactory_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pepperfry_testclass_DDF 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.pepperfry.com/");
	driver.manage().window().maximize();
	
	FileInputStream file=new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\pepperfry_POM.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sh=book.getSheet("Sheet1");
	
	String us=sh.getRow(0).getCell(0).getStringCellValue();
	String pas=sh.getRow(0).getCell(1).getStringCellValue();
	String src=sh.getRow(0).getCell(2).getStringCellValue();
	
	pepperfry_loginpage_DDF lp=new pepperfry_loginpage_DDF(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	lp.signup();
	lp.exist();
	lp.username(us);
	lp.password(pas);
	lp.loginc();
	Thread.sleep(2000);
	lp.cros();
	
	pepperfry_homepage_DDF hp=new pepperfry_homepage_DDF(driver);
	hp.searchbox(src);
	hp.searchbutton();
	
	driver.quit();
	
}
}

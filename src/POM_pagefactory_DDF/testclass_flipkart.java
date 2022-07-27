package POM_pagefactory_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class testclass_flipkart extends BaseClass_for_opening_browser_flipkart
{
	@Test
	public void m1() throws InterruptedException, IOException
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\Framework_BDD.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(file);
	XSSFSheet sh=book.getSheet("Sheet2");
	
	String username1=sh.getRow(0).getCell(0).getStringCellValue();
	String password1=sh.getRow(0).getCell(1).getStringCellValue();
	//String validateuser=sh.getRow(0).getCell(2).getStringCellValue();
	
	pageclass_for_loginpage lp=new pageclass_for_loginpage(driver);
	lp.mobileno(username1);
	lp.password(password1);
	lp.click();
	Thread.sleep(2000);
	
	pageclass_for_homepage hp=new pageclass_for_homepage(driver);
	hp.validateusername();      //hp.validateusername();
    hp.act1(driver);
}
}



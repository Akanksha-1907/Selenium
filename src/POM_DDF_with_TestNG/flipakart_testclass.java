package POM_DDF_with_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flipakart_testclass 
{
	WebDriver driver;
	flipkart_homepage hp;
	flipkart_loginpage lp;
	XSSFSheet sh;
	Actions act;
	@BeforeClass
	public void openapp() throws IOException
	{
		//configure browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//open the application in browser
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//created and initialized object of POM classes
		lp =new flipkart_loginpage(driver);
		hp=new flipkart_homepage(driver);
		
		//open excel sheet to fetch the data
		FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\Framework_BDD.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		sh=book.getSheet("Sheet2");
	}
	@BeforeMethod
	public void loginapp()
	{
		lp.mobileno(sh.getRow(0).getCell(0).getStringCellValue());
		lp.password(sh.getRow(0).getCell(1).getStringCellValue());
		lp.click();
	}
	@Test
	public void verifyuser()throws InterruptedException
	{
		String actualr=hp.validateusername();
		String expr=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actualr, expr);
	}
	@AfterMethod
	public void logoutapp()
	{
		hp.act(driver);
		System.out.println("Logout Application");
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
		//destroy all the globally declared objects to save memory...it should not have to wait to all suite to execute.
		driver=null;
		lp=null;
		hp=null;
		sh=null;
	}

}

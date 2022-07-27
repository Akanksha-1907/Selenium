package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class saucelab_testclass_testNG 
{
	WebDriver driver;
	@BeforeTest
	public void launch() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Launch the browser", true);
	}
	@BeforeClass 
	public void openapp()
	{
		driver.manage().window().maximize();
		Reporter.log("Maximizing the browser", true);
		driver.get("https://www.saucedemo.com/");
	}
	@BeforeMethod
	public void input() throws IOException, InterruptedException 
	{
		Reporter.log("Browser is opened", true);
		FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\pepperfry_POM.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sh=book.getSheet("Sheet2");
		
		String u=sh.getRow(0).getCell(0).getStringCellValue();
		String p=sh.getRow(0).getCell(1).getStringCellValue();
		
		saucelabs_login_DDF lp=new saucelabs_login_DDF(driver);
		lp.username(u);
		Thread.sleep(2000);
		lp.password(p);
		Thread.sleep(2000);
		lp.loginc();
		Reporter.log("Login is Done", true);
		saucelabs_homepage_DDF hp=new saucelabs_homepage_DDF(driver);
		hp.addcart();
		Thread.sleep(2000);
		hp.clickcart();
		Reporter.log("Added to cart", true);
				
	}
	@Test
	public void checkout() throws IOException, InterruptedException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\Windows\\Desktop\\Parameterisation\\pepperfry_POM.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sh=book.getSheet("Sheet2");
		Thread.sleep(2000);
		String fn=sh.getRow(1).getCell(0).getStringCellValue();
		String ln=sh.getRow(1).getCell(1).getStringCellValue();
		String zc=sh.getRow(1).getCell(2).getStringCellValue();
		
		saucelabs_yourcart_DDF yt=new saucelabs_yourcart_DDF(driver);
		yt.checkoclick();
		yt.firstn(fn);
		yt.lastn(ln);
		yt.zip(zc);
		yt.conti();
		yt.fin();
		Reporter.log("Checkout is Done", true);	
	}
	@AfterMethod()
	public void close()
	{
		driver.close();
		Reporter.log("Closed the browser", true);
	}

}

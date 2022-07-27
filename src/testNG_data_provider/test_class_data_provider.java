package testNG_data_provider;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_class_data_provider 
{
	
	WebDriver driver;
	login_Data_provider addt;

	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Automation\\java\\Selenium_Automation\\browserDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@DataProvider
	public Object[][] Ldata() throws IOException
	{
		Object[][] data1=Utility.d("sheet1");
		return data1;
	}
	@Test(dataProvider="Ldata")
	public void login(String su,String wp) throws InterruptedException {
		addt=new login_Data_provider(driver);
		addt.unn(su);
		addt.pss(wp);
		addt.lgg();
	
		
	}
	@AfterMethod
	public void closing() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}

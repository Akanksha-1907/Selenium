package crossbrowser_compatibility_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class example1
{
	
	@Parameters("browser")
	@Test
	public void m1(String browser) throws InterruptedException
	{
		WebDriver driver=null;
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	}


}

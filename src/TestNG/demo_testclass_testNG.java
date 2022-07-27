package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo_testclass_testNG 
{
	//In testNG it executes alphabetically i.e. first it executes amazon and then flipkart.
    //TestNG test class main method not required
	
	@Test
	public void openflipkart()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Opening flipkart appliction",true);
		driver.get("https://www.flipkart.com/");
		
	}
	@Test
	public void openamazon()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Opening amazon appliction",true);
		driver.get("https://www.amazon.in/");
		
	}
}
	



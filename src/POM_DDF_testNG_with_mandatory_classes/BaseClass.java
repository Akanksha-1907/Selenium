package POM_DDF_testNG_with_mandatory_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	//BaseClass contains all the mandatory code needed for each and every test class present in your project.
	WebDriver driver;
	public void configurebrowser()
	{
		//configure browser
		//configure browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Automation\\java\\Selenium_Automation\\browserDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//open the application in browser
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	

}

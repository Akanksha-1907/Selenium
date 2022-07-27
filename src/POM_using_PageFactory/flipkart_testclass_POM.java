package POM_using_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_testclass_POM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		flipkart_loginpage_POM lp=new flipkart_loginpage_POM(driver);
		lp.mobileno();
		lp.password();
		lp.click();
		Thread.sleep(2000);
		
		flipkart_homepage_POM hp=new flipkart_homepage_POM(driver);
		hp.validateusername();
	}

}

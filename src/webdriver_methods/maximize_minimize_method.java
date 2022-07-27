package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class maximize_minimize_method
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		//maximize();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//minimize();
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
		
	}

}

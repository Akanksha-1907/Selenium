package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl_method 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		//getCurrentUrl();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//Test Case 2-->verify that user launched the correct URL
		
		if(url.equalsIgnoreCase("https://www.youtube.com/"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}

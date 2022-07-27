package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate().to();
		
		driver.navigate().to("https://web.whatsapp.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.zomato.com/");
		driver.get("https://sleepycat.in/");
		
		//navigate backward
		
		driver.navigate().back();  //comes to zomato
		Thread.sleep(2000);
		driver.navigate().back();  //comes to flipkart
		Thread.sleep(2000);
		
		//navigate forward
		
		driver.navigate().forward(); //comes to zomato
		Thread.sleep(2000);
		
		//refresh/reload page
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}

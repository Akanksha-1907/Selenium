package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath_using_text 
{
	//--->//tagname[text()="partial text"]
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch the browser
		driver.get("file:///C:/Users/Windows/Desktop/html.html"); //open the webpage
		driver.manage().window().maximize();
		
		//Go to facebook page
		driver.findElement(By.xpath("//a[text()=\"Facebook\"]")).click();
		Thread.sleep(3000);
		
		//navigate back to page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Go to sleepycat page
		driver.findElement(By.xpath("//a[text()=\"SleepyCat\"]")).click();
		Thread.sleep(2000);
		
		//navigate back to page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//go to google page
		driver.findElement(By.xpath("//a[text()=\"Google\"]")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		
		
		
		
		
		
		
	}

}

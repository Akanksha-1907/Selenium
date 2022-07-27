package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText_locator
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Windows/Desktop/html.html"); 
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("book")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("oo")).click();  //if name found common then give preference to first page whichever it may be.
		Thread.sleep(3000);
		driver.quit();
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName_locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Windows/Desktop/html.html");   //open the browser
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("98765432");
		Thread.sleep(2000);
		
		
		
	}

}

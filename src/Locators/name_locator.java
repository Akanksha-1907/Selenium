package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name_locator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sleepycat.in/login");   //open the browser
		
		driver.findElement(By.name("login-email")).sendKeys("akanksha19hedaoomail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("login-password")).sendKeys("Akanksha@123");
		Thread.sleep(2000);
		
		
		//driver.findElement(By.name("")).click();
		//Thread.sleep(2000);
		
		
		driver.close();
		
		
		
	}

}

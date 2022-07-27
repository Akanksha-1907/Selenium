package Locators_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath
{
	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");
       TimeUnit.SECONDS.sleep(5);
       
       driver.findElement(By.xpath("//div[2]/input")).sendKeys("Admin");;  //to enter text in username column
       Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[3]/input")).sendKeys("admin123");   //to enter the password
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//div[5]/input")).click();     //to click on login button
		
		Thread.sleep(3000);
		driver.quit();
       
	}

}

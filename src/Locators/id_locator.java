package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");   //open the browser
		
		WebElement ele=driver.findElement(By.id("txtUsername"));  //to enter text in username column
		Thread.sleep(2000);
		ele.sendKeys("Admin");
		
		WebElement pass=driver.findElement(By.id("txtPassword"));   //to enter the password
		Thread.sleep(2000);
		pass.sendKeys("admin123");
		
		WebElement login=driver.findElement(By.id("btnLogin"));     //to click on login button
		Thread.sleep(2000);
		login.click();
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}

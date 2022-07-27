package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath_using_attribute 
{
	//--->//tagname[@attributename="attribute value"]
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sleepycat.in/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Enter the username
		driver.findElement(By.xpath("//input[@name=\"login-email\"]")).sendKeys("akanksha19hedaoo@gmail.com");
		Thread.sleep(3000);
		
		//Enter the password
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Akanksha@123");
		Thread.sleep(3000);
		
		//Click on the login  button
		driver.findElement(By.xpath("//button[@data-logindiv=\"LoginDiv\"]")).click();
		Thread.sleep(10000);
		driver.quit();
		
	}

}

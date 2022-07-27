package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relative_xpath_using_text1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open facebook page
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//click on forgotten password
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		Thread.sleep(2000);
		
		//navigate back
		driver.navigate().back();
		
		//click on create new account
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

		
	}



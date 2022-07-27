package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_contains_method_attribute_text1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//enter username
		driver.findElement(By.xpath("//input[contains(@id,\"ma\")]")).sendKeys("Akanksha");
		Thread.sleep(2000);
		
		//enter password
		driver.findElement(By.xpath("//input[contains(@placeholder,\"word\")]")).sendKeys("Aa@123");
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//button[contains(@name,\"in\")]")).click();
		Thread.sleep(2000);
		
		//click o forgotten password
		driver.findElement(By.xpath("//a[contains(text(),\"pass\")]")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

		
	}



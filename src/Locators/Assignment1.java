package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Step 1-->Open YouTube Website
		driver.get("https://www.youtube.com/"); 
		Thread.sleep(7000);
		
		//Step 2-->Identify Search box and enter value as tuitions
		WebElement ele=driver.findElement(By.name("search_query"));
		Thread.sleep(5000);
		ele.sendKeys("Tuitions");
		
		
		//Step 3-->Click on search button
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		
		//Step 4-->Start any video for 50 seconds
		driver.findElement(By.partialLinkText("Tuition Classes aur Bache | Ashish Chanchlani")).click();
		Thread.sleep(50000);
		
		//Step 5-->Navigate back
		driver.navigate().back();
		
		//Step 6-->Clear text from search box
		ele.clear();
		
		//Step 7-->Search for Selenium 
		WebElement ele1=driver.findElement(By.name("search_query"));
		Thread.sleep(5000);
		ele1.sendKeys("Selenium");
		
		
		//Step 8-->Click on Search button
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		
		//Step 9-->Play video for 50 seconds
		driver.findElement(By.partialLinkText("How To Explain Test Automation Framework In Interviews For Selenium")).click();
		Thread.sleep(50000);
		
		
		
		
	}

}

package Locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch the browser
		driver.manage().window().maximize();     //maximize the browser
		
		//Open the Amazon application
		driver.get("https://www.amazon.in/");
		Thread.sleep(20000);
		
		//Click on bestsellers
		driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,\"nav_cs_bestsellers\")]")).click();
		Thread.sleep(10000);
	
		//Click on mostly gifted
		driver.findElement(By.xpath("//a[contains(text(),\"Most Gi\")]")).click();
		Thread.sleep(10000);
		
		//Click on Mobiles
		driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,\"nav_cs_m\")]")).click();
		Thread.sleep(10000);
		
		//Click on laptop and accessories
		driver.findElement(By.xpath("//span[contains(text(),\"Lap\")]")).click();
		Thread.sleep(10000);
		
		//Click on the Memory Cards
		driver.findElement(By.xpath("//img[contains(@alt,\"Mem\")]")).click();
		Thread.sleep(7000);
		
		//Close the browser
		driver.close();
		
	}

}

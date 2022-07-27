package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_locators_example 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/"); 
		Thread.sleep(5000);
		driver.findElement(By.className("desktop-searchBar")).sendKeys("Joggers");
		Thread.sleep(5000);
		driver.findElement(By.className("myntraweb-sprite desktop-iconSearch sprites-search")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("product-productMetaInfo")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

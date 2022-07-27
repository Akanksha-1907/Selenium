package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jio_xpath 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/#mobile1");
		driver.manage().window().maximize();
		
		//Click on Start Shopping
		driver.findElement(By.xpath("//a[text()=\"Shop at JioMart\"]/ancestor::section/following::section[1]/descendant::div[3]/descendant::div[7]/button")).click();
		Thread.sleep(6000);
	
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(3000);
		
		//Click On the Mattress
		WebElement mat=driver.findElement(By.xpath("//*[@id=\"search\"]//following::span[@class=\"topnav_itemname\"][6]"));
		mat.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=\"Pillows\"]")).click();
		Thread.sleep(3000);
		
	}

}

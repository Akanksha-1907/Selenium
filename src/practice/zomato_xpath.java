package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato_xpath
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open zomato
		driver.navigate().to("https://www.zomato.com//");	
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//click on order online
		driver.findElement(By.xpath("//p[contains(text(),\"Order Online\")]")).click();
		Thread.sleep(3000);
		
		//navigate back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//click on dining out
		driver.findElement(By.xpath("//p[starts-with(text(),\"Dining Out\")]")).click();
		Thread.sleep(6000);
		
		//click on open
		driver.findElement(By.xpath("//div[text()=\"Open Now\"]")).click();
		Thread.sleep(3000);
		
		//click on rating 4+
		driver.findElement(By.xpath("//div[text()=\"Rating: 4.0+\"]")).click();
		Thread.sleep(10000);
		
		//click on Diablo
		driver.findElement(By.xpath("//img[@src=\"https://b.zmtcdn.com/data/pictures/7/19597867/1831e6f62761dc848a9d8b143a17d8ab_featured_v2.jpg\"]")).click();
		Thread.sleep(3000);
		
		//click on book a table
		driver.findElement(By.xpath("//a[contains(text(),\"Book a Table\")]")).click();
		Thread.sleep(3000);
		
		//Enter the details
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("5ff8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("45210l");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("jhds@hdfbh.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("8647521036");
		Thread.sleep(2000);
		
		//Enter on book now
		driver.findElement(By.xpath("//span[@class=\"sc-1kx5g6g-2 jetOJt\"]")).click();
		Thread.sleep(2000);
		
		//close the tab
		driver.close();
		
	}

}

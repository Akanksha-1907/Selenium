package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_xpath 
{
	
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	TimeUnit.SECONDS.sleep(2);
	
	//search for the java tutorials
	
	WebElement ele=driver.findElement(By.xpath("//input[@id=\"search\"]"));
	ele.sendKeys("tutorials");
	Thread.sleep(5000);
	
	WebElement ele1=driver.findElement(By.xpath("//button[@class=\"style-scope ytd-searchbox\"]"));
	ele1.click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[@title=\"Java Tutorial for Beginners\"]")).click();
	Thread.sleep(50000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	ele.clear();
	
	ele.sendKeys("coorg");
	Thread.sleep(5000);
	ele1.click();
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//a[@title=\"The Coorg Travel Planner: Things To Do In Coorg, Best Hotels In Coorg, Coorg Trip Budget | Tripoto\"]")).click();
	
	TimeUnit.MINUTES.sleep(1);
	
	driver.close();
	
	
	
	
	
}
}

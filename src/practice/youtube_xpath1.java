package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_xpath1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/?gl=IN");
		Thread.sleep(2000);
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
		search.sendKeys("tutorial");
		Thread.sleep(1000);
		
		WebElement button=driver.findElement(By.xpath("//button[@class=\"style-scope ytd-searchbox\"]"));
		button.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title=\"Kubernetes Tutorial for Beginners [FULL COURSE in 4 Hours]\"]")).click();
		Thread.sleep(50000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		search.clear();
		search.sendKeys("Selenium");
		Thread.sleep(1000);
		
		button.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title=\"Selenium Full Course - Learn Selenium in 12 Hours | Selenium Tutorial For Beginners | Edureka\"]")).click();
		
		Thread.sleep(50000);
		TimeUnit.MINUTES.sleep(2);		
	}
}




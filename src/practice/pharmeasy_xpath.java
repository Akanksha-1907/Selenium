package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pharmeasy_xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the pharmeasy site
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		//click on order medicines
		driver.findElement(By.xpath("//div[contains(text(),\"Order M\")]")).click();
		TimeUnit.SECONDS.sleep(4);
		//search for medicine
		driver.findElement(By.xpath("//input[@class=\"Input_input__3uBA4 Typeahead_input__2tzhm\"]")).sendKeys("Dolo 650");
		TimeUnit.SECONDS.sleep(4);
		driver.findElement(By.xpath("//div[@class=\"ClickableElement_clickable__3o0IV Typeahead_searchIcon__3IXY2\"]")).click();
		//navigate back
		driver.navigate().back();
		driver.navigate().back();
		//click on RTPCR
		driver.findElement(By.xpath("//a[contains(@class,\"KSY3N\") and @href=\"/diagnostics/tests/coronavirus-test-sars-cov2-covid19-rtpcr-technique-604?src=header\" ]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[starts-with(text(),\"Select\")]")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

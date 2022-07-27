package practice11111111;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_sanket_window_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String p=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()=\"Jobs\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Companies\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Resources\"]")).click();
		
		Set<String> c=driver.getWindowHandles();
		Thread.sleep(2000);
		for(String o:c) 
		{
			String ti=driver.switchTo().window(o).getTitle();
	
		if(ti.contains("Browse Jobs by Company, Location, Skills")) 
		{    
			Thread.sleep(2000);
			WebElement el1=driver.findElement(By.xpath("//div[text()=\"Services\"]"));
			Thread.sleep(2000);
			el1.click();
	
		}
		else {
			Thread.sleep(2000);
			driver.close();
		}
			
		
	}

	}
}

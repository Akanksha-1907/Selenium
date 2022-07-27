package practice11111111;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukri_mock_window_popup
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Jobs\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Companies\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Services\"]")).click();
		
		String s1=driver.getWindowHandle();
		
		Set<String> s2=driver.getWindowHandles();
		
		for(String s:s2)
			
			{
				
			
			String t=driver.switchTo().window(s).getTitle();
			if(t.contains("Browse Jobs by Company, Location, Skills, Designation & Industry - Naukri.com"))
			{
				Thread.sleep(5000);
			driver.findElement(By.xpath("(//input[@rel=\"custom:1016\"])[1]")).sendKeys("TariPoha");
			Thread.sleep(10000);
			driver.close();			
			}
			else if(s.contains("Browse Jobs by Company - Jobs in Top Companies - Naukri.com"))
			{
				
				driver.close();
			}
			else
			{
				driver.close();
			}	
		}
		
	}
		
	}



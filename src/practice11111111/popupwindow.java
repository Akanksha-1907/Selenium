package practice11111111;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupwindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
		Thread.sleep(2000);
		//Step1: get address of main page
		String parentId=driver.getWindowHandle();
		
		//Step2: get address of child windows
		Set<String> childid=driver.getWindowHandles();
		
		//Step3: Switch focus of selenium from main page to child window
		for(String s:childid)
		{
			System.out.println(s);
			if(!s.equals(parentId))
			{
				driver.switchTo().window(s);
				driver.close();
			}
		}
		driver.switchTo().window(parentId);
		driver.close();
	}

		
	}



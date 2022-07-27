package practice11111111;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
	
		driver.findElement(By.xpath("//button[@id=\"newTabBtn\"]")).click();
	
		
		Set<String>c=driver.getWindowHandles();
		for(String s:c)
		{
			String t=driver.switchTo().window(s).getTitle();
			if(t.contains("https://www.hyrtutorials.com/p/basic-controls.html"))
			{
			driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Akanksha");
			Thread.sleep(2000);
			driver.close();
			}
			else if(t.contains("https://www.hyrtutorials.com/p/alertsdemo.html"))
			{
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		
	}
}

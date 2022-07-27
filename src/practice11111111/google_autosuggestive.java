package practice11111111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_autosuggestive 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("java");
		Thread.sleep(2000);
	    List<WebElement>L=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//ul//li"));
		Thread.sleep(2000);
	    String s="javatpoint";
		for(WebElement i:L)
		{
			
			if(s.equalsIgnoreCase(i.getText()))
			{
				i.click();
				break;
			}
		
		
	}
	}
}


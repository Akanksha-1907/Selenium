package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class search_java_ingoogle_without_clickmethod 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e=driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		e.sendKeys("java");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();       //OR //act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();  
		
		/*for(int i=1;i<=2;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);*/
		
		
		
		
	}

}

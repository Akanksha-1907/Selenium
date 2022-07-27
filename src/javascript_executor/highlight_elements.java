package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight_elements 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
	WebElement login=driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
	
	highlight(login, driver);
	}
	public static void highlight(WebElement element,WebDriver driver)
	{
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		String color=element.getCssValue("backgroundcolor");
		for(int i=0;i<=100;i++)
		{
			changeColor("rbg(0,200,0)",element,driver);
			changeColor(color,element,driver);
			
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.backgroundcolor = '"+color+"'",element );
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
	}

}

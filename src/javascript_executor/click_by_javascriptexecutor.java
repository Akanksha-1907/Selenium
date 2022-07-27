package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_by_javascriptexecutor
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	    WebElement login=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
	    driver.findElement(By.xpath("//a[text()='Login']"));
		
	    clickElementbyJSE(login, driver);
	}
	//Click on the element by JavascriptExecutor
    public static void clickElementbyJSE(WebElement element,WebDriver driver)
    {
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click();",element);
    }

}

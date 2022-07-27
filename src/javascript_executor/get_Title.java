package javascript_executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Title 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		System.out.println(getTitlebyJS(driver));
	}
	public static String getTitlebyJS(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String title=jse.executeScript("return document.title;").toString();
		return title;
	}

}

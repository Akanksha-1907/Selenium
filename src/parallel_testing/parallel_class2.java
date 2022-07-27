package parallel_testing;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel_class2 
{
	@Test
	public void flipkart() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	}

}

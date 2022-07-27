package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize_setPosition_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//setSize();
		Dimension d=new Dimension(500,250);
        driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getSize());
		
		//setPosition();
		Point p=new Point(250,450);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

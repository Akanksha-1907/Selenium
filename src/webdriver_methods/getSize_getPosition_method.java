package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize_getPosition_method
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		//getSize();   -->We get output on console.
		driver.get("https://www.youtube.com/");
		Dimension d=driver.manage().window().getSize();
		System.out.println(d);
		
		
		//getPosition();
		
		Point p=driver.manage().window().getPosition();
		System.out.println(p);
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}

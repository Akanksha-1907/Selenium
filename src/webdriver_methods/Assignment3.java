package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Step 1--->Open browser with Facebook webpage
		
		driver.get("https://www.facebook.com/");
		
		//Step 2-->Wait for 2 second and minimize window
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		//Step 3-->Wait for 1 second and chnage size of browser to width 1000 and height 700
		
		Thread.sleep(1000);
		Dimension d=new Dimension(1000,700);
		driver.manage().window().setSize(d);
		
		//Step 4-->Display title and Url of webpage
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//Step 5-->Wait for 2 second and navigate to flipkart
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
		//Step 6-->Refresh webpage
		
		driver.navigate().refresh();
		
		//Step 7-->Wait for 2 second and change position of browser
		
		Thread.sleep(2000);
		Point p=new Point(550,300);
		driver.manage().window().setPosition(p);
		
		//Step 8-->Wait for 2 second and anvigate back to facebook
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Step 9-->Verify that facebook webpage is opened.
		
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equalsIgnoreCase("facebook - log in or sign up"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		//Step 10-->Refresh webpage
		driver.navigate().refresh();
		
		//Step 11-->Wait for 2 second and close the browser
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}

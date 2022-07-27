package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Step 1--->Open Amazon Web browser
		
		driver.get("https://www.amazon.in/");
		
		//Step 2-->Wait for one second and change position of browser x-axis 400 and y-axis 200
		Thread.sleep(1000);
		Point p=new Point(400,200);
		driver.manage().window().setPosition(p);
		
		//Step 3-->Wait for two seconds and maximize the window
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Step 4-->Verify Amazon webpage is opened
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		//Step 5-->Wait for two second and navigate to flipkart
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		
		//Step 6-->Wait for two second and navigate to google
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");
		
		//Step 7-->Wait for two second and navigate to facebook
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		
		//Step 8-->Wait for two seconds and navigate back to flipkart
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().back();
		
		//Step 9-->Wait for two seconds and change size of browser to 700 width and 700 height.
		
		Thread.sleep(2000);
		Dimension d=new Dimension(700,700);
		driver.manage().window().setSize(d);
		
		//Step 10--->Wait for two seconds and navigate forward to facebook
		
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().forward();
		
		//Step 11-->Verify facebook webpage is opened
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("facebook - log in or sign up"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		
		//Step 12-->Refresh Webpage
		
		driver.navigate().refresh();
		
		//Step 13-->Wait for two seconds and close the browser
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Desktop\\Selenium_jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Step 1--->Open browser with google webpage
		
		driver.get("https://www.google.co.in/");
		//Step 2--->Verify that the google webpage is opened.
		
		String t=driver.getTitle();
		System.out.println(t);
		if(t.equalsIgnoreCase("google"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		
		//Step 3--->Wait for 2 seconds
		Thread.sleep(2000);
		
		//Step 4--->Change size of browser to 700 width and 700 height
		
		Dimension d=new Dimension(700,700);
		driver.manage().window().setSize(d);
		
		//Step 5--->Wait for 2 seconds and minimize the browser
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		//Step 6--->Wait for 2 seconds and maximize the browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//Step 7-->Close the browser
		driver.close();
		
		
	}

}
